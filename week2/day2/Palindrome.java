package myAssignments.week2.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int num = 34343;
			int num1 = num;
			int reverse = 0;

			while (num > 0) 
			{
				reverse = (reverse * 10) + num % 10;
				num = num / 10;
			}
			
			if (reverse == num1)
			{
				
				System.out.println("The Given Number "+reverse+ " is a Plaindrome");

			} else {
				System.out.println("The Given Number  "+reverse+ " is not a Plaindrome");
			}
		}
	

	}


