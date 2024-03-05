package myAssignments.week2.day2;

public class FibonacciSeries {
	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter
	 * 
	 * What are my learnings from this code? 1) 2) 3)
	 * 
	 */

	public static void main(String[] args) {
		// initialize 3 int variables 
		int num1=0,num2=1,range=7;
		//// Print first number
		System.out.println(num1);
		System.out.println(num2);
		for(int i=1;i<range;i++) {
			int sum=num1+num2;
			num1=num2;
			num2=sum;
			System.out.println(sum);

		}

	}

}

