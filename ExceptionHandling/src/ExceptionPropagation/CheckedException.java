package ExceptionPropagation;

import java.io.IOException;

public class CheckedException 
{
	// For checked exceptions 
	
		// By default unchecked exceptions are not forwarded in calling chain
		public void m() throws IOException 
		{
			throw new java.io.IOException();   // checked exception
		
		}

		public void n() 
		{
			//m();    // calling m() method here.. but CE here unhandled exp
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
		    CheckedException uex = new CheckedException();
			uex.p();
			System.out.println("Normal flow");

		}

}
/* Can not handle exception here
   Normal flow   */
