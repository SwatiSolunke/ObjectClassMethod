package ExceptionPropagation;

// We can call exception in propagation or in chain format as per our need
public class UncheckedException 
{
	// For unchecked exceptions 
	
	// By default unchecked exceptions are forwarded in calling chain
	public void m() 
	{
		int data = 20 / 0;
		System.out.println(data);
	}

	public void n() 
	{
		m();    // calling m() method here 
		System.out.println("Can not handle exception here");
	}

	public void p() {
		try {
			n();   // calling n() method here
		}

		catch (Exception e) {
			System.out.println("exception caught here");
		}
	}

	public static void main(String[] args) 
	{
		UncheckedException uex = new UncheckedException();
		uex.p();
		System.out.println("Normal flow");

	}

}
   /* exception caught here
      Normal flow   */