package myAssignments.week4.day1feb12;

public class LoginPage extends BasePage
//week4 day1-polymorphism/over ridding

{
 @Override public void performCommonTasks()
{
	System.out.println("The task is performed");
}
 public static void main(String[] args) {
	LoginPage obj=new LoginPage();
	obj.clickElement();
	obj.performCommonTasks();
}
}
