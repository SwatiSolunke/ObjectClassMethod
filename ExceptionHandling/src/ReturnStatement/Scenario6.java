package ReturnStatement;

/* If try and catch blocks are retuiring values then finally block always executed */
public class Scenario6 
{
	public static void main(String[] args) 
	{
		Scenario6 sc = new Scenario6();
		System.out.println(sc.m1());
	}

	public int m1() {
		try {
			System.out.println("Try-block start");
			int a = 10 / 2;
			System.out.println(a);
			System.out.println("Try-block end");
			return 20; // this block must be returning value

		} catch (Exception e) {
			System.out.println("Catch block");
			return 10; // this block may or may not be returning value
		} finally {
			System.out.println("Finally block");  // fianlly block always executed first
		}
	}

}
