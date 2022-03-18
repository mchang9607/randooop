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

/**
 * Simple Java bytecode analyzer. Used to extract API information focusing on
 * publicly accessible executables (constructors and methods). Returned
 * information are mostly represented as List of either Strings or Booleans.
 * Functionality contain: 1. static state of executable 2. return type of
 * executable 3. executable name 4. executable parameters
 * 
 * Note that this parser requires the knowledge of the package's canonical name.
 * 
 * @author Michael Chang
 *
 */
public class BytecodeAnalyzer {

	/*
	 * // TODO? what about nested classes... public class ExampleTest { public void
	 * testFunc() { System.out.println(); } } //
	 */

	/**
	 * Given the path to the bytecode to be tested with its dependencies, this
	 * function will extract the class object using the given class name. Note that
	 * the class name must be the canonical class name, that is, contain the path of
	 * what package it belongs to.
	 * 
	 * @param path    path containing class files.
	 * @param clsName canonical name of class.
	 * @return Class object loaded using clsName.
	 * @throws MalformedURLException
	 * @throws ClassNotFoundException is thrown due to an incorrect path, class
	 *                                name, or if the class does not exist.
	 */
	public Class<?> getClassObject(File path, String clsName) throws MalformedURLException, ClassNotFoundException {
		URL[] urls = new URL[] { path.toURI().toURL() };
		ClassLoader cl = new URLClassLoader(urls);
		Class<?> cls = cl.loadClass(clsName);

		return cls;
	}

	/**
	 * Getter function for the given classes constructors.
	 * 
	 * @param cls given class
	 * @return all constructors that exist in the class. If no declared constructor
	 *         exists, the inherited constructor is added.
	 */
	public List<Executable> getConstructors(Class<?> cls) {
		List<Executable> constructors = new ArrayList<Executable>();
		//Constructor<?>[]  = cls.getConstructors();		
		
		return constructors;
	}

	/**
	 * Getter function for the given classes public methods.
	 * 
	 * @param cls given class.
	 * @return all public methods that exist in the class.
	 */
	public List<Executable> getMethods(Class<?> cls) {
		List<Executable> methods = new ArrayList<Executable>();
		Method[] publicMethods = cls.getMethods();
		Method[] declaredMethods = cls.getDeclaredMethods();
		
		for (Method publicMethod : publicMethods) {
			for (Method declaredMethod : declaredMethods) {
				if (publicMethod.equals(declaredMethod)) {
					methods.add(publicMethod);
				}
			}
		}
		return methods;
	}

