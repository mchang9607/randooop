package edu.illinois.randooop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class PoolElement {
	final String testSequence;
	final HashSet<String> returnTypes;
	final HashSet<String> varNames;
	final HashMap<String, List<String>> typeToVarNameMap;

	public PoolElement(String testSequence, String returnType, String varName) {
		this.testSequence = testSequence;
		
		HashSet<String> returnTypes = new HashSet<String>();
		returnTypes.add(returnType);
		this.returnTypes = returnTypes;
		
		HashSet<String> varNames = new HashSet<String>();
		varNames.add(varName);
		this.varNames = varNames;
		
		HashMap<String, List<String>> typeToVarNameMap = new HashMap<String, List<String>>();
		List<String> varNamesList = new ArrayList<String>();
		varNamesList.add(varName);
		typeToVarNameMap.put(returnType, varNamesList);
		this.typeToVarNameMap = typeToVarNameMap;
	}
	
	public PoolElement(PoolElement parent, String testSequence, String returnType, String varName) {
		this.testSequence = testSequence;
		
		HashSet<String> returnTypes = new HashSet<String>();
		returnTypes.addAll(parent.getReturnTypes());
		returnTypes.add(returnType);
		this.returnTypes = returnTypes;
		
		HashSet<String> varNames = new HashSet<String>();
		varNames.addAll(parent.getVarNames());
		varNames.add(varName);
		this.varNames = varNames;
		
		HashMap<String, List<String>> typeToVarNameMap = new HashMap<String, List<String>>();
		typeToVarNameMap.putAll(parent.getTypeToVarNameMap());
		List<String> varNamesList = new ArrayList<String>();
		if (typeToVarNameMap.containsKey(returnType)) {
			varNamesList.addAll(typeToVarNameMap.get(returnType));
		}
		varNamesList.add(varName);
		typeToVarNameMap.put(returnType, varNamesList);
		this.typeToVarNameMap = typeToVarNameMap;
	}
	
	public String getSequence() {
		return this.testSequence;
	}
	
	public HashSet<String> getReturnTypes() {
		return this.returnTypes;
	}
	
	public HashSet<String> getVarNames() {
		return this.varNames;
	}
	
	public HashMap<String, List<String>> getTypeToVarNameMap() {
		return this.typeToVarNameMap;
	}

}
