package myfirstjavaapp;

public class Constructor2Overloading {
	
	// Constructor Overloading

	Constructor2Overloading(){
		System.out.println(" No Parameter");
	}
	Constructor2Overloading(int s){
		
		System.out.println(" int Parameter");
		
	}
	Constructor2Overloading(String s){
		System.out.println(" String Parameter ");
	}
	
	public static void main(String[] args) {
		// Create an Obects 
		Constructor2Overloading c3 = new Constructor2Overloading(); 
		Constructor2Overloading c4 = new Constructor2Overloading(6); 
		Constructor2Overloading c5 = new Constructor2Overloading(" Java ");
	}
}
