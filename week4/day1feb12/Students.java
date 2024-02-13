package myAssignments.week4.day1feb12;

public class Students
//Assignment to learn method overload
{
public void getStudentInfo(int id)
{
	System.out.println("The student id is "+id);
}
public void getStudentInfo(int id,String name) {
	System.out.println("The student id is "+id);
	System.out.println("The student name is "+name);
}
public void getStudentInfo(String emailid,int phoneNumber) {
	System.out.println("The student email id is "+emailid);
	System.out.println("The student phoneNumber is "+phoneNumber);
}
public static void main(String[] args) {
	Students obj=new Students();
	obj.getStudentInfo(1234);
	obj.getStudentInfo(1234, "Sathya");
	obj.getStudentInfo("sathyapriya52@gmail.com",89396580);

}
}
