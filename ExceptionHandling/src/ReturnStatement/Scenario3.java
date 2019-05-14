package ReturnStatement;

public class Scenario3 
{
	public static void main(String[] args) 
	{
		System.out.println(m1());
	}
	static int m1()
	{
		try 
		{
			System.out.println("Try-block start");
			int a = 10/0;
			System.out.println(a);
			System.out.println("Try-block end");
			return 20; 
		}
		catch(Exception e)
		{
			System.out.println("Catch-block");
			return 10; //this block must be returning value
		}
		finally {
			System.out.println("Finally block");
		}
	}             

}                       
                /* Try-block start
				   Catch-block
				   Finally block
				   10   */

