package simpleTryCatchFinallyDemo;

public class Scenario6 {

	/* The finally block will not be executed if program exists(eithe by calling System.exit(0)
	    or by causing a fatal error that causes the process to abort */
	 
	public static void main(String[] args) 
	{
		try {
			System.out.println("Try-start");
			
			int a = 10/0;
			System.out.println(a);
			System.exit(0);    // system terminate here
			System.out.println("Try-end");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch-block");
		}
        finally {
        	System.out.println("Finally-block");
        }

	}

}
