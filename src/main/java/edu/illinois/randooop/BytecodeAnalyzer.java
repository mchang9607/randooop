package edu.illinois.randooop;

import java.io.File;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/*
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.NotFoundException;
//	*/

public class BytecodeAnalyzer {

	public Class<?> getClassObject(File file, String clsName) throws MalformedURLException, ClassNotFoundException {
		URL[] urls = new URL[] { file.toURI().toURL() };
		ClassLoader cl = new URLClassLoader(urls);
		Class<?> cls = cl.loadClass(clsName);
		
		return cls;
	}

	public Method[] getMethods(Class<?> cls) {
		return cls.getMethods();
	}
	
	/*
	public List<String> getControlAccessList() {
		// TODO: find a way to access publicity of methods
		return null;
	}
	//	*/
	
	public List<String> getNames(Method[] methods) {
		List<String> methodNames = new ArrayList<String>();
		for (Method method : methods) {
			methodNames.add(method.getName());
		}
		return methodNames;
	}

	public List<String> getReturnTypes(Method[] methods) {
		List<String> returnTypes = new ArrayList<String>();
		for (Method method : methods) {
			returnTypes.add(method.getAnnotatedReturnType().toString());
		}
		return returnTypes;
	}

	private List<String> getMethodParameters(Method method) {
		List<String> parameters = new ArrayList<String>();
		AnnotatedType[] annotatedParameters = method.getAnnotatedParameterTypes();
		for (AnnotatedType parameter : annotatedParameters) {
			parameters.add(parameter.toString());
		}
		return parameters;
	}
	
	public List<List<String>> getAllParameters(Method[] methods) {
		List<List<String>> parameters = new ArrayList<List<String>>();
		for (Method method : methods) {
			parameters.add(getMethodParameters(method));			
		}
		return parameters;
	}
	
	public List<String> generateCanonicalNames(List<String> names, List<List<String>> parameters) {
		List<String> canonicalNames = new ArrayList<String>();
		int length = names.size();
		for (int i = 0; i < length; i++) {
			String canonicalName = names.get(i) + "(";
			List<String> methodParameters = parameters.get(i);
			for (String parameter : methodParameters) {
				canonicalName += (parameter + ", ");
			}
			if (methodParameters.size() != 0) {
				canonicalName = canonicalName.substring(0, canonicalName.length() - 2);
			}
			canonicalName += ")";
			canonicalNames.add(canonicalName);
		}
		return canonicalNames;
	}
	
	public HashMap<String, MethodData> generateAPIList(
			List<String> names, List<String> returnTypes, List<List<String>> parameters) {
		HashMap<String, MethodData> api = new HashMap<String, MethodData>();
		// TODO: check if this is the right way to do this...
		assert(validateAPIInput(names, returnTypes, parameters));
		List<String> canonicalNames = generateCanonicalNames(names, parameters);
		int length = canonicalNames.size();
		
		for (int i = 0; i < length; i++) {
			MethodData md = new MethodData(names.get(i), canonicalNames.get(i), returnTypes.get(i), parameters.get(i));
			api.put(canonicalNames.get(i), md);
		}
		return api;
	}
	
	public HashMap<String, MethodData> generateAPIList(Class<?> cls) {
		Method[] methods = getMethods(cls);
		List<String> names = getNames(methods);
		List<String> returnTypes = getReturnTypes(methods);
		List<List<String>> parameters = getAllParameters(methods);
		return generateAPIList(names, returnTypes, parameters);
	}
	
	private boolean validateAPIInput(List<String> names, List<String> returnTypes, List<List<String>> parameters) {
		int expectedLength = names.size();
		List<Integer> lengths = new ArrayList<Integer>();
		lengths.add(returnTypes.size());
		lengths.add(parameters.size());	
		for (Integer length : lengths) {
			if (length != expectedLength) {
				return false;
			}
		}
		return true;
	}
	
	/*	
	public CtClass getCtClassObject() throws NotFoundException {
		ClassPool pool = ClassPool.getDefault();
		pool.appendClassPath("./");
		CtClass targetClass = pool.get("");
		return targetClass;
	}

	public CtMethod[] getCtMethods(CtClass targetClass) {
		CtMethod[] ctMethods = targetClass.getDeclaredMethods();
		return ctMethods;
	}

	public List<String> getMethodSignatures(CtMethod[] ctMethods) {
		List<String> signatures = new ArrayList<String>();
		for (CtMethod method : ctMethods) {
			signatures.add(method.getLongName());
		}
		return signatures;
	}

	public List<String> getMethodReturnTypes(CtMethod[] ctMethods) {
		List<String> returnTypes = new ArrayList<String>();
		String returnType;
		for (CtMethod method : ctMethods) {
			returnType = method.getGenericSignature();
			if (returnType == null) {
				returnType = method.getSignature();
			}
			returnTypes.add(returnType);
			returnType = null;
		}
		return returnTypes;
	}

	private String parseObjectName(String toParse) {
		toParse = toParse.replaceAll("<L", "<");
		toParse = toParse.replaceAll(";>", ">");
		toParse = toParse.substring(1, toParse.length() - 1);
		return toParse;
	}

	private String parsePrimitaveName(String toParse) {
		toParse = toParse.replaceAll("B", "byte");
		toParse = toParse.replaceAll("S", "short");
		toParse = toParse.replaceAll("I", "int");
		toParse = toParse.replaceAll("J", "long");
		toParse = toParse.replaceAll("F", "float");
		toParse = toParse.replaceAll("D", "double");
		toParse = toParse.replaceAll("C", "char");
		toParse = toParse.replaceAll("Z", "boolean");
		return toParse;
	}

	public List<String> parseReturnTypes(List<String> returnTypes) {
		List<String> parsed = new ArrayList<String>();
		for (String returnType : returnTypes) {
			parsed.add(returnType.replaceAll("\\(.*\\)", ""));
		}
		for (int i = 0; i < returnTypes.size(); i++) {
			String toParse = returnTypes.get(i);
			if (toParse.indexOf('L') != -1) {
				toParse = parseObjectName(toParse);
			} else {
				toParse = parsePrimitaveName(toParse);
			}
			while (toParse.charAt(0) == '[') {
				toParse = toParse.substring(1);
				toParse = toParse + "[]";
			}
			parsed.set(i, toParse);
		}
		return parsed;
	}

	List<List<String>> thisIsATestmethod(int[][] doubleArray) {

		return null;
	}

	protected String thisIsTestMethod2(int x) {
		return null;
	}

	public int thisIsAnotherTest(Integer y) {
		return 0;
	}
	//	*/
}