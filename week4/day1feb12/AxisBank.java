package myAssignments.week4.day1feb12;

public class AxisBank extends BankInfo
//Assignment to learn method override
{
@Override public void deposit() {
	System.out.println("The amount is deposited");
	
}
public static void main(String[] args) {
	AxisBank obj=new AxisBank();
	obj.deposit();
}
}
