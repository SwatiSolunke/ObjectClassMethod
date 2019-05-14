package UncheckedExceptions;

public class NumberFormatException 
{
	public static void main(String[] args) 
	{
		System.out.println("This statement will be executed");
		try 
		{
			Integer i = new Integer("abc");  //NumberFormatException here 
		} catch (Exception e) 
		{
			System.out.println("Exception caught"); // handeled exp here
		}
		System.out.println("This statement will not be executed");
	}
}
                /* This statement will be executed
				   Exception caught
				   This statement will not be executed  */