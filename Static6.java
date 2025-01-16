package myfirstjavaapp;

public class Static6 {

	int x = 100; // Global variable 
	
	static int y=5; // static variable 
	// non ststic method
	public void a() {
		int z= 10; // local variable 
		System.out.println(z); // 10 
	
	}
	static int b=6 ; // Static variable 
	public static void b() {
		
		int a=5; // local variable
		System.out.println(a);// 5
	}
	public static void main(String[] args) {
		Static6 s6=new Static6(); 
		s6.a(); // 10 
		System.out.println(s6.b);
		System.out.println(b);
		b(); 
		System.out.println(s6.x);
		System.out.println(y);
		
		
	}
	

}
