package myfirstjavaapp;

public class Breakstatment4 {

	public static void main(String[] args) {

		// outer loop
		for (int i = 1; i < 3; i++) {

			// Inner Loop

			for (int j = 1; j < 3; j++) {
				// If Statment
				if (i == 2 && j == 2) {
					break;
				}
				System.out.println(i + "  " + j);
			}
			System.out.println(" Control will come out from inner Loop ");

		}
		System.out.println(" Control will come out from outer Loop ");
	}

}
