package myfirstjavaapp;

public class Static2 {

	int roll; // Declearing Global variable 
	String name; // Declearimg Global variable 
	String college; // Deleacring Global variable 
	
	public static void main(String[] args) {
		
		Static2 s2 = new Static2(); //
		
		System.out.println(s2.roll); //0 
		System.out.println(s2.name); // Null 
		System.out.println(s2.college); // Null 
		
	}

}
  