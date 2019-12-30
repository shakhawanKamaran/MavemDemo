package ToolsQA.MavenDemo;

public class StaticMethod {

	
	public static void main(String A[])
	{
		System.out.println("in main  block");
		StaticMethod1.main();
		StaticMethod1.main(20);
		
		OverRide or = new StaticMethod1();
		
		
		
		or.main1();
		or.main();
		
		
		
	}
	
}
class StaticMethod1  extends OverRide
{

	
	public static void main()
	{
		System.out.println("in main 1 block");
	}
	
	
	public static void main(int a)
	{
		System.out.println("thi is main a" +a);
	}
	
	public void main1()
	{
		System.out.println("main without static");
	}
	
}


class OverRide  {
	
	public static void main()
	{ 
		System.out.println("in override main  method");
	}
	public void main1()
	{
		System.out.println("main without static OverRide");
	}
}
