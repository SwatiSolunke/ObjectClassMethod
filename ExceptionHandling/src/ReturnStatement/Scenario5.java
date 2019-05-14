package ReturnStatement;

/* finally block overrides any returns value from try and catch block */
public class Scenario5 
{
	
	public static void main(String[] args) 
	{
		Scenario5 sc = new Scenario5();
		System.out.println(sc.m1());
	}
	public int m1()
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
			return 50;   // finally retrns value  ...............ove rrides the the value
		
		}
	}
}                                   //50