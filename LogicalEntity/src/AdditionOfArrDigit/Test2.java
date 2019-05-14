package AdditionOfArrDigit;

//Sum of array digit ..for multiple array...size of array is different
public class Test2 
{
	public static void main(String[] args) 
	{
		int sum=0;
		int A1[] = {10,20};
		int B1[] = {15,25,35,45};
		
		// Add elements of First array
		for(int i=0; i<A1.length; i++)
		{
			sum=sum+A1[i];
		}
		
		// To add elements of second array
		for(int j=0;j<B1.length;j++)
		{
			sum=sum+B1[j];
		}
		System.out.println("Sum of two array is:==>"+sum);
	}

}  
    //output: Sum of two array is:==>150
