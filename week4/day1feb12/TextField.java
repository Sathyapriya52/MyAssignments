package myAssignments.week4.day1feb12;

public class TextField extends WebElement
{
	//week4 day 1 inheritance assignment
	
		public void getText()
		{
			System.out.println("Get the element");
		}
		public static void main(String[] args) {
			
			TextField element=new TextField();
			element.click();
			element.getText();
			element.setText("TestLeaf");
		
}
}
