package MultipleCatchBlock;

/* The order of catch blocks should be from most specific to
 *  most general ones. i.e Sub classes of Exception must come
 *   first and super classes later. If you keep the super classes 
 *   first and sub classes later, you will get compile time error 
 *   : Unreachable Catch Block.
 */

public class Scenario4 
{
	public static void main(String[] args)
    {
        try
        {
            int i = Integer.parseInt("abc");   //This statement throws NumberFormatException
            System.out.println(i);
        }
 
        catch(Exception ex)
        {
            System.out.println("This block handles all exception types");
        }
 
        /*catch(NumberFormatException ex)
        {
            //Compile time error
            //This block becomes unreachable as
            //exception is already handled by above catch block
        }*/
    }

}
