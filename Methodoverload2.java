package myfirstjavaapp;

public class Methodoverload2 {
	public void test1(int a, int b) {
		System.out.println(" int value ");
		
	}
	public void test2(int a , String x) {
		System.out.println(" int and String ");
		
		
	}
	 // Create an Object of class for calling no static method into main method 
	public static void main(String[] args) {
		Methodoverload2 mo2 = new Methodoverload2();
		
		// we are calling non statice method 
		mo2.test1(3, 9);
		mo2.test2(100, "Test result ");
		
	}
	

}
