package myfirstjavaapp;

public class Reversestring2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Selenium"; 
		
		// Decleating a variable with initial empty value 
		
		String rev = " "; 
		
		// Creating an Obect of string class using String Buffer 
		
		StringBuffer sb =new StringBuffer(str );
		
		System.out.println(sb.reverse());
		

	}

}
