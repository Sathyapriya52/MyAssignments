package myAssignments.week4.day1feb12;

public class RadioButton extends Button

//week4 day 1 inheritance assignment
{
	public void selectRadioButton() {
		System.out.println("Select the radio button");
	}
public static void main(String[] args) {
	
	RadioButton element=new RadioButton();
	element.click();
	element.setText("Welcome");
	element.selectRadioButton();
	
		
}
}
