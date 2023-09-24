package devops.b3.lab4.cicd;

public class Mycalculator {
	public void greeting()
	{
		System.out.println("Hello GitHub Actions");
	}
	public void testMsg()
	{
		System.out.println("This is Test Message");
	}

	public static void main(String[] args) {		
		Mycalculator ob = new Mycalculator();
		ob.greeting();
		ob.testMsg();
	}
}