package myfirstjavaapp;

public class Main {
	
	int a= 5; // int type local variable 
	 static int c = 5; // Static type local variable 
			

	public static void main(String[] args) {
	
		System.out.println("Hello");
 System.out.println("First Program ");
    aMethod();//local variable 
    bMethod();//local variable 
    int b =5;
    System.out.println(b);
	}

	private  static void bMethod() {
		System.out.println("Hello a method");
		
		
	}

	private  static void aMethod() {
		
		int d=5;	
		System.out.println(d);  //calling variable 
		
	}

}  