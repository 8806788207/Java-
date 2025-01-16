package myfirstjavaapp;

public class Array1 {

	public static void main(String[] args) {
		
		//Reverse the number 1234
		int a= 1234; // local variable 
		//String Builder 
		int b = Integer.parseInt(new StringBuilder(String.valueOf(a)).reverse().toString()); 
		System.out.println(b);
		

	}

}
