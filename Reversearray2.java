package myfirstjavaapp;

public class Reversearray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//987654321 Reverse the order of integer value 
		
		int a= 987654321; 
		
		// Withthe help of string Builder we can reverse the value 
		//String Builder works with only  double quotes value , String value store value in double quotes , to String Reverse String Biulder 
		
		
		int b = Integer.parseInt(new StringBuilder(String.valueOf(a)).reverse().toString());
		System.out.println(b);
		
	
		
	}

}
