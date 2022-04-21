package edu.illinois.randooop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
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

public class TmpMain {
	private static String constructFileContent(int testNumber, String code, String contract, boolean forWrite) {
		String fileContent = "        /*\r\n" + "         *" + "Testcase Number:" + testNumber + "\n" + "        */"
				+ "        @Test\r\n" + "        public void TestJunit() {\r\n" + code.indent(12) + contract.indent(12)
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
					+ "import static org.junit.Assert.assertTrue;\r\n" + "\r\n" + "public class TestJunit {\r\n"
					+ fileContent + "\r\n" + "	\r\n" + "	\r\n" + "}\r\n";
		}

		return fileContent;
	}

	public static void main(String args[]) {
		String packageName = "org.joda.time";
		String targetLocation = "/home/bernkastel79/eclipse-workspace/randooop/joda-time-2.10.13/";
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
					if (cls.isInterface() || Modifier.isAbstract(cls.getModifiers())) {
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
		testcase_file_writer normal_file;
		testcase_file_writer error_file;
		File root = new File("./target/");

		long startTime = System.currentTimeMillis();
		int executionTimeSec = 30 * 60;
		long duration = executionTimeSec * 60000;
		int testsGenerated = 0;
		int testsDiscarded = 0;
		int counter = 0;
		int testsSuccess = 0;
		int testsError = 0;
		int testsFail = 0;

		while (System.currentTimeMillis() - startTime < duration) {
			PoolElement test = builder.generateNewTest();
			testsGenerated++;

			String fileContent = constructFileContent(counter, test.getCode(), "", false);

			Ast_parser parser_ast = new Ast_parser();
			ArrayList<String> variables = parser_ast.getVarNames(fileContent);

			if (variables.size() == 0) {
				continue;
			}

			String varName = variables.get(0);
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
				compileclass compilefile = new compileclass(testFilePath, "");
				compilefile.writecompile(fileContent, testFilePath);
				
				int compilerResult = compiler.run(null, null, null, testFilePath);

				URLClassLoader classLoader = URLClassLoader.newInstance(new URL[] { root.toURI().toURL() });
				if (compilerResult == 1) {
					testsError++;
					System.out.println("Failure to compile.");
				} else {
					String jUnitClass = "edu.illinois.randooop.TestJunit"+ counter; 
					Class<?> junitTest = Class.forName(jUnitClass, true, classLoader); 
	     		   	Result result = junit.run(junitTest);
					if (result.wasSuccessful()) {
						testsSuccess++;
						recorder.recordSequence(test, contractStmt.toString(), true);
						normal_file = new testcase_file_writer(" ","normal_behavior.txt");
						normal_file.write(constructFileContent(counter, test.getCode(), contractStmt.toString(), true));
					} else {
						testsFail++;
						recorder.recordSequence(test, contractStmt.toString(), true);
						error_file = new testcase_file_writer(" ","error_behavior.txt");
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
		
		System.out.println("[Test Results]");
		System.out.println("tests generated: " + testsGenerated);
		System.out.println("redundant tests (discarded): " + testsDiscarded);
		System.out.println("tests compiled: " + counter);
		System.out.println("tests not compiled: " + testsError);
		System.out.println("tests passed: " + testsSuccess);
		System.out.println("tests failed: " + testsFail);
		
	}
}
