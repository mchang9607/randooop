package edu.illinois.randooop;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class compileclass {

	FileWriter fileWriter;
	PrintWriter printWriter;
	String pathcopy;
	File root;
	
	public compileclass(String path, String filename) throws IOException {
//		  root = new File("./target"); 
//		  
//		
//		  pathcopy=path;
//		  FileWriter fileWriter = new FileWriter(path);
//	      PrintWriter printWriter = new PrintWriter(fileWriter);
		
	
	}
	

	
	public void writecompile(String fileContent, String path) throws IOException {
		   pathcopy=path;
		   fileWriter = new FileWriter(path);
		   printWriter = new PrintWriter(fileWriter);
		   printWriter.print(fileContent);
		   printWriter.close();
			
	}
	
//	public void compile_return(String fileContent, String path) throws IOException {
//		
//		   
//		   JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
//		   int compilerResult = compiler.run(null, null, null,pathcopy);
//		   URLClassLoader classLoader = URLClassLoader.newInstance(new URL[] { root.toURI().toURL() });
//		   
//		   
//		   	   
//	}
//	
	
  public void deletefile() {
	  
	  
	   File myObj  = new File(pathcopy.substring(0, pathcopy.length() - 4)+"class"); 
	   myObj.delete();
	   myObj=new File(pathcopy); 
	   myObj.delete();
	  
	    
  }
	
	
	
	
	
	
	
	
	
}
