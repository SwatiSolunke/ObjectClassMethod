package AdditionOfNumDigit;

// sum of digit of number
public class Test
{
	public static void main(String[] args) 
	{
		int num=315;
		int sum=0;
		
		while(num>0)
		{
			sum=sum+(num%10);
			num=num/10;
			System.out.println("After division Number is :==>"+num);
		}
			
		System.out.println("The sum of number digit is:==>"+sum);
	}

}
    /* output:
	   After division Number is :==>31
	   After division Number is :==>3
	   After division Number is :==>0
	   The sum of number digit is:==>9    */