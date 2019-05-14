package LargestNumberInArray;

import java.util.Arrays; 

public class Test 
{
	public static void main(String[] args)
	{ 
        int arr[] = {10, 324, 45, 90, 9808}; 
        int max = Arrays.stream(arr).max().getAsInt(); 
        System.out.println("Largest in given array is:==>"+max); 
    } 
  }
   // output:Largest in given array is:==>9808