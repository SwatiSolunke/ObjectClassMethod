package SwappingOfTwoNumWithoutUsingTempVar;

public class WithoutSwap 
{
	public static void main(String[] args) 
	{
	  int a=25;
	  int b=20;
	  System.out.println("Before swapping the value of a is:==>"+a);
	  System.out.println("Before swapping the value of b is:==>"+b);
		
	  a=a+b;
	  b=a-b;
	  a=a-b;
	  
	  System.out.println("After swapping the value of a is:==>"+a);
	  System.out.println("After swapping the value of b is:==>"+b);
		
	}
}
    /* output:
	   Before swapping the value of a is:==>25
	   Before swapping the value of b is:==>20
	   After swapping the value of a is:==>20
       After swapping the value of b is:==>25	  */