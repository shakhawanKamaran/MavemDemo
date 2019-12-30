package ToolsQA.MavenDemo;

public class PracticeStirng4 {
	
		// How to swap two String variables without third variable

		public static void main(String A[]) {
			String firstName = "Srishti Goel";
			String lastName = "Keshav Goel";
			
			firstName=firstName.replace(" ", ":");
			lastName=lastName.replace(" ",":");
			firstName = firstName + " " + lastName;
			lastName = firstName.substring(0, firstName.indexOf(" "));
			firstName = firstName.substring(firstName.indexOf(" "));
			firstName=firstName.replace(":", " ");
			lastName=lastName.replace(":"," ");
//			System.out.println("firstName is " + firstName.trim());
//			System.out.println("lastName is " + lastName.trim());
//			
			
			String a1 = "hello" ;
			String a2 = a1+"world" ;
			String a4 = "helloworld" ;
			String a3 = "helloworld" ;
			String a5 = a4;
			String a6=a2 ;
			System.out.println(a6.equals(a4));
			System.out.println(a6==a4);
			System.out.println(a5==a3);
			System.out.println(a2==a3);
			System.out.println(a3==a4);
			
			
		}
	}


