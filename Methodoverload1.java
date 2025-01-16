package myfirstjavaapp;

public class Methodoverload1 {
	public void ram(int a, int b) {
		System.out.println("int");

	}

	public void ram(int c, String a) {

		System.out.println("int  and String ");
	}

	public static void main(String[] args) {
		Methodoverload1 mo1 = new Methodoverload1();
		mo1.ram(5, 10);
		mo1.ram(7, "test");

	}

}
