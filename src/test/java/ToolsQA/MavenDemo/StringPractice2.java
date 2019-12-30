package ToolsQA.MavenDemo;

//Write a java program to capitalize each word in string?

//this is javatpoint
//This Is Javatpoint
public class StringPractice2 {

	String string;

	public StringPractice2(String string) {
		this.string = string;
	}

	public String run() {
		System.out.println(string);
		String[] splt = string.split(" ");
		String rev = "";
		for (String s : splt) {
			String first = s.substring(0, 1);
			String last = s.substring(1);
			rev += first.toUpperCase() + last.toLowerCase() + " ";

		}
		return rev;
	}

	public static void main(String A[]) {
		StringPractice2 obj = new StringPractice2("this is javatpoint");
		System.out.println(obj.run());
	}
}
