package myAssignments.week2.day2;

public class ConvertNegativeNumberToPositiveNumber {
	//Problem statement: Convert a negative number to positive number
	public static void main(String[] args) {
		//Initialize a variable and assign negative value.
		int num=-40;
		int a=-1;
		//Check if the number is a negative number.If so, convert the number to a positive number.

		if(num<0) {
			int num1=a*num;
			System.out.println("The given negative number "+num+" is converted into positive number "+num1);
		}
		else {
			System.out.println("The given negative number "+num+" is not a negative number");
		}


	}

}
