package myfirstjavaapp;

public class Array2 {

	// Array signle dimensional 
	public static void main(String[] args) {
	
		// Declearing of array 
		int a[]= new int[5];
		
		// print length of array 
		System.out.println(a.length); //5 
		
		//print default value of an integer array 
		
		for(int i =0; i<a.length; i++) {
			System.out.println(a[i]);
			
		}
			
		// Defining an array 
		a[0]=65; 
		a[1]=99;
		a[2]=5;
		a[3]=10;
		a[4]=6;
		
		//a[5]=88; // java.lang.ArrayIndexOutOfBoundsException
		System.out.println(a[3]);
		
		// print all array element 
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
