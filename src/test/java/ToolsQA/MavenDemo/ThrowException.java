package ToolsQA.MavenDemo;

public class ThrowException {

	public static void main(String A[])
	{
		main("Srishtig") ;
		
		System.out.println("rest of the code");
		abc obj = new abc();
		
		
				
	}
	
	public static void main(String name) 
	{	
		if(name.equals("Srishtig")) throw new ArithmeticException("not valid ");
		else
			System.out.println("valid ");
		
	}
	
	
}

class abc {
	
}
