package myfirstjavaapp;

public class Typecasting {

	public static void main(String[] args) {
		
		// Double to int Convsersion 
		double b = 8.9; 
		int a = (int)b ;  // Manual Casting 
		System.out.println(b); // 8.9
		System.out.println(a); // 8
		
		// String to int Convsersion
		String s = "20"; 
		int i = Integer.parseInt(s);
		System.out.println(i); // 20 
		
		// int to string Conversion
		
		int z = 27; 
		String t = String.valueOf(z);
		System.out.println(t.length());// 2
		System.out.println(t); // 27 

	}

}
