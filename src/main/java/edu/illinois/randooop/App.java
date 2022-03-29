package edu.illinois.randooop;

import java.io.File;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import org.objectweb.asm.ClassReader;
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
        	
        	File dir = new File("/home/bernkastel79/Downloads/schoolwork/lmz/joda-time-2.10.13/");
        	File actualDirLol = new File("/home/bernkastel79/Downloads/schoolwork/lmz/joda-time-2.10.13/org/joda/time");
        	File[] classes = actualDirLol.listFiles();
        	//File file = new File("/home/bernkastel79/Downloads");
        	BytecodeAnalyzer bca = new BytecodeAnalyzer();
        	String packageName = "org.joda.time.";
        	HashMap<String, APIElement> api = new HashMap<String, APIElement>();
        	/*
        	for (File name : classes) {
        		System.out.println(name.getName());
        	}
        	//	*/
        	for (File file: classes) {
        		if (file.getName().contains(".class")) {
        			String className = packageName + file.getName().replace(".class", "");
        			//System.out.println(className);
        			Class<?> cls = bca.getClassObject(dir, className);
        			
        			api.putAll(bca.generateAPIList(cls));
        		}
        	}
        	List<String> list = new ArrayList<String>();
        	TestPool tp = new TestPool(null);
        	TestBuilder tb = new TestBuilder(api, tp);
        	PoolElement pe;
        	for (int i = 0; i < 10; i++) {
        		pe = tb.generateNewTest();
        		System.out.println(tb.getTestString(pe));
        		tp.addElement(pe);
        	}
        	
        	//System.out.println(api);
        	//Class<?> cls = bca.getClassObject(file, "org.joda.time.Days");
        	//System.out.println(bca.generateAPIList(cls));
        	
        	//BytecodeParser bp = new BytecodeParser();
        	//ClassPool classPool = bp.initClassPool("/home/bernkastel79/Desktop/");
        	//CtClass cc = bp.getClass(classPool, "DateTime");
        	//System.out.println(cc);
        	//ClassReader cr = new ClassReader("/home/bernkastel79/Downloads/joda-time-2.10.13/org/joda/time/DateMidnight.class");
        	//System.out.println(cr.toString());
        	
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
