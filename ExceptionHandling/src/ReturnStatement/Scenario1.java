package ReturnStatement;

/* If finally block returns a value then try and catch block
 * may or may not be returns value */

public class Scenario1
{
	public static void main(String[] args) 
	{
		System.out.println(m1());
	}
	static int m1()
	{
		try 
		{
			return 20; //this block may or may not be returning value
		}
		catch(Exception e)
		{
			return 10; //this block may or may not be returning value
		}
		finally {
			return 50;   // finally retrns value 
		
		}
	}

}
