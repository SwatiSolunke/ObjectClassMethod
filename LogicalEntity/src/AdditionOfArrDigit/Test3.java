package AdditionOfArrDigit;

//Sum of array digit ..for multiple array...size of array is same

public class Test3 
{
	public static void main(String[] args) 
	{
		int sum=0;
		int a1[] = {1,2,3,4,5};  // first array
		int b1[] = {6,7,8,9,10}; // second array
		
		for(int i=0; i<a1.length; i++)
		//for(int i=0; i<b1.length; i++)   .... we can use this also
		{
			sum=sum+a1[i]+b1[i];    // adiition of array digit here
		}
		
		System.out.println("Sum of two array is:==>"+sum);
	}
}
   // output: Sum of two array is:==>55
