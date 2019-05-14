package simpleTryCatchFinallyDemo;

/* Try,catch,finally blocks forms one unit ie we cannot keep other statements in between them */
public class Scenario7 
{
	public static void main(String[] args) 
	{
		System.out.println("Main-start");
		
		try {
			System.out.println("Try-start");
			
			int a =10/0;     // Arithemetic Exception here
			System.out.println(a);
			
			System.out.println("Try-end");   // Remeing part in try will not be executed here
		}
		 // System.out.println("Hello"); ........we cant keep any code or statment here
		catch(ArithmeticException e)
		{
			System.out.println("Catch-block");
		}
		// System.out.println("Hello"); ........we cant keep any code or statment here
		
		// The finally block always executed when try catch block can handle or not...exception handled
		finally {
			System.out.println("Finally1");
		}
		System.out.println("Main-end");
	}
	 //System.out.println("Hello"); //........we cant keep any code or statment here


}
