package ReturnStatement;

public class Scenario7 
{
	public int m1()
	{
	  int x = 10;
	  System.out.println("M1-start");
	  try 
	  {
		  System.out.println("try-start");
		  return x;
	  }
	  finally 
	  {
		  System.out.println("Finally executed");
		  x=30;   // here is no return statment so do not returing any value from here
	  }
	}

	
	public static void main(String[] args) 
	{
		
		Scenario7   sc = new  Scenario7();
		int x = sc.m1();
		System.out.println(x);
	}

}
     /* M1-start
		try-start
		Finally executed
		10    */
