package myfirstjavaapp;

public class Methodoverriding2 extends Methodoverriding1 {
	public void eat() {
		System.out.println("You are eating ");
	}
	public static void main(String[] args) {
		// create an Object of class 
		
		Methodoverriding2 mo2 = new Methodoverriding2(); 
		mo2.eat();
		// in method overriding if both method are same then child method first execute. 
		

	}

}
