package myfirstjavaapp;

public class Static7 {
	String a; // declearing global variable
	int b ;  // declearing global variable
	static int c= 4; // static variable 
	
	
	// stastic method 
	public static void a() {
		System.out.println("Hello ");
	}
	

	public static void main(String[] args) {
		Static7 s7 = new Static7();
		 s7.a="selenium "; 
		 s7.b =1; 
		 c=2; 
		 
		 
		 a(); // Hello 
		 System.out.println(s7.a); // selenium
		 System.out.println(s7.b); //1
		 System.out.println(c);// 2
		
	}

}
