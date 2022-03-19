package edu.illinois.randooop;

import java.io.File;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
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
        	
        	File file = new File("/home/bernkastel79/Downloads/joda-time-2.10.13/");
        	//File file = new File("/home/bernkastel79/Downloads");
        	BytecodeAnalyzer bca = new BytecodeAnalyzer();
        	Class<?> cls = bca.getClassObject(file, "org.joda.time.Days");
        	//System.out.println(bca.generateAPIList(cls));
        	
        	HashSet<String> s1 = new HashSet<String>();
        	HashSet<String> s2 = new HashSet<String>();
        	s1.add("hello");
        	s2.addAll(s1);
        	List<String> help = new ArrayList<String>();
        	help.addAll(s2);
        	for (String str: help) {
        		System.out.println(str);
        	}
        	
        	/*        	
         	Field[] fields = cls.getFields();
         	for (Field field : fields) {
         		System.out.println(field.toString());
         	}
        	
        	/*
        	Method[] methods = bca.getMethods(cls);
        	
        	for (Method method : methods) {
        		System.out.println(method.getName());
        		System.out.println(method.getAnnotatedReturnType());
        		System.out.println(method.getAnnotatedReceiverType());
        	}
        	
        	//	*/
        	
        	
         	
        } catch (Exception e) {
        	System.out.println("File Error");
        	e.printStackTrace();
        }
    }
}
