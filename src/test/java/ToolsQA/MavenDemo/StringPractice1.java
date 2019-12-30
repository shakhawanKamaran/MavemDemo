package ToolsQA.MavenDemo;

public class StringPractice1 {

	// Write a java program to tOGGLE each word in string?

	// this is javatpoint
//	/tHIS iS jAVATPOINT

	public static void main(String A[]) {
		String str = "this is javatpoint";
		
		String[] string = str.split(" ");
	String change = "" ;
		for (String s : string) {
			//	System.out.println(s);
				String first = s.substring(0,1);
				String end = s.substring(1);
				change += first.toLowerCase()+end.toUpperCase()+" " ; 
		}
		System.out.println(change.trim());
		
	}
}
