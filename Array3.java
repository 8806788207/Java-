package myfirstjavaapp;

public class Array3 {

	public static void main(String[] args) {

		// Array signle dimensional 
		// we can write an array in below fashion as well

		int b[] = { 1, 2, 3, 4, 5, }; // defining int array

		String s[] = { "hi", "Hello" }; // String array

		Object a[] = { 1, 2, 3, 4, 5, "selenium", 6, 6.5 };// defining Object Array

		System.out.println(a.length);// 8
		System.out.println(b.length);//4
		System.out.println(s.length);//1
		
		System.out.println(a[5]); //5 
		System.out.println(a[3]);// 4
		System.out.println(a[2]);// 3
		
		// modifying an array value using index 
		
		a[5]="Automation"; 
		System.out.println(a[5]);
	}
}
