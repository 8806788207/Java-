package myfirstjavaapp;

public class Variable8 {
	
	int b=10; // Global variable 
	static int c=10; // Static variable 

	// Static method 

	public static void d() {
		int e=20; //local variable 
		System.out.println(e);//20	
	}
	
	//Non Static Method 
	public void f() {
		int g=5;// local variable 
		System.out.println(g); // 5
		
	}
	
	public static void main(String[] args) {
		int a=6; //Local variable 
		System.out.println(a); //calling local variable 
		
		//Static Member calling method s
		System.out.println(c);
		d();
		
		//Non Static member calling 
		// Object Creating Syntax         //ClassName Reference Variable = New ClassName(); 
		
		Variable8 v8 =new Variable8();// Calling non ststic variable using class Object refrence 
		System.out.println(v8.b); 
		v8.f();         // Calling non Static variable using class objects refrence 
			
	}

}
