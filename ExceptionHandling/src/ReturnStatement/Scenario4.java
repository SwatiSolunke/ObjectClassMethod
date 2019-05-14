package ReturnStatement;

/* If try-catch blocks are returning a value according to above rules ,then we should not 
 * keep any statement after finally block bcoz it gives compile time error and it is a unreachable code */ 

public class Scenario4 
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
			//System.out.println("Hello");    ... we cant provide after return statement
		}
		catch(Exception e)
		{
			System.out.println("Catch-block");
			return 10; //this block must be returning value
			//System.out.println("Hello");    ... we cant provide after return statement
		}
		finally {
			System.out.println("Finally block");
			return 10;
			//System.out.println("Hello");    ... we cant provide after return statement
		}
	}             


}
