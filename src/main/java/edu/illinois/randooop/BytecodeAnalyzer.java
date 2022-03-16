package edu.illinois.randooop;

import java.io.File;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BytecodeAnalyzer {
	
	/*
	// TODO? what about nested classes...
	public class ExampleTest {
		public void testFunc() {
			System.out.println();
		}
	}
	//	*/

	public Class<?> getClassObject(File file, String clsName) throws MalformedURLException, ClassNotFoundException {
		URL[] urls = new URL[] { file.toURI().toURL() };
		ClassLoader cl = new URLClassLoader(urls);
		Class<?> cls = cl.loadClass(clsName);
		
		return cls;
	}

	public Constructor<?>[] getConstructors(Class<?> cls) {
		return cls.getConstructors();
	}
	
	public Method[] getMethods(Class<?> cls) {
		return cls.getMethods();
	}
	
	public List<Boolean> getStaticStates(Executable[] executables, boolean areConstructors) {
		List<Boolean> staticStates = new ArrayList<Boolean>();
		if (areConstructors) {
			int size = executables.length;
			for (int i = 0; i < size; i++) {
				staticStates.add(false);
			}
			return staticStates;
		}
		for (Executable exe : executables) {
			if (exe.getAnnotatedReceiverType() == null) {
				staticStates.add(true);
			} else {
				staticStates.add(false);
			}
		}
		return staticStates;
	}
	
	public List<String> getNames(Executable[] executables) {
		List<String> exeNames = new ArrayList<String>();
		for (Executable exe : executables) {
			exeNames.add(exe.getName());
		}
		return exeNames;
	}

	public List<String> getReturnTypes(Executable[] executables) {
		List<String> returnTypes = new ArrayList<String>();
		for (Executable exe : executables) {
			returnTypes.add(exe.getAnnotatedReturnType().toString());
		}
		return returnTypes;
	}

	private List<String> getExecutableParameters(Executable executable) {
		List<String> parameters = new ArrayList<String>();
		AnnotatedType[] annotatedParameters = executable.getAnnotatedParameterTypes();
		for (AnnotatedType parameter : annotatedParameters) {
			parameters.add(parameter.toString());
		}
		return parameters;
	}
	
	public List<List<String>> getAllParameters(Executable[] executables) {
		List<List<String>> parameters = new ArrayList<List<String>>();
		for (Executable exe : executables) {
			parameters.add(getExecutableParameters(exe));			
		}
		return parameters;
	}
	
	private List<String> generateCanonicalNames(List<String> names, List<List<String>> parameters) {
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
	
	private boolean validateAPIInput(
			List<String> names, List<String> returnTypes, List<Boolean> staticStates, List<List<String>> parameters) {
		int expectedLength = names.size();
		List<Integer> lengths = new ArrayList<Integer>();
		lengths.add(returnTypes.size());
		lengths.add(staticStates.size());
		lengths.add(parameters.size());
		for (Integer length : lengths) {
			if (length != expectedLength) {
				return false;
			}
		}
		return true;
	}
	
	private void insertAPIKeyPairs(HashMap<String, ExecutableData> api,
			boolean isConstructor,List<Boolean> staticStates,  
			List<String> returnTypes, List<String> names, List<List<String>> parameters) {
		
		// TODO: check if this is the right way to do this...
		assert(validateAPIInput(names, returnTypes, staticStates, parameters));
		
		List<String> canonicalNames = generateCanonicalNames(names, parameters);
		int length = canonicalNames.size();
		
		for (int i = 0; i < length; i++) {
			ExecutableData exeData = new ExecutableData(canonicalNames.get(i),
					isConstructor, staticStates.get(i),
					returnTypes.get(i), names.get(i), parameters.get(i));
			api.put(canonicalNames.get(i), exeData);
		}
	}
	
	public HashMap<String, ExecutableData> generateAPIList(Class<?> cls) {
		HashMap<String, ExecutableData> api = new HashMap<String, ExecutableData>();
		Constructor<?>[] constructors = getConstructors(cls);
		List<String> constructorNames = getNames(constructors);
		List<String> constructorReturnTypes = getReturnTypes(constructors);
		List<Boolean> constructorNotStatic = getStaticStates(constructors, true);
		List<List<String>> constructorParameters = getAllParameters(constructors);
		insertAPIKeyPairs(api, true, constructorNotStatic, constructorReturnTypes, constructorNames,constructorParameters);
		
		Method[] methods = getMethods(cls);
		List<String> methodNames = getNames(methods);
		List<String> methodReturnTypes = getReturnTypes(methods);
		List<Boolean> methodStaticStates = getStaticStates(methods, false);
		List<List<String>> methodParameters = getAllParameters(methods);
		insertAPIKeyPairs(api, false, methodStaticStates, methodReturnTypes, methodNames, methodParameters);
		
		return api;
	}
	
}