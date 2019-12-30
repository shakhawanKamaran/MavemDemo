package ToolsQA.MavenDemo;

public class Second_Highest {

	int sH = 0;
	static int arr[] = { 2, 3, 4, 1, 6, 9, 8 };
	static int swap;

	static int len = arr.length;
	static int j = 1;

	public static void main(String A[]) {
		max();
	}

	public static void max() {
		int max = arr[0];
		
		for (int i = 0; i < len; i++) {
			int arrr[] = arr ;
			if (j < 3) {
				if (arrr[i] > max) {
					swap = arrr[i];
					arrr[i] = max;
					max = swap;

				}

			}
			j++;
			
		}
		System.out.println(max);
	}
}
