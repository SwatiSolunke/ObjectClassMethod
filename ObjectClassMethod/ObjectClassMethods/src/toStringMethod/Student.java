package toStringMethod;

public class Student 
{
   int rollno;
   String name;
   String city;
   
   Student(int rollno,String name,String city)
    {
	   this.rollno=rollno;
	   this.name=name;
	   this.city=city;
    } 
   
   public String toString()     //override toString method
   {
	return rollno+""+name+""+city;
	   
   }
   
   public static void main(String[] args)
   {
	  Student s1 = new Student(11,"Raj","Pune");
	  Student s2 = new Student(12,"Rani","Mumbai");
	  
	  System.out.println(s1);

	  System.out.println(s2);
}
   }
