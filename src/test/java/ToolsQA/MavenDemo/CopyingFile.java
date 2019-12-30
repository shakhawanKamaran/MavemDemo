package ToolsQA.MavenDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyingFile {

	
	public static void main(String A[])
	{
		FileInputStream fis = null ;
		FileOutputStream fos = null ;
		String inpath ="C:\\Users\\srishti.goel\\eclipse-workspace\\MavenDemo\\src\\test\\java\\ToolsQA\\MavenDemo\\srishti.txt" ;
		String outpath = "C:\\Users\\srishti.goel\\eclipse-workspace\\MavenDemo\\src\\test\\java\\ToolsQA\\MavenDemo\\sris.txt" ;
		byte byteRead ;
		
		try {
			fis = new FileInputStream(inpath) ;
			fos = new FileOutputStream(outpath) ;
					do{
						byteRead = (byte) fis.read() ;
						fos.write(byteRead);  
						
					}
					while(byteRead != -1) ;
		}
		catch(FileNotFoundException e)
		{
			System.out.println("file not found");
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try
			{
				fis.close();
				fos.close();
			}
			catch(IOException e)
			{}
		}
	}
}
