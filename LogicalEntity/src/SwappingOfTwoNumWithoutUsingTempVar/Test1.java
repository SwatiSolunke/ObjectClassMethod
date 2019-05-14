package SwappingOfTwoNumWithoutUsingTempVar;

public class Test1 
{
	public static void main(String[] args)
	{
		int x = 10, y = 5;

		System.out.println("Before swapping the value of x is:==>" + x);
		System.out.println("Before swapping the value of y is:==>" + y);

		// Code to swap 'x' and 'y'
		x = x * y; // x now becomes 15
		y = x / y; // y becomes 10
		x = x / y; // x becomes 5
		
		System.out.println("After swapping the value of x is:==>"+x);
		System.out.println("After swapping the value of y is:==>"+y);
	}
}

 /*  Output:
	Before swapping the value of x is:==>10
	Before swapping the value of y is:==>5
	After swapping the value of x is:==>5
	After swapping the value of y is:==>10    */
