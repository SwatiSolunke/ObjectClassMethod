package simpletrycatchDemo;

public class scenario3 
{
	public static void main(String[] args) 
	{
	 System.out.println("Main-start");
	 try{
		 
		 int a=10/0;
		 System.out.println(a);
		 
	 }
	 catch(ArithmeticException e)
	 {
		 System.out.println("Catch-block");
	 }
	 System.out.println("Main-end");

	}
	
}     /*Main-start
		Catch-block
		Main-end   */         


