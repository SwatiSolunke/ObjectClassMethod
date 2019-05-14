package MultipleCatchBlock;

/* From Java 7 onward, there is one more way for handling multiple exceptions.
 *  Multiple exceptions thrown by the try block can be handled by a single 
 *  catch block using pipe (|) operator. 
 */
public class Scenario2 {

	public static void main(String[] args) 
	{
		String[] s = { "abc", "123", null, "xyz" }; // String array containing one null object

		for (int i = 0; i < 6; i++)
		{
			try {
				int a = s[i].length() + Integer.parseInt(s[i]);
				System.out.println(a);

				// This statement may throw NumberFormatException, NullPointerException and
				// ArrayIndexOutOfBoundsException
			}

			catch (NumberFormatException | NullPointerException | ArrayIndexOutOfBoundsException ex) {
				System.out.println(
						"Now, this block handles NumberFormatException, NullPointerException and ArrayIndexOutOfBoundsException");
			}
		}
	}

}
