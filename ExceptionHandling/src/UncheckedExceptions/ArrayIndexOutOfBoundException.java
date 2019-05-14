package UncheckedExceptions;

public class ArrayIndexOutOfBoundException 
{
	public static void main(String[] args) 
    {
		System.out.println("Main-start");
		try 
		{
			System.out.println("Try-start");
			String s=args[1];    // arrayindexoutofboundexception here
			System.out.println(s);
			System.out.println("Try-end");
		} catch (Exception e) 
		{
			System.out.println("Exception caught");   // Exception handled here
		}
        System.out.println("Main-end");
	}
}
      /* Main-start
        Try-start
		Exception caught
		Main-end   */
