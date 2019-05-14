package simpleTryCatchFinallyDemo;

public class scenario1 {

	public static void main(String[] args) 
	{
		System.out.println("Main-start");
		
		try {
			System.out.println("Try-start");
			
			int a =10/0;
			System.out.println(a);
			
			System.out.println("Try-end");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch-block");
		}
		finally {
			System.out.println("Finally1");
		}
		
		// we cant provide multiple finally block in a sngle try catch block
		/*finally {
			System.out.println("Finally2");   
		} */
		System.out.println("Main-end");
	}

}
               /* Main-start
				Try-start
				Catch-block
				Finally1
				Main-end  */
