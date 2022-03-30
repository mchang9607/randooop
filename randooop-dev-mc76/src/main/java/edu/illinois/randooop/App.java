package edu.illinois.randooop;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
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


import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

import org.apache.commons.io.FileUtils;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.dom.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.dom.ASTParser;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;



/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
    	
        try {
      
//        	System.out.println("Working Directory = " + System.getProperty("user.dir"));
       	    
       	    ASTParser parser = ASTParser.newParser(AST.JLS8);
        	
        	
        	File dir = new File("E:\\360Downloads\\joda-time-2.10.13/");
        	File actualDirLol = new File("E:\\\\360Downloads\\\\joda-time-2.10.13/org/joda/time");
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
        	PoolElement prim = new PoolElement("int x;\nx=10;\n", "x=10;\n", "int", "x");
        	List<PoolElement> initializer = new ArrayList<PoolElement>();
        	initializer.add(prim);
        	TestPool tp = new TestPool(initializer);
        	TestBuilder tb = new TestBuilder(api, tp);
        	PoolElement pe;
        	//System.out.println(tp.listOfTypes);
        	for (int i = 0; i < 300; i++) {
        		pe = tb.generateNewTest();
        		//System.out.println(pe.getCode());
        		//System.out.println();
        		tp.addElement(pe);
        	}
        	
        	
  
        	
        	
        //test file initialized 
            long end =System.currentTimeMillis();   
            long elapsedTime = 0;
            
            //no
            PrintWriter normal_writer1 =null; 
            normal_writer1 = new PrintWriter(new File("normal_behavior.txt")); 
      		 String str = 
      				 "/**" + "\r\n"
      				 + " *" + "\r\n"
      				 + " */" + "\r\n"
      				 + "public class "+"className"+"Test {";
      		 normal_writer1.println(str);
      		 normal_writer1.flush();
            
      		 
      	   PrintWriter error_writer1 =null; 
      	   error_writer1 = new PrintWriter(new File("error_behavior.txt")); 	 
      	   error_writer1.println(str);
      	   error_writer1.flush(); 
      	 //test file initialized end
        	
      	   
      	   
      	   
      	   
      	   
      String fileContent;
      	
      File root = new File("./target"); 
   	  File sourceFile = new File(root, "./classes/edu/illinois/randooop/TestJunit.java");
      sourceFile.getParentFile().mkdirs();
      
      
      
      	 
      JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
  	  int compilerResult ;
  	  URLClassLoader classLoader ;
  	  File myObj;
  	  Class<?> junitTest;
  	  Result result;
  	  JUnitCore junit = new JUnitCore();
  	  
 
	   sourceFile.getParentFile().mkdirs();   
       FileWriter fileWriter = new FileWriter("./target/classes/edu/illinois/randooop/TestJunit.java");
       PrintWriter printWriter = new PrintWriter(fileWriter);
       
      	 
      	 int i=0;
        	for (PoolElement element : tp.pool) {

        		
     		    fileContent = "package edu.illinois.randooop;\r\n"
   			   		+ "import org.junit.Test;\r\n"
   			   		+ "\r\n"
   			   		+ "import static org.junit.Assert.assertArrayEquals;\r\n"
   			   		+ "import static org.junit.Assert.assertEquals;\r\n"
   			   		+ "import static org.junit.Assert.assertFalse;\r\n"
   			   		+ "import static org.junit.Assert.assertNotNull;\r\n"
   			   		+ "import static org.junit.Assert.assertNotSame;\r\n"
   			   		+ "import static org.junit.Assert.assertNull;\r\n"
   			   		+ "import static org.junit.Assert.assertSame;\r\n"
   			   		+ "import static org.junit.Assert.assertTrue;\r\n"
   			   		+ "\r\n"
   			   		+ "public class TestJunit {\r\n"
   			   		+ "	@Test\r\n"
   			   		+ "		\r\n"
   			   		+ "	   public void TestJunit() {\r\n"
   			   		+      element.getCode().indent(14)
   			   		+ "	   }\r\n"
   			   		+ "\r\n"
   			   		+ "	\r\n"
   			   		+ "	\r\n"
   			   		+ "}\r\n"
   			   		+ "";

//        		System.out.println(fileContent);	
        		parser.setSource(fileContent.toCharArray());
        		parser.setKind(ASTParser.K_COMPILATION_UNIT);
        		final CompilationUnit cu = (CompilationUnit) parser.createAST(null);
        		ArrayList<String> variables = new ArrayList<String>();
        		cu.accept(new ASTVisitor() {

        		    public boolean visit(VariableDeclarationFragment var) {

        		    	variables.add(var.getName().toString());

        		        return false;
        		    }

        		});
        		
        	
        		MethodInvocation operationContract = null;
        		

        		AST ast = cu.getAST();
//        		int number=variables.size();
        		if(variables.size()==0) {
        			continue;
        		}
        		
        		System.out.print(variables.size()); 
        		String varName=variables.get(0);
        		
        		
        		
        		
        	 int randomOC = ThreadLocalRandom.current().nextInt(0, 4);
        		
        		switch(randomOC) {
//        		• o.equals(o)==true / assertTrue(o.equals(o))
        			case 0: {
        				MethodInvocation equals = ast.newMethodInvocation();
        				equals.setExpression(ast.newSimpleName(varName));
        				equals.setName(ast.newSimpleName("equals"));
        				equals.arguments().add(ast.newSimpleName(varName));
        				
        				operationContract = ast.newMethodInvocation();
        				operationContract.setName(ast.newSimpleName("assertTrue"));
        				operationContract.arguments().add(equals);
        				
        				break;
        			}
//        		• o.equals(o) throws no exception
        			case 1: {
        				operationContract = ast.newMethodInvocation();
        				operationContract.setExpression(ast.newSimpleName(varName));
        				operationContract.setName(ast.newSimpleName("equals"));
        				operationContract.arguments().add(ast.newSimpleName(varName));
        				

        				
        				break;
        			}
//        		• o.hashCode() throws no exception
        			case 2: {
        				operationContract = ast.newMethodInvocation();
        				operationContract.setExpression(ast.newSimpleName(varName));
        				operationContract.setName(ast.newSimpleName("hashCode"));
        				
        				break;
        			}
//        		• o.toString() throw no exception
        			case 3: {
        				operationContract = ast.newMethodInvocation();
        				operationContract.setExpression(ast.newSimpleName(varName));
        				operationContract.setName(ast.newSimpleName("toString"));
        				
        				break;
        			}
        		}	
        		
        		Expression operationContract2=operationContract;
        		ExpressionStatement contractStmt = ast.newExpressionStatement(operationContract2);
        		
        		

         		    fileContent = "package edu.illinois.randooop;\r\n"
           			   		+ "import org.junit.Test;\r\n"
           			   		+ "\r\n"
           			   		+ "import static org.junit.Assert.assertArrayEquals;\r\n"
           			   		+ "import static org.junit.Assert.assertEquals;\r\n"
           			   		+ "import static org.junit.Assert.assertFalse;\r\n"
           			   		+ "import static org.junit.Assert.assertNotNull;\r\n"
           			   		+ "import static org.junit.Assert.assertNotSame;\r\n"
           			   		+ "import static org.junit.Assert.assertNull;\r\n"
           			   		+ "import static org.junit.Assert.assertSame;\r\n"
           			   		+ "import static org.junit.Assert.assertTrue;\r\n"
           			   		+ "\r\n"
           			   		+ "public class TestJunit"+i+" {\r\n"
           			   		+ "	@Test\r\n"
           			   		+ "		\r\n"
           			   		+ '\t'+"public void TestJunit() {\r\n"
           			   		+     element.getCode().indent(14)
           			   		+     contractStmt.toString().indent(14)
           			   		+ "	   }\r\n"
           			   		+ "\r\n"
           			   		+ "	\r\n"
           			   		+ "	\r\n"
           			   		+ "}\r\n"
           			   		+ "";
        			
        
        		
        		
        		
        		   fileWriter = new FileWriter("./target/classes/edu/illinois/randooop/TestJunit"+i+".java");
        		   printWriter = new PrintWriter(fileWriter);
        		   printWriter.print(fileContent);
        		   printWriter.close();

        		   
        		   
        		   compiler = ToolProvider.getSystemJavaCompiler();
        		   compilerResult = compiler.run(null, null, null,"./target/classes/edu/illinois/randooop/TestJunit"+i+".java");
        		   
        		   classLoader = URLClassLoader.newInstance(new URL[] { root.toURI().toURL() });
        		   
        		   System.out.println("Compiler result code: " + compilerResult);
        		   String s="edu.illinois.randooop.TestJunit"+i+""; 
        		   
        		   if( compilerResult==1) {
        			   
        		   }else {
        		   junitTest = Class.forName(s, true, classLoader); 
        		   result = junit.run(junitTest);
        		   System.out.println( result.wasSuccessful());
        		   
        		   
        
        		   if(result.wasSuccessful()) {
        				String str2 = 
        						"\r\n" +
        						"    /**" + "\r\n"
        						 + "     *" + "\r\n"
        						 + "     */" + "\r\n"
        						 + "    "
        						 +  " " 
        						 + "	@Test"+i+"\r\n"
        					   		+ "	   public void TestJunit() {\r\n"
                   			   		+     element.getCode().indent(14)
                   			   		+     contractStmt.toString().indent(14)
        					   		+ "	}\r\n";
        					
        				 
        				 normal_writer1.println(str2);
        				 normal_writer1.flush();
        			   
        		   }else {
        			   
       				String str2 = 
    						"\r\n" +
    						"    /**" + "\r\n"
    						 + "     *" + "\r\n"
    						 + "     */" + "\r\n"
    						 + "    "
    						 +  " " 
    						 + "	@Test"+i+"\r\n"
    					   		+ "	   public void TestJunit() {\r\n"
               			   		+     element.getCode().indent(14)
               			   		+     contractStmt.toString().indent(14)
    					   		+ "	}\r\n";
    					
        				
        				 
        				 error_writer1.println(str2);
        				 error_writer1.flush();

        			   
        		   }
        		   
        		   
        		   
        		   
        		   
        		   
        		   }
        		   
        		 
        		   
        		   
        		   
        		   
        		   
        		   
        		   
        		   
        		   
        		   
        		   
        		   
        		   
        		   
        		   myObj = new File("./target/classes/edu/illinois/randooop/TestJunit"+i+".class"); 
        		   myObj.delete();
        		   myObj=new File("./target/classes/edu/illinois/randooop/TestJunit"+i+".java"); 
        		   myObj.delete();
        		   
        		   
        		   
        	  
 
        		i++;
        		
        		
        		
        		
        		
        		
        	}
        	
        	 normal_writer1.println("   }");
        	 normal_writer1.flush();
        	
        	 error_writer1.println("   }");
        	 error_writer1.flush();

  	
        	
        	
         	
        } catch (Exception e) {
        	System.out.println("File Error");
        	e.printStackTrace();
        }
    }
}