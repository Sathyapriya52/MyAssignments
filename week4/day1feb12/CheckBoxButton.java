package myAssignments.week4.day1feb12;

public class CheckBoxButton extends Button

//week4 day 1 inheritance assignment
{
	public void clickCheckButton()
	{
		System.out.println("Click the checkbox button");
	}
	public static void main(String[] args) {
		
		CheckBoxButton element=new CheckBoxButton();
		element.click();
		element.clickCheckButton();
		element.setText("TestLeaf");
		
	}
	}


