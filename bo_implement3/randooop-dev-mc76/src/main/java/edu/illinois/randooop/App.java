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
        	for (int i = 0; i < 100; i++) {
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

      	 //test file initialized end
        	
            testcase_file_writer normal_file = new testcase_file_writer(" ","normal_behavior.txt");
            testcase_file_writer error_file = new testcase_file_writer(" ","error_behavior.txt");
      	   
      	   
      	   
      	   
      String fileContent;
      	
      File root = new File("./target"); 
   	

      
      
      
      	 
      JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
  	  int compilerResult ;
  	  URLClassLoader classLoader ;
  	  File myObj;
  	  Class<?> junitTest;
  	  Result result;
  	  JUnitCore junit = new JUnitCore();
  	  

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


          		
        // AST and contract statement part 		
     		   Ast_parser parser_ast = new Ast_parser();
    		   ArrayList<String> variables= parser_ast.getVarNames(fileContent);
        		
//        		int number=variables.size();
        		if(variables.size()==0) {
        			continue;
        		}
        		
        		System.out.print(variables.size()); 
        		String varName=variables.get(0);
        		
        	CompilationUnit cu =parser_ast.getAST(fileContent);

        	AST ast = cu.getAST();	
        	
        	
        	contract_generator contract = new contract_generator();
        	
        	ExpressionStatement contractStmt=contract.getcontract(ast, varName);
       // AST and contract statement part end			
        	
        	

        		
     
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
        			
                   String path="./target/classes/edu/illinois/randooop/TestJunit"+i+".java";
         		    
         		   compileclass  compilefile  =  new compileclass(path,"");
         		   compilefile.writecompile(fileContent, path);
        		
        		   
        		   
        		   compiler = ToolProvider.getSystemJavaCompiler();
        		   compilerResult = compiler.run(null, null, null,path);
        		   
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
    				
        				normal_file.write(str2);
        				
        			   
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
	 
        				error_file.write(str2);
        			   
        		   }
        		   }
        		   

//        		   myObj = new File("./target/classes/edu/illinois/randooop/TestJunit"+i+".class"); 
//        		   myObj.delete();
//        		   
//        		   myObj=new File("./target/classes/edu/illinois/randooop/TestJunit"+i+".java"); 
//        		   myObj.delete();
        		   compilefile.deletefile();

        		i++;
  	
        		
        	}
        	
        	normal_file.write_end();
        	error_file.write_end();

   	
         	
        } catch (Exception e) {
        	System.out.println("File Error");
        	e.printStackTrace();
        }
    }
}