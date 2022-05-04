package edu.illinois.randooop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.HashMap;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import org.apache.commons.io.FilenameUtils;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import java.util.Random;
import org.apache.commons.lang3.StringUtils;


public class TmpMain {
	private static String constructFileContent(int testNumber, String code, String contract, boolean forWrite) {
		String fileContent = "        /*\r\n" + "         *" + "Testcase Number:" + testNumber + "\n" + "        */"
				+ "        @Test\r\n" + "        public void TestJunit"+testNumber+"() {\r\n" + code.indent(12) + contract.indent(12)
				+ "        }\r\n";

		if (!forWrite) {
			fileContent = "package edu.illinois.randooop;\r\n" + "import org.junit.Test;\r\n" + "\r\n"
					+ "import static org.junit.Assert.assertArrayEquals;\r\n"
					+ "import static org.junit.Assert.assertEquals;\r\n"
					+ "import static org.junit.Assert.assertFalse;\r\n"
					+ "import static org.junit.Assert.assertNotNull;\r\n"
					+ "import static org.junit.Assert.assertNotSame;\r\n"
					+ "import static org.junit.Assert.assertNull;\r\n"
					+ "import static org.junit.Assert.assertSame;\r\n"
					+ "import static org.junit.Assert.assertTrue;\r\n" + "\r\n" + "public class TestJunit"+testNumber+" {\r\n"
					+ fileContent + "\r\n" + "	\r\n" + "	\r\n" + "}\r\n";
		}

		return fileContent;
	}

	private static String constructFileContentcopy(int testNumber, String code, String contract, boolean forWrite) {
		String fileContent = "        /*\r\n" + "         *" + "Testcase Number:" + testNumber + "\n" + "        */"
				+ "        @Test\r\n" + "        public void TestJunit"+testNumber+"() {\r\n" + code.indent(12) + contract.indent(12)
				+ "        }\r\n";

		if (!forWrite) {
			fileContent = "package edu.illinois.randooop;\r\n" + "import org.junit.Test;\r\n" + "\r\n"
					+ "import static org.junit.Assert.assertArrayEquals;\r\n"
					+ "import static org.junit.Assert.assertEquals;\r\n"
					+ "import static org.junit.Assert.assertFalse;\r\n"
					+ "import static org.junit.Assert.assertNotNull;\r\n"
					+ "import static org.junit.Assert.assertNotSame;\r\n"
					+ "import static org.junit.Assert.assertNull;\r\n"
					+ "import static org.junit.Assert.assertSame;\r\n"
					+ "import static org.junit.Assert.assertTrue;\r\n" + "\r\n" + "public class TestJunitcopy"+testNumber+" {\r\n"
					+ fileContent + "\r\n" + "	\r\n" + "	\r\n" + "}\r\n";
		}

		return fileContent;
	}	
	
	
	
	
	
	
	
	
    private static boolean isPrimative(String code, String varName) {
        String primTypes[]  = new String[] {"int ", "short ", "byte ", "long ", "char ", "float ", "double ", "boolean "};
        for (String type: primTypes) {
            if (code.contains(type + varName)) {
                return true;
            }
        }
        return false;
    }
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		
		/*
		 * String packageName = args[0];
		 * String targetLocation = args[1];
		 */
		
		String packageName = "org.joda.time";
		String targetLocation = "E:\\360Downloads\\joda-time-2.10.13/";
		File packageDir = new File(targetLocation);
		File classFileDir = new File(targetLocation + packageName.replaceAll("\\.", "/"));		
		File[] classes = classFileDir.listFiles();
		HashMap<String, APIElement> api = new HashMap<String, APIElement>();
		BytecodeAnalyzer analyzer = new BytecodeAnalyzer();
		for (File classFile : classes) {
			if (FilenameUtils.getExtension(classFile.getName()).equals("class")) {
				String className = packageName + "." + FilenameUtils.removeExtension(classFile.getName());				
				try {
					Class<?> cls = analyzer.getClassObject(packageDir, className);
					if (cls.isInterface() || Modifier.isAbstract(cls.getModifiers())
							|| cls.getAnnotation(Deprecated.class) != null) {
						continue;
					}
					api.putAll(analyzer.generateAPIList(cls));
				} catch (MalformedURLException | ClassNotFoundException e) {
					e.printStackTrace();
				}
			} else {
				continue;
			}
		}

		PoolInitializer initializer = new PoolInitializer();
		TestPool pool = initializer.makePool();
		TestBuilder builder = new TestBuilder(api, pool);
		TestCaseRecorder recorder = new TestCaseRecorder();
		
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		JUnitCore junit = new JUnitCore();
		File root = new File("./target/");

		long startTime = System.currentTimeMillis();
		int executionTimeSec = 1800;
		long duration = executionTimeSec * 1000;
		int testsGenerated = 0;
		int testsDiscarded = 0;
		int counter = 0;
		int testsSuccess = 0;
		int testsError = 0;
		int testsFail = 0;
        int countercopy2=0;
        int valid_counter=0;
		int file_num=0;
	    testcase_file_writer normal_file = new testcase_file_writer(" ","normal_behavior.txt");
        testcase_file_writer error_file = new testcase_file_writer(" ","error_behavior.txt");
	    
        
       
        
        
