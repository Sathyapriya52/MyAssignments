package myAssignments.week4.day1feb12;

public class LoginTestData extends TestData

//Week4 day 1 assignment-Inheritance
{
public void enterUsername() {
	  System.out.println("Enter the User name");
	  
}
public void enterPassword() {
	System.out.println("Enter the password");
}

public static void main(String[] args) {
	LoginTestData object=new LoginTestData();
	object.enterCredentials();
	object.enterUsername();
	object.enterPassword();
	object.navigateToHomePage();
}
}
