package MultipleCatchBlock;
/* The order of catch blocks should be from most specific to
 *  most general ones. i.e Sub classes of Exception must come
 *   first and super classes later. If you keep the super classes 
 *   first and sub classes later, you will get compile time error 
 *   : Unreachable Catch Block.
 */

public class Scenario5
{
	public static void main(String[] args)
    {
        try
        {
            int i = Integer.parseInt("abc");   //This statement throws NumberFormatException
            System.out.println(i);
        }
        catch(NumberFormatException ex)    // subchild class
        {
            // No Compile time error
            
        }
 
        catch(Exception ex)    // parent class
        {
            System.out.println("This block handles all exception types");
        }
 
       
    }

}