		while (System.currentTimeMillis() - startTime < duration) {
			PoolElement test = builder.generateNewTest();
			testsGenerated++;
			countercopy2++;
			String fileContent = constructFileContent(counter, test.getCode(), "", false);
			
			
			if(valid_counter>500) {
				 
				 normal_file = new testcase_file_writer(" ","normal_behavior"+file_num+".txt");
				 valid_counter=valid_counter-500;
				 file_num=file_num+1;
				
			}
			
			
			
			
			
			
			
			String fileContentcopy = constructFileContentcopy(countercopy2, test.getCode(), "", false);
			
			
			
//			System.out.print(fileContentcopy);
			
			String testFilePathcopy = "./target/classes/edu/illinois/randooop/TestJunitcopy" + countercopy2 + ".java";
			compileclass compilefile = new compileclass(testFilePathcopy, "");
			compilefile.writecompile(fileContentcopy, testFilePathcopy);
			
			int compilerResult = compiler.run(null, null, null, testFilePathcopy);
			URLClassLoader classLoader = URLClassLoader.newInstance(new URL[] { root.toURI().toURL() });
			if(compilerResult == 1) {
				testsError++;
//				countercopy2++;
				compilefile.deletefile();
				continue;
			}
			
			
			
			String jUnitClass = "edu.illinois.randooop.TestJunitcopy"+ countercopy2; 
			Class<?> junitTest = Class.forName(jUnitClass, true, classLoader); 
 		   	Result result = junit.run(junitTest);
			if(!result.wasSuccessful()) {
				testsError++;
//				countercopy2++;
				compilefile.deletefile();
				continue;
		}
			compilefile.deletefile();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			Ast_parser parser_ast = new Ast_parser();
			ArrayList<String> variables = parser_ast.getVarNames(fileContent);

			if (variables.size() == 0) {
				
				continue;
			}

		
			
			
			Random rand = new Random();
			int rand_int1 = rand.nextInt(variables.size());
			
			String varName=null;
			int i=0;
			for(i=0; i<variables.size();i++) {
				varName = variables.get(i);
				 if(!isPrimative(fileContent, varName)) {

					 break;
					 
				 }
			
		
			}
			 if(i==variables.size()) {
//				 testsError++;
				 continue;
				 
				 
			 }

			
			
			
			CompilationUnit cu = parser_ast.getAST(fileContent);
			AST ast = cu.getAST();
			contract_generator contract = new contract_generator();
			ExpressionStatement contractStmt = contract.getcontract(ast, varName);
			
			if (!recorder.isValidNewSequence(test, contractStmt.toString())) {
				testsDiscarded++;
				System.out.println("Test case discarded.");
				continue;
			}


			
			String testFilePath = "./target/classes/edu/illinois/randooop/TestJunit" + counter + ".java";
			fileContent = constructFileContent(counter, test.getCode(), contractStmt.toString(), false);
			
		
			
			try {
				compilefile = new compileclass(testFilePath, "");
				compilefile.writecompile(fileContent, testFilePath);
				
				String[] options = new String[3];
				options[0] = "-cp";
				options[1] = "./joda-time-2.10.13.jar:junit-4.13.2.jar";
				options[2] = testFilePath;
				compilerResult = compiler.run(null, null, null, options);
				classLoader = URLClassLoader.newInstance(new URL[] { root.toURI().toURL() });

				
				if (compilerResult == 1) {
					testsError++;
					recorder.recordSequence(test, contractStmt.toString(), false);
					System.out.println("Failure to compile.");
				} else {
					jUnitClass = "edu.illinois.randooop.TestJunit"+ counter; 
					junitTest = Class.forName(jUnitClass, true, classLoader); 
	     		   	result = junit.run(junitTest);
					if (result.wasSuccessful()) {
						testsSuccess++;
						recorder.recordSequence(test, contractStmt.toString(), true);
						normal_file.write(constructFileContent(counter, test.getCode(), contractStmt.toString(), true));
						valid_counter=valid_counter+1;
						if (StringUtils.countMatches(test.getCode(), "\n") < 50) {
							  pool.addElement(test);
							}
					} else {
						testsFail++;
						recorder.recordSequence(test, contractStmt.toString(), false);
						error_file.write(constructFileContent(counter, test.getCode(), contractStmt.toString(), true));
					}
					counter++;
				}
				
				compilefile.deletefile();
	
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
    	normal_file.write_end();
    	error_file.write_end();
		
		System.out.println("[Test Results]");
		System.out.println("tests generated: " + testsGenerated);
		System.out.println("redundant tests (discarded): " + testsDiscarded);
		System.out.println("tests compiled: " + counter);
		System.out.println("tests not compiled and throw exception: " + testsError);
		System.out.println("tests passed: " + testsSuccess);
		System.out.println("tests failed: " + testsFail);
		
	}
}
