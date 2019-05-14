package simpleTryCatchFinallyDemo;

public class Scenario9 
{
	public static void main(String[] args) 
	{
		try {
			System.out.println("Try-start");
			int a = 10/0;
			System.out.println(a);     // ArithmeticException here 
			System.out.println("Try-end");
		}
		catch(ArithmeticException e)    // executed
		{
			System.out.println("catch block1");  //child exception here
		}
		catch(Exception e)    // not executed
		{
			System.out.println("catch block2");  //parentexception here
		}
		finally {
			System.out.println("Finally block executed");
		}
	}

}
