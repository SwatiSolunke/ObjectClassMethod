package ObjectClassMethodshashCodeMethod;

// The hascoe method returns the hascode number for the object

// public int hascode()
public class Student 
{
   int rollno;
   
   Student()  //constructer
   {
	   int lastRoll = 10;
	   rollno=lastRoll;
	   lastRoll++;
   }
   
   public int hashCode()    //override hashCode method here
   {
	   return rollno;
   }
   
   public static void main(String[] args)
   {
	   Student s = new Student();
	   
	   System.out.println(s);            //hashCodeMethod.Student@a
	   System.out.println(s.toString()); //hashCodeMethod.Student@a
	   System.out.println(s.hashCode()); //10    
}
}
