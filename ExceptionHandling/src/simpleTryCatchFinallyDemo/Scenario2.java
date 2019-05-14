package simpleTryCatchFinallyDemo;

/* When a satatement throws an exception in the try block,the remaining part of try block will not
    be executed.program comes out of the the try block and directy enters in catch block */

public class Scenario2 
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
						 Catch-block
						 Finally1
						 Main-end  */
