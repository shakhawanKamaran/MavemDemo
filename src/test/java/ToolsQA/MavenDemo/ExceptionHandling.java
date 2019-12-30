package ToolsQA.MavenDemo;

public class ExceptionHandling {
	
	public static void main(String A[]) {
		String s ="SRISHTI" ;
	try
	{

	
	
	int a = Integer.parseInt(s);
	
	System.out.println(a);
	}
	
	catch(Exception e)
	{
		System.out.println("some error occured");
		//e.printStackTrace();
		
	}
	finally
	{
		System.out.println(s);
	}
}
}
