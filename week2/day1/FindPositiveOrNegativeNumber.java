package myAssignments.week2.day2;

public class FindPositiveOrNegativeNumber {
	//Problem statement: Check if the number is positive or negative

	public static void main(String[] args) {
		//Initialize a number
		int num=35;
		//If a number is positive, print "The number is positive"
		//If a number is negative, print "The number is negative" 
		//If it nether negative nor positive, print as "The number is neither positive nor negative"
		if(num>0) {
			System.out.println("The given number "+num +" is positive.");

			if(num<0){
				System.out.println("The given number "+num+" is negative.");
			}
		}
		else {


			System.out.println("The given number "+num+"is neither positive nor negative.");
		}
	}

}
