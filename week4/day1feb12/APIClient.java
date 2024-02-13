package myAssignments.week4.day1feb12;

public class APIClient 
//week4 day1 assignment-Polymorphism-overloading
{
public void sendRequest(String endpoint)
{
System.out.println("Endpoint is"+endpoint);
}
//Method overloading. same method in same class is used differently
public void sendRequest(String endpoint,String requestBody,boolean requestStatus) {
	System.out.println("Endpoint is"+endpoint);
	System.out.println("Body is"+requestBody);
	System.out.println("Status is"+requestStatus);
}
public static void main(String[] args) {
	APIClient object=new APIClient();
	object.sendRequest("Mobile device");
	object.sendRequest("mobile device", "is connected",true);
}
}
