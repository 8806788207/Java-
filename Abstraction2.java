package myfirstjavaapp;

public class Abstraction2 extends Abstraction1 {

	
	public void eat() {
		System.out.println(" Please Eat");
	}
	
	public static void main(String[] args) {
		
		// Create an Obect of class 
		Abstraction2 ab2 = new Abstraction2();
		//call non static method in the main mehod .
		ab2.eat();
		ab2.a();
		
		
	}

}
