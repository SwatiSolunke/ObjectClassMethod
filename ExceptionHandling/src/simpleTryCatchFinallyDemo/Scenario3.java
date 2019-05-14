package simpleTryCatchFinallyDemo;

/* When a satatement does throws an exception in the try block,the remaining part of try block will
be executed.program does not comes out of the the try block and directy not enters in catch block */

public class Scenario3 
{
	public static void main(String[] args) 
	{
		System.out.println("Main-start");
		
		try {
			System.out.println("Try-start");
			
			int a =10/2;
			System.out.println(a);
			
			System.out.println("Try-end");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch-block");
		}
		
		// The finally block always executed when try catch block can handle or not...exception handled
		finally {
			System.out.println("Finally1");
		}
		System.out.println("Main-end");
	}
}
            /* Main-start
			Try-start
			5
			Try-end
			Finally1
			Main-end */

