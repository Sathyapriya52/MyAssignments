package myAssignments.week4.day1feb12;

public class Desktop extends Computer
//Assignment to learn single inheritance

{
public void desktopSize() {
	System.out.println("The desktop size is 16");
}
public static void main(String[] args) {
	Desktop obj=new Desktop();
	obj.computerModel();
	obj.desktopSize();
}
}
