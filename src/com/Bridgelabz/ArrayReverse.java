package com.Bridgelabz;

public class ArrayReverse {

	public static void main(String[] args) {
		
		 int[] arr = {10,20,30,40,50,60,70,80,90};
	     
		  
		    System.out.println("Original Array:");
		    
		    for(int i=0;i<arr.length;i++)
		    {
		         System.out.print(arr[i] + "    ");
		    }
		    System.out.println();
		     
		   
		    System.out.println("Array in reverse order:");
		    
		    for(int i=arr.length-1;i>=0;i--)
		    {
		        System.out.print(arr[i] + "    ");
		    }
		    
	}
}
