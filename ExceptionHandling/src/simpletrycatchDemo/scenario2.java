package simpletrycatchDemo;

public class scenario2 
{
	public static void main(String[] args) 
	{
	 System.out.println("Main-start");
	 try{
		 System.out.println("Try-start");
		 
		 int a=10/2;
		 System.out.println(a);
		 
		 System.out.println("Try-end");
	 }
	 catch(ArithmeticException e)
	 {
		 System.out.println("Catch-block");
	 }
	 System.out.println("Main-end");

	}
	
}                   /* Main-start
					Try-start
					5
					Try-end
					Main-end */