	/**
	 * Given a list of executables, determines whether each executable is static or
	 * not. Note that this is under the assumption that constructors that we care
	 * for are top level classes. This implies that they will not be static.
	 * 
	 * @param executables     input list of executables.
	 * @param areConstructors determines whether the given list contains methods.
	 * @return A list of the static states of each executable. Returns a list of
	 *         False if areConstructors is true.
	 */
	public List<Boolean> getStaticStates(List<Executable> executables, boolean areConstructors) {
		List<Boolean> staticStates = new ArrayList<Boolean>();
		if (areConstructors) {
			int size = executables.size();
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

	/**
	 * Returns a list of the names of each executable. For constructors, the name is
	 * canonical.
	 * 
	 * @param executables input list.
	 * @return list of names of executables.
	 */
	public List<String> getNames(List<Executable> executables) {
		List<String> exeNames = new ArrayList<String>();
		for (Executable exe : executables) {
			exeNames.add(exe.getName());
		}
		return exeNames;
	}

	/**
	 * Determines the return type of each executable in the input list.
	 * 
	 * @param executables input list.
	 * @return list of corresponding return types.
	 */
	public List<String> getReturnTypes(List<Executable> executables) {
		List<String> returnTypes = new ArrayList<String>();
		for (Executable exe : executables) {
			returnTypes.add(exe.getAnnotatedReturnType().toString());
		}
		return returnTypes;
	}

	/**
	 * Helper function that gets the parameters of an executable.
	 * 
	 * @param executable target
	 * @return list of parameters in the format of strings.
	 */
	private List<String> getExecutableParameters(Executable executable) {
		List<String> parameters = new ArrayList<String>();
		AnnotatedType[] annotatedParameters = executable.getAnnotatedParameterTypes();
		for (AnnotatedType parameter : annotatedParameters) {
			parameters.add(parameter.toString());
		}
		return parameters;
	}

	/**
	 * Extracts a list of parameter information given a list of executables.
	 * 
	 * @param executables input list of executables.
	 * @return a list of parameter information that's order corresponds to the input
	 *         list.
	 */
	public List<List<String>> getAllParameters(List<Executable> executables) {
		List<List<String>> parameters = new ArrayList<List<String>>();
		for (Executable exe : executables) {
			parameters.add(getExecutableParameters(exe));
		}
		return parameters;
	}

	/**
	 * Joins the executable name and parameters with the specified format to
	 * generate a canonical name of the executable.
	 * 
	 * @param names      list of executable names
	 * @param parameters list of parameter information
	 * @return list of canonical names in the specified format.
	 */
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

	/**
	 * Verifies that the inputs lists for generating an API have the same length.
	 * 
	 * @param names        input list.
	 * @param returnTypes  input list.
	 * @param staticStates input list.
	 * @param parameters   input list.
	 * @return true if valid input, false elsewise.
	 */
	private boolean validateAPIInput(List<String> names, List<String> returnTypes, List<Boolean> staticStates,
			List<List<String>> parameters) {
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

	/**
	 * Inserts Key-Value pairs into the given HashMap using the input information.
	 * Each Key is the canonical name of the executable, while the corresponding
	 * value is a ExecutableData class object that represents the information of the
	 * executable.
	 * 
	 * @param api           input HashMap.
	 * @param isConstructor input list.
	 * @param staticStates  input list.
	 * @param returnTypes   input list.
	 * @param names         input list.
	 * @param parameters    input list.
	 */
	private void insertAPIKeyPairs(HashMap<String, ElementData> api, boolean isConstructor,
			List<Boolean> staticStates, List<String> returnTypes, List<String> names, List<List<String>> parameters) {

		// TODO: check if this is the right way to do this...
		assert (validateAPIInput(names, returnTypes, staticStates, parameters));

		List<String> canonicalNames = generateCanonicalNames(names, parameters);
		int length = canonicalNames.size();

		for (int i = 0; i < length; i++) {
			ElementData exeData = new ElementData(canonicalNames.get(i), isConstructor, staticStates.get(i),
					returnTypes.get(i), names.get(i), parameters.get(i));
			api.put(canonicalNames.get(i), exeData);
		}
	}

	/**
	 * Generates an API for the given class. Represents this with a HashMap, where
	 * the key represents the canonical name of a executable, while the value
	 * represents the required information in order to call it.
	 * 
	 * @param cls input class.
	 * @return API in the format of a HashMap.
	 */
	public HashMap<String, ElementData> generateAPIList(Class<?> cls) {
		HashMap<String, ElementData> api = new HashMap<String, ElementData>();
		List<Executable> constructors = getConstructors(cls);
		List<String> constructorNames = getNames(constructors);
		List<String> constructorReturnTypes = getReturnTypes(constructors);
		List<Boolean> constructorNotStatic = getStaticStates(constructors, true);
		List<List<String>> constructorParameters = getAllParameters(constructors);
		insertAPIKeyPairs(api, true, constructorNotStatic, constructorReturnTypes, constructorNames,
				constructorParameters);

		List<Executable> methods = getMethods(cls);
		List<String> methodNames = getNames(methods);
		List<String> methodReturnTypes = getReturnTypes(methods);
		List<Boolean> methodStaticStates = getStaticStates(methods, false);
		List<List<String>> methodParameters = getAllParameters(methods);
		insertAPIKeyPairs(api, false, methodStaticStates, methodReturnTypes, methodNames, methodParameters);

		return api;
	}

}