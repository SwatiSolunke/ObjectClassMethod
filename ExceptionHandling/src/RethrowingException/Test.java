package RethrowingException;

/* When exception occured in the try block are caught in catch block.We can rethrown 
 * exception must handled in another try-catch block */
 
public class Test 
{
	static void m1() 
	{
		try 
		{
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e) 
		{
			System.out.println("Exception not caught here");
			throw e; // Rethrowing Exception here
		}
	}

	public static void main(String[] args) 
	{
		try 
		{
			m1();
		} catch (NullPointerException e) 
		{
			System.out.println("NullPointerException rethrown in method m1");
		}

	}
}              /* Exception not caught here
				  NullPointerException rethrown in method m1   */
