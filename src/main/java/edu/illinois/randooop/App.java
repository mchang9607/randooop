package edu.illinois.randooop;

import java.io.File;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;



/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
    	
        try {
        	File file = new File("./");
        	BytecodeAnalyzer bca = new BytecodeAnalyzer();
        	HashMap<String, MethodData> metadata = bca.generateAPIList(bca.getClassObject(file, "edu.illinois.randooop.BytecodeAnalyzer"));
        	for (String key : metadata.keySet()) {
        		System.out.println("Key: " + key);
        		System.out.println("Value:\n" + metadata.get(key));
        		System.out.println();
        	}
        	/*
        	URL url = file.toURI().toURL();
        	URL[] urls = new URL[] {url};
        	ClassLoader cl = new URLClassLoader(urls);
        	Class<?> cls = cl.loadClass("edu.illinois.randooop.BytecodeAnalyzer");
        	Method[] methods = cls.getMethods();
        	for (Method method : methods) {
        		//System.out.println(method.getReturnType().toGenericString());
        		//System.out.println(method.getReturnType());
        		System.out.println(method.getName());
        		System.out.println(method.toString());
        		System.out.println(method.toGenericString());
        		AnnotatedType[] p = method.getAnnotatedParameterTypes();
        		for (AnnotatedType a : p) {
        			System.out.println(a.toString());
        		}
        	//	*/
        	
        	
         	
        } catch (Exception e) {
        	System.out.println("File Error");
        	e.printStackTrace();
        }
    }
}
