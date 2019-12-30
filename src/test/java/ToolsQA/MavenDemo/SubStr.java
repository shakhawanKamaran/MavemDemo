package ToolsQA.MavenDemo;

public class SubStr {
	
	
	public static void main(String A[])
	{
		String str = "Hello World" ;
		System.out.println(str.substring(1,7));
		
		
		StringBuffer sb=new StringBuffer("Helelello");  
		sb.replace(1,3,"Java");  
		System.out.println(sb);
		
	}

	private static Object getObject() {
		// TODO Auto-generated method stub
		return null;
	}
}
