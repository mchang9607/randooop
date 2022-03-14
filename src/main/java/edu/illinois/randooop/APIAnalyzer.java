package edu.illinois.randooop;

import java.io.File;
import java.util.List;
import javassist.CtClass;

public interface APIAnalyzer {
	public CtClass getClassObject();
	public List<String> getMethodSignatures();
	public List<String> getMethodNames();
	public List<List<String>> getMethodArguments();
	public List<String> getMethodReturnTypes();
}
