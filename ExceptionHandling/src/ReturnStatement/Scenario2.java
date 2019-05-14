package ReturnStatement;

/* If finally block not returns a value then try and catch block
 * must returns value */
public class Scenario2 
{
	public static void main(String[] args) 
	{
		System.out.println(m1());
	}
	static int m1()
	{
		try 
		{
			System.out.println("Try-block start");
			int a = 10/2;
			System.out.println(a);
			System.out.println("Try-block end");
			return 20; //this block must be returning value
			
		}
		catch(Exception e)
		{
			System.out.println("Catch block");
			return 10; //this block may or may not be returning value
		}
		finally {
			System.out.println("Finally block");
		}
	}             
}
				/*Try-block start
				  5
				 Try-block end
				 Finally block
				 20    */