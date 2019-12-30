package ToolsQA.MavenDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInptStream {

	public static void main(String A[])
	{
		FileInputStream fis ;
		String path ="C:\\Users\\srishti.goel\\eclipse-workspace\\MavenDemo\\src\\test\\java\\ToolsQA\\MavenDemo\\srishti.txt" ;
		int b ;
		try {
			fis = new FileInputStream(path);
			System.out.println("we are here " +(char)fis.read());
			System.out.println("break");
			while((b=fis.read()) != -1)
			{
				System.out.println((char) b + "" + b );
			}
			fis.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
