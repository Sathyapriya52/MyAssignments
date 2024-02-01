package myAssignments.week2.day1;

public class Mobile {
	// Assignment2
			public void makeCall(String mobileModel,float mobileWeight) {
				System.out.println("This is my mobile.Model is "+mobileModel+" and the mobile weight is"+mobileWeight);
			}
			public void sendMsg(boolean fullCharged, int mobileCost){
				System.out.println("This is my mobile.Full charged "+fullCharged+".The Mobile cost is"+mobileCost);
			}

	public static void main(String[] args) {
		
		Mobile obj = new Mobile();
		obj.makeCall("Nokia",.2f);
		obj.sendMsg(true,12000);
		
		}

	}


