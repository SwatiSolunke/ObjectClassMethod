package ObjectClassMethodsCloneMethod;

// It creates and returns same copy of object

// protected Object clone() throws cloneNotSupportedException
public class Test 
{
	int x, y;

	Test() 
	{
		x = 10;
		y = 20;
	}

	public static void main(String[] args) 
	{
		Test ob1 = new Test();

		System.out.println(ob1.x + " " + ob1.y);   // 10 20  ... before cloning method

		// Creating a new reference variable ob2
		// pointing to same address as ob1
		Test ob2 = ob1;

		// Any change made in ob2 will be reflected
		// in ob1
		ob2.x = 100;

		System.out.println(ob1.x + " " + ob1.y);  //100 20  ..After clone ...same object 
		System.out.println(ob2.x + " " + ob2.y);  //100 20  ..After clone ...same object
	}
}
