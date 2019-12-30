package ToolsQA.MavenDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOputStream {
	
	public static void main(String A[]) throws IOException
	{
		byte cities[] = {'D','E','L','H','I' ,'\n' , 'S','R','I','S','H','T','I' };
		
		FileOutputStream fos ;
		String path = "C:\\Users\\srishti.goel\\eclipse-workspace\\MavenDemo\\src\\test\\java\\ToolsQA\\MavenDemo\\srishti.txt" ;
		try
		{
			
			fos = new FileOutputStream(path) ;
			
		fos.write(cities);
		
		fos.close();
		}
		catch(IOException ioe)
		{
			System.out.println(ioe);
			System.exit(-1);
		}
	}

}
