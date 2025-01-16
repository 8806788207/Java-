package myfirstjavaapp;

public class Logicalopearor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a= 10;  // local variable 
		int b=5 ;  // local variable 
		int c = 20; // local variable 
		// logical OPearor check only condiation 
		// logical Opeartor shows if 1St condistion false , 2nd condiation will not check 
		System.out.println(a<b  && a<c );  // False 
		System.out.println(a>b  && c<b);
		System.out.println(a<c);
		
		// Bitwise Operator  will check both condiations 
		
		System.out.println( a<b && c>a);
	}

}
