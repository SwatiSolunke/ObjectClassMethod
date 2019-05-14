package UncheckedExceptions;

public class StringOutOfBoundException 
{
	public static void main(String[] args) 
    {
		System.out.println("Main-start");
		try 
		{
			System.out.println("Try-start");
			String s="Swati" ;   // Stringindexoutofboundexception here
			s.charAt(6);
			System.out.println(s.length());
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
