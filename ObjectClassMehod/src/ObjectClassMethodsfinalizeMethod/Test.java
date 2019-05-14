package ObjectClassMethodsfinalizeMethod;

// Is invoked by the garbage collector before object is being garbage collected

// protected void finallize() throws Throwable
public class Test 
{
    public static void main(String[] args) 
    {
	   Test t = new Test();
	   
	   System.out.println(t.hashCode());   //366712642
	       t=null;
	       
	 //calling garbage collector
	      System.gc();
	      
	    System.out.println("end");   //end
	}
    public void finalize()       // finalized method override here
    {
    	System.out.println("finalized method called ");    //finalized method called 
    }
    
}
