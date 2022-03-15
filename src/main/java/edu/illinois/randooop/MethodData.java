package edu.illinois.randooop;

import java.util.List;

public class MethodData {
	/*
	public enum controlAccessStatus {
		PUBLIC, PRIVATE, PROTECTED, NONE
	}
	controlAccessStatus controlAccess;
	//	*/
	String name;
	String canonicalName;
	String returnType;
	List<String> methodParameters;
	public MethodData(String name, String canonicalName, String returnType, List<String> methodParameters) {
		this.name = name;
		this.canonicalName = canonicalName;
		this.returnType = returnType;
		this.methodParameters = methodParameters;
	}
	
	@Override
	public String toString() {
		String str = "";
		str += ("name: " + name + "\n");
		str += ("return type: " + returnType + "\n");
		str += ("parameters: " + "\n");
		for (String param : methodParameters) {
			str += ("\t" + param + "\n");
		}
		return str;
	}
}
