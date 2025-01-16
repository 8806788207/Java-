package myfirstjavaapp;

public class Logicalopearor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int a=10;
	int b=5; 
	int c=20; 
	
	// Logical Operator - If 1st condiation isfalse then it will not check 2nd condiation  
	System.out.println(a< b && a++ <c );//&& it means it will check one condiation
	System.out.println(a);
	
	//Bitwise Operator-- Will check both Condiations 
	System.out.println( a < b & a++ <c ); //& it means it will check both the condiations 
	System.out.println(a);
	
	}

}
