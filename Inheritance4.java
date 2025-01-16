package myfirstjavaapp;

public class Inheritance4 extends Inheritance3{
	 public void multiply(int x, int y) {
		 z =x * y;
		 System.out.println(z);
	 }
	 public static void main(String[] args) {
		
		 int x= 15; 
		 int y = 25; 
		 
		 // Creating an Objcets of inheritance 4
		 
		 Inheritance4 i4 = new Inheritance4();
		 
		 i4.add(15, 25);
		 i4.multiply(x, y);
		 i4.substract(x, y);
	}
	

}
