package myfirstjavaapp;

public class Reversestring {

	public static void main(String[] args) {
		
		//with the help of String Buffer Class we can reverse the string 
		
		String Str="java"; 
		
		//  declearing variable  with initial id is emptry 
		
		String rev =" "; 
		
		//Creating an Objects to the  string Buffer Class 
		StringBuffer sb = new StringBuffer(Str);
	
		System.out.println( sb.reverse());
		
		
		
	}

}
