package ToolsQA.MavenDemo;

import java.util.Scanner;

public class Except {

	public static void main(String A[])
	{
		int accNo[] = new int[3] ;
		try {
				System.out.println(accNo[4]);
		}
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			int len = accNo.length;
//			for(int i=0;i<len;i++)
//			{
//				System.out.println(accNo[i]);
//			}
//		}
		catch(Exception e)
		{
			System.out.println("Enter 4th value");
			Scanner d = new Scanner(System.in);
			accNo[2] = d.nextInt();
			System.out.println("accNo 3 is " +accNo[2]);
			
		}
		finally {
			System.out.println("executinf finaLLT");
		}
	}
}
