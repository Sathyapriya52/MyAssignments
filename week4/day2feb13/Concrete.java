package myAssignments.week4.day2feb13;

public class Concrete implements DatabaseConnection
//Assignment to learn interface and abstract class
{

	@Override
	public void connect() {
		System.out.println("Connection is established");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Connection is disconnected");
		
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		
	}
public static void main(String[] args) {
	Concrete obj=new Concrete();
	obj.connect();
	obj.disconnect();
}
}
