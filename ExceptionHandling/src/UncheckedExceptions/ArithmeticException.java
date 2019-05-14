package UncheckedExceptions;

public class ArithmeticException 
{
	public static void main(String[] args) 
    {
		System.out.println("Main-start");
		try 
		{
			System.out.println("Try-start");
			int a=10/0;
			System.out.println(a);    // ArithmeticException here
			System.out.println("Try-end");
		} catch (Exception e) 
		{
			System.out.println("Exception caught");  //Exception handled here
		}
        System.out.println("Main-end");
	}
}
     /* Main-start
 		Try-start
		Exception caught
		Main-end   */