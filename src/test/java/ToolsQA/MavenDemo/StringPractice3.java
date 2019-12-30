package ToolsQA.MavenDemo;

public class StringPractice3 {

	// How to swap two String variables without third variable

	public static void main(String A[]) {
		String firstName = "Srishti";
		String lastName = "Goel";

		firstName = firstName + " " + lastName;
		lastName = firstName.substring(0, firstName.indexOf(" "));
		firstName = firstName.substring(firstName.indexOf(" "));
		System.out.println("firstName is " + firstName.trim());
		System.out.println("lastName is " + lastName.trim());
	}
}
