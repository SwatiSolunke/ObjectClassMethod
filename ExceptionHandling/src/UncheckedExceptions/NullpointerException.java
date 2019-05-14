package UncheckedExceptions;

public class NullpointerException 
{
    public static void main(String[] args) 
    {
		System.out.println("Main-start");
		try 
		{
			String s = null;
			System.out.println(s.length());  //NullpointerException here
		} catch (NullPointerException e) 
		{
			System.out.println("Exception caught"); // Exception  handled here
		}
        System.out.println("Main-end");
	}
  }
                   /* Main-start
					  Exception caught
					  Main-end   */