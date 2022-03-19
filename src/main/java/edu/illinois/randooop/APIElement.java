package edu.illinois.randooop;

import java.util.List;

public class APIElement {

	String canonicalName;
	
	APIElementType elementType;
	Boolean isConstructor;
	Boolean staticState;
	String returnType;
	String name;
	List<String> parameters;
	
	public APIElement(
			String canonicalName,
			Boolean isConstructor, Boolean staticState,
			String returnType, String name,
			List<String> parameters) {
		this.canonicalName = canonicalName;
		this.isConstructor = isConstructor;
		this.staticState = staticState;
		this.returnType = returnType;
		this.name = name;
		this.parameters = parameters;
	}
	
	public String getCanonicalName() {
		return canonicalName;
	}
	
	public List<String> getParams() {
		return parameters;
	}
	
	// TODO: getters for various fields?
	
	@Override
	public String toString() {
		String constructorOrMethod = "";
		if (isConstructor) {
			constructorOrMethod += "constructor";
		} else {
			constructorOrMethod += "method";
		}
		String str = 
				"canonical name: " + canonicalName + "\n" +
				"--------------------------------------------------\n" +
				"constructor/method: " + constructorOrMethod + "\n" +
				"static: " + staticState + "\n" +
				"name: " + name + "\n" + 
				"return type: " + returnType + "\n" +
				"parameters: " + "\n";
		for (String param : parameters) {
			str += ("\t" + param + "\n");
		}
		str += "--------------------------------------------------\n\n";
		return str;
	}
}
