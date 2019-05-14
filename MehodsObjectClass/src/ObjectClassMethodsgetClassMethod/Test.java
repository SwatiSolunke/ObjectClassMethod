package ObjectClassMethodsgetClassMethod;

// It returns the class class of object
// The class class can further be used to get the metadata of this class

// public final class getClass()
public class Test 
{
    public static void main(String[] args) 
    {
	   Object obj = new String("java");
	   
	   Class c=obj.getClass();
	   
	   System.out.println("Class of object is:" + c.getName()); //Class of object is:java.lang.String

	}
}
