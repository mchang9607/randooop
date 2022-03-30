package edu.illinois.randooop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class PoolElement {
	private final String code;
	private final String assignments;
	private final HashSet<String> returnTypes;
	private final HashSet<String> varNames;
	private final HashMap<String, List<String>> typeToVarNameMap;

	/**
	 * Constructor of PoolElement built from scratch.
	 * That is, a PoolElement constructed with this constructor has not "parent".
	 * The purpose of such a constructor is to initialize the pool.
	 * It is hence expected that returnType should be a primitive type.
	 * Note that this constructor does not prune void return types due to the purpose of its design.
	 */
	public PoolElement(String code, String assignments, 
			String returnType, String varName) {
		this.code = code;
		this.assignments = assignments;
		
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
	
	public PoolElement(String code, String assignments,
			HashSet<String> returnTypes, HashSet<String> varNames, HashMap<String, List<String>> typeToVarNameMap) {
		this.code = code;
		this.assignments = assignments;
		this.returnTypes = returnTypes;
		this.varNames = varNames;
		this.typeToVarNameMap = typeToVarNameMap;
	}
		
	public String getCode() {
		return this.code;
	}
	
	public String getAssignments() {
		return this.assignments;
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
