package SwappingOfTwoNumUsingTempVar;

// Swapping(changing) of two numbers by using temp variable

public class Swap 
{
	public static void main(String[] args) 
	{
		int a=100;
		int b=200;
		int temp=0;
		System.out.println("Before swapping the value of a is:==>"+a);
		System.out.println("Before swapping the value of b is:==>"+b);
		
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping the value of a is:===>"+a);
		System.out.println("After swapping the value of b is:==>"+b);
		
	}

}
    /* output:
	   Before swapping the value of a is:==>100
	   Before swapping the value of b is:==>200
	   After swapping the value of a is:===>200
	   After swapping the value of b is:==>100   */