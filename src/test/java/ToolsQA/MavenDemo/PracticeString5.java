package ToolsQA.MavenDemo;

public class PracticeString5 {

	public static void main(String A[])
	{
		String s = "this is my machine" ;
		
		String rev  ="";
		
		String rev2 ="" ;
		for(int i=s.length()-1;i>=0;i--)
		{
			rev += s.charAt(i);
			
		}
		System.out.println(rev);
		
		
		String[] splt = s.split(" ") ;
		
		for(String s1 : splt)
		{
			for(int i=s1.length()-1; i>=0;i--)
			{
				rev2 += s1.charAt(i) ;
			}
			rev2 = rev2 + " " ;
		}
		System.out.println(rev2);
	}
}
