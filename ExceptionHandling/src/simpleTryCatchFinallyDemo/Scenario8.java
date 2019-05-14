package simpleTryCatchFinallyDemo;

/* We can display the description of an exception thrown using Exception 
 * object in the catch block*/
public class Scenario8 
{
	public static void main(String[] args) 
	{
		try {
			System.out.println("Try-start");
			String s = null;
			System.out.println(s.length());     // NullpointerException here
			System.out.println("Try-end");
		}
		catch(Exception e)
		{
			System.out.println("catch block"+e);   // Exception object "e"
		}
		finally {
			System.out.println("Finally block executed");
		}
	}
  }
                  /* Try-start
					 catch blockjava.lang.NullPointerException
					 Finally block executed  */