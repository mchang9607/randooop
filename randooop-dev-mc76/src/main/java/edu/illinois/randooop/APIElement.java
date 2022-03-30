package edu.illinois.randooop;

import java.util.List;

public class APIElement {

	private final String canonicalName;
	
	private final String parentClass;
	private final Boolean constructor;
	private final Boolean staticState;
	private final String returnType;
	private final String name;
	private final List<String> parameters;
	
	public APIElement(
			String canonicalName,
			String parentClass,
			Boolean constructor, Boolean staticState,
			String returnType, String name,
			List<String> parameters) {
		this.canonicalName = canonicalName;
		this.parentClass = parentClass;
		this.constructor = constructor;
		this.staticState = staticState;
		this.returnType = returnType;
		this.name = name;
		this.parameters = parameters;
	}
	
	public String getCanonicalName() {
		return this.canonicalName;
	}
	
	public String getParentClass() {
		return this.parentClass;
	}
	
	public String getReturnType() {
		return this.returnType;
	}
	
	public List<String> getParams() {
		return this.parameters;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Boolean isConstructor() {
		return this.constructor;
	}
	
	public Boolean isStatic() {
		return this.staticState;
	}
	
	// TODO: getters for various fields?
	
	@Override
	public String toString() {
		String constructorOrMethod = "";
		if (constructor) {
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
