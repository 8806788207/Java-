package myfirstjavaapp;

public class Static5 {

	static int z=5;// Static variable 
	int y=1;//Global variable 
	
	//Statice method 
	public static  void a() {
		z=10; // modification of value 
		System.out.println(z);//10 
		
	}
	// Non Static method 
	
	public void b() {
		 z=15; //Modification of value 
		 System.out.println(z); //15 
	}
	
	// always stastic will show in italic format 
	//
	public static void main(String[] args) {
	
		System.out.println(z);// 5 // we modified value in local  method  in the user defined method  
 
		a(); // we can call static marhod directly in main method  
		
		// if we want to call non static method in main method we need to create an Objects 
		
		
		Static5 s5 =new Static5(); 
		s5.b();  // 15 

	}

}
