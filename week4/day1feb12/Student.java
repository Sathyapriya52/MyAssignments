package myAssignments.week4.day1feb12;

public class Student extends Department
//Assignment to learn inheritance
{
public void studentName() {
	System.out.println("The student name is Sathya");
}
public void studentDept() {
	System.out.println("The student department is Civil");
}
public void studentId() {
	System.out.println("The student id is 1234");
}
public static void main(String[] args) {
	Student obj=new Student();
	obj.collegeCode();
	obj.collegeName();
	obj.collegeRank();
	obj.deptName();
	obj.studentDept();
	obj.studentId();
	obj.studentName();
	
}
}
