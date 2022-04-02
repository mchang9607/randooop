package edu.illinois.randooop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class testcase_file_writer {
	
	PrintWriter normal_writer1 =null; 
	
	public testcase_file_writer(String path,String Name) throws FileNotFoundException {
		
		
        
        normal_writer1 = new PrintWriter(new File(Name)); 
  		 String str = 
  				 "/**" + "\r\n"
  				 + " *" + "\r\n"
  				 + " */" + "\r\n"
  				 + "public class "+"className"+"Test {";
  		 normal_writer1.println(str);
  		 normal_writer1.flush();
	
	}

	public void write(String filecontent) {
		
		
		 normal_writer1.println(filecontent);
		 normal_writer1.flush();
	
	}
	
	
	public void write_end() {
		
		
   	 	normal_writer1.println("   }");
   	 	normal_writer1.flush();
   	
	}
	
	
	

}
