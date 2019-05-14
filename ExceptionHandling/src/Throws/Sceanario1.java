package Throws;

/* Multiple exceptions can be declared using throws keywordseperated by commas */
public class Sceanario1 
{	
	static void m1() throws NumberFormatException,NullPointerException
	{
		int i=Integer.parseInt("abc");
		System.out.println(i);
		String s = null;
		System.out.println(s.length());
	}

	public static void main(String[] args)
	{
		 try {
			 m1();
		 }
		 catch(Exception e)
		 {
			 System.out.println("Exception handled");
		 }
		
	}

}
