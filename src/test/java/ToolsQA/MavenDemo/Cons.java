package ToolsQA.MavenDemo;

public class Cons {

	
	//static int sd = 10/0 ;
	public Cons()
	{
		int i=0,a=10,c ;
		try {
				c=a/i ;
				System.out.println(c);
			}
		catch(ArithmeticException  e)
		{
			e.printStackTrace();
			System.out.println("some error occured");
		}
		finally
		{
			System.out.println("priting in finally block");
		}
	}
	
	public static void threads()
	{
		try {
		Thread t = new Thread();
		t.setPriority(10);
		System.out.println("working fine ");
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("thread Exception ");
		}
		
		
		
	}
	public static  void thradstart()
	
	{
		try {
		Thread t1 = new Thread();
		t1.start();
		t1.start();
		}
		catch(Exception e)
		
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("v r here");
		}
	
	}
	
	public static void cast() {
	
		try {
		String s = new String("Srishti");
		Object o = s ;
		Object o1 = new Object();
		String s1 = (String) o1 ;	
		System.out.println(s1);
		System.out.println(o);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.getStackTrace();
			e.printStackTrace();
			System.out.println("casting exception ");
		}
	}
	public static void main(String A[])
	
	{
		//new Cons();
	//	cast() ;
		//threads();
		thradstart();
	}
}
