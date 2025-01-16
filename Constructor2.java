package myfirstjavaapp;

public class Constructor2 {
	
	int id; // global variable 
	String name ; // global variable 
	String address; // global variable 
	
	
	// Default Constructor
	Constructor2 (){
		System.out.println(" Hello Default Constructor");
	}
	
	// Parametrized Constructor 
	Constructor2(int a , String b , String c ){
		this.id = a;  // to call global variable 
		name= b; 
		address = c; 
		
	}
	// Non statice Mthod 
	public void displayinfo() {
		System.out.println(id + "  "+name + "  "+ address);
	}
	public static void main(String[] args) {
		
		// Default Constructor
		Constructor2 c2 = new Constructor2(); 
		// Parametrized Constructor
		Constructor2 c3 = new Constructor2(1, " John", " UK "); 
		c3.displayinfo();
		Constructor2 c4 = new Constructor2(2 , " Peter" ," UK "); 
		c4.displayinfo();
		
		
		
		
		
	}
	
}
