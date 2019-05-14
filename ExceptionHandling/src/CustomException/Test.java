package CustomException;

public class Test 
{
	static void vadlidate(int age)throws InvalidAgeException
	{
		if(age<18)
			throw new InvalidAgeException("not valid") ;
		else 
			System.out.println("Welcome to vote");
	}
	public static void main(String[] args) 
	{
		try {
			vadlidate(13);
		}catch(Exception e)
		{
			System.out.println("Exception occured"+e);
		}
		System.out.println("Rest of the code");
		
	}

}
