package myfirstjavaapp;

public class Breakstatment2 {

	public static void main(String[] args) {

		// use for loop
		for (int i = 1; i < 10; i++) {

			// use If Statment
			if (i == 5) {

				break; // break statment
			}
			System.out.println(i);
		}
		System.out.println("Control will come out from loop ");
	}
}
