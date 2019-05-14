package AdditionOfArrDigit;

// Sum of array digit .....forsingle array
public class Test 
{
   public static void main(String[] args) 
   {
	   int sum=0;
	   int arr[]= {10,5,8,3,2};
	   
	   for(int i=0;i<arr.length;i++)
	   {
		   sum=sum+arr[i];
	   }
	   System.out.println("The sum of the array digit is:==>"+sum);
	}
}
//output: The sum of the array digit is:==>28