package ToolsQA.MavenDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class mAIN {

	    public static void main(String[] args)  {
	    	try {
	        FileReader file = new FileReader("C:\\Users\\srishti.goel\\eclipse-workspace\\MavenDemo\\src\\test\\java\\ToolsQA\\MavenDemo\\FileS.txt"); 
	        BufferedReader fileInput = new BufferedReader(file); 
	        
	        String strLine;
	        int count = 0;
	       
	        
	       // fileInput.
	        // Print first 3 lines of file "C:\test\a.txt" 
	        for (int counter = 0; counter <2 ; counter++)  
	        	System.out.println(fileInput.readLine()); 
	          
	        fileInput.close(); }
	    	catch(FileNotFoundException e)
	    	{
	    		System.out.println("File NOt F(Ound");
	    		
	    	}
	    	catch(IOException e)
	    	{
	    		System.out.println("IO Excdption");
	    	}
	    } 
	} 

