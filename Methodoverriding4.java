package myfirstjavaapp;

public class Methodoverriding4 extends Methodoverriding3{
	public void run() {
		System.out.println(" You are running");
	}

	public static void main(String[] args) {
		
		// create an Objects of Child class 
		
		Methodoverriding4 mo4 = new Methodoverriding4();
		mo4.run();
		
		// Create an Objects of parent class 
		
		Methodoverriding3 mo3 = new Methodoverriding3();
		mo3.run();
		
	}

}
