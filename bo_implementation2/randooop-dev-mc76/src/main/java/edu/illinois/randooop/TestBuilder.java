package edu.illinois.randooop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class TestBuilder {
	HashMap<String, APIElement> api;
	List<String> callableList;
	// TODO: Something to keep track of generated sequences.
	// information needed will contain:
	// 1. Sequence chose from pool for calling method
	// 2. Called Method
	// 3. chosen return type variable name
	// HashSet<HashSet<String>> generatedSequences;
	TestPool pool;

	private Random rand;
	private final char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	
	public String generateVarname() {
		return "" + alphabet[rand.nextInt(alphabet.length)] + rand.nextInt(1, 100);
	}

	public TestBuilder(HashMap<String, APIElement> api, TestPool pool) {
		this.api = api;
		this.pool = pool;
		callableList = new ArrayList<String>(api.keySet());
		rand = new Random();
	}

	private List<String> determineRequirements(APIElement element) {
		List<String> requirements = new ArrayList<String>();
		requirements.addAll(element.getParams());
		// callables require receivers unless they are static or constructors
		if ((!element.isConstructor()) && (!element.isStatic())) {
			if (!requirements.contains(element.getParentClass())) {
				requirements.add(element.getParentClass());
			}
		}
		return requirements;
	}

	private APIElement getCallable() {
		APIElement callable;
		List<String> requirements;
		int apiSize = api.size();
		for (int i = 0; i < apiSize; i++) {
			callable = api.get(callableList.get(rand.nextInt(callableList.size())));
			requirements = determineRequirements(callable);
			if (pool.hasReturnTypes(requirements)) {
				return callable;
			}
			requirements.clear();
		}
		
		int index = rand.nextInt(apiSize);
		int direction = index % 2 == 0 ? 1 : -1;
		for (int i = 0; i < apiSize; i++) {
			callable = api.get(callableList.get(index));
			requirements = determineRequirements(callable);
			if (pool.hasReturnTypes(requirements)) {
				return callable;
			}
			
			index = Math.floorMod((index + direction), apiSize);
			requirements.clear();
		}
		System.out.println("In TestBuilder.getCallable. No callable found...");
		// this should never happen...
		return null;
	}

	private List<PoolElement> getArgsData(APIElement element) {
		List<String> params = element.getParams();
		List<PoolElement> argsData = new ArrayList<PoolElement>();
		for (String param : params) {
			argsData.add(pool.getElement(param));
		}
		return argsData;
	}
	
	private void updatePoolElement(PoolElement element,
			HashSet<String> returnTypes, HashSet<String> varNames, HashMap<String, List<String>> typeToVarNameMap) {
		returnTypes.addAll(element.getReturnTypes());
		varNames.addAll(element.getVarNames());
		Set<String> newKeys = element.getTypeToVarNameMap().keySet();
		for (String key : newKeys) {
			if (typeToVarNameMap.containsKey(key)) {
				typeToVarNameMap.get(key).addAll(element.getTypeToVarNameMap().get(key));
			} else {
				List<String> varNamesOfType = new ArrayList<String>(element.getTypeToVarNameMap().get(key));
				typeToVarNameMap.put(key, varNamesOfType);
			}
		}
	}

	private void preparePoolElement(List<PoolElement> argsData,
			HashSet<String> returnTypes, HashSet<String> varNames, HashMap<String, List<String>> typeToVarNameMap) {
		for (PoolElement argData : argsData) {
			updatePoolElement(argData, returnTypes, varNames, typeToVarNameMap);
		}
	}
	
	private String buildIncrementCode(String newVarName, String receiver, String call) {
		String incrementCode = "";
		if (newVarName != null) {
			incrementCode = newVarName + " = ";
		}
		incrementCode += (receiver + call + ";\n");
		
		return incrementCode;
	}

	private String buildAssignments(List<PoolElement> argsData, String incrementCode) {
		String assignments = "";
		for (PoolElement argData : argsData) {
			assignments += argData.getAssignments();
		}
		assignments += incrementCode;
		return assignments;
	}
	
	private String buildDeclarations(HashMap<String, List<String>> typeToVarNameMap) {
		HashSet<String> definedVars = new HashSet<String>();
		String declarations = "";
		Set<String> types = typeToVarNameMap.keySet();
		for (String type : types) {
			List<String> varNamesOfType = typeToVarNameMap.get(type);
			for (String varName : varNamesOfType) {
				if (!definedVars.contains(varName)) {
					definedVars.add(varName);
					declarations += (type + " " + varName + ";\n");
				}
			}
		}
		
		return declarations;
	}
	
	private String getNewVarName(APIElement element, HashSet<String> varNames) {
		String newVarName = null;
		if (!element.getReturnType().equals("void")) {
			while (varNames.contains(newVarName) || newVarName == null) {
				newVarName = generateVarname();
				//System.out.println(newVarName);
			}
		}
		//System.out.println(newVarName);
		return newVarName;
	}
	
	private String setReceiver(APIElement element, List<PoolElement> parents,
			HashSet<String> returnTypes, HashSet<String> varNames, HashMap<String, List<String>> typeToVarNameMap) {
		String receiverStr;
		if (element.isStatic()) {
			receiverStr = element.getParentClass();
			receiverStr += ".";
		} else if (element.isConstructor()) {
			receiverStr = "new ";
		}  else {
			PoolElement receiverParent = pool.getElement(element.getParentClass());
			updatePoolElement(receiverParent, returnTypes, varNames, typeToVarNameMap);
			parents.add(receiverParent);
			List<String> nameCandidates = receiverParent.getTypeToVarNameMap().get(element.getParentClass());
			receiverStr = nameCandidates.get(rand.nextInt(nameCandidates.size()));
			receiverStr += ".";
		}
		return receiverStr;
	}
	
	private String setCallable(APIElement callable, List<PoolElement> argsData, String varName,
			HashSet<String> returnTypes, HashSet<String> varNames, HashMap<String, List<String>> typeToVarNameMap) {
		// update of fields used for building PoolElement required
		if (varName != null) {
			String returnType = callable.getReturnType();
			returnTypes.add(returnType);
			varNames.add(varName);
			if (typeToVarNameMap.keySet().contains(returnType)) {
				typeToVarNameMap.get(returnType).add(varName);
			} else {
				List<String> varNamesOfType = new ArrayList<String>();
				varNamesOfType.add(varName);
				typeToVarNameMap.put(returnType, varNamesOfType);
			}
		}
		
		String call = callable.getName() + "(";
		List<String> params = callable.getParams();
		List<String> argNames = new ArrayList<String>();
		
		for (int i = 0; i < params.size(); i++) {
			List<String> candidateArgNames = argsData.get(i).getTypeToVarNameMap().get(params.get(i));
			argNames.add(candidateArgNames.get(rand.nextInt(candidateArgNames.size())));
		}
		
		for (String arg : argNames) {
			call = call + arg + ", ";
		}
		if (argNames.size() != 0) {
			call = call.substring(0, call.length() - 2);
		}
		call += ")";
		
		return call;
	}

	public PoolElement generateNewTest() {
		APIElement increment = getCallable();
		List<PoolElement> argsData = getArgsData(increment);
		
		List<PoolElement> parents = new ArrayList<PoolElement>(argsData);
		HashSet<String> returnTypes = new HashSet<String>();
		HashSet<String> varNames = new HashSet<String>();
		HashMap<String, List<String>> typeToVarNameMap = new HashMap<String, List<String>>();
		preparePoolElement(parents, returnTypes, varNames, typeToVarNameMap);
		
		String newVarName = getNewVarName(increment, varNames);
		String receiver = setReceiver(increment, parents, returnTypes, varNames, typeToVarNameMap);
		String call = setCallable(increment, argsData, newVarName, returnTypes, varNames, typeToVarNameMap);
		
		String incrementCode = buildIncrementCode(newVarName, receiver, call);
		String assignments = buildAssignments(parents, incrementCode);
		String declarations = buildDeclarations(typeToVarNameMap);
		String code = declarations + assignments;
		
		PoolElement test = new PoolElement(code, assignments, returnTypes, varNames, typeToVarNameMap);
		return test;
	}

	public String getTestString(PoolElement test) {		
		return test.getCode();
	}

}
