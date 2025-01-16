package myfirstjavaapp;

public class Relationaloperator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =300 ; // local variable 
		int b =300; // local  variable 
		

		if (a!=b) {
			System.out.println("a is not equal to b "); // if Condition is true then only it will comes to if block otherwise it will goes to else block  
			
		}else {
			
			System.out.println("a is equal to b ");
		}
		String p="HELLO"; 
		String q ="hello"; 
		// String Comparision 1 st way Case sensative 
		if (p==q) {
			System.out.println(" P is equal to q");
		} 
		else {
			System.out.println("P is not Equal to q ");
		}
		
		// String Comparision 2nd way Case Sensative 
		if(p.equals(q)) {
			
			System.out.println(" p is equal to q");
		}
		else {
			System.out.println("p is not equal to q");
		}
		
		// String Comparision 3rd way Case Sensative 
		if(p.equalsIgnoreCase(q)) {
			System.out.println("p is equal to q");
			
		}
		else {
			System.out.println("p is not equal to q ");
		}
	}
}
