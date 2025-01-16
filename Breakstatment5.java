package myfirstjavaapp;

public class Breakstatment5 {

	public static void main(String[] args) {

		// Outer loop
		// if 1 is less than 3 then contdition will then it will comes outer loop 
		for (int i = 1; i < 3; i++) {

			// inner loop
			
			for (int j = 1; j < 3; j++) {

				// If statment and Logical operator 
				// once condition will true it will goes to if statment  and break will work 
				if (i == 2 && j == 3) {
					break;
				}
				System.out.println(i + " " + j);

			}
			// once condition will fals then it will print ths line of statment 
			System.out.println("Control will Came out from Inner loop ");

		}
		
		// once condition will fals then it will print ths line of statment 
		System.out.println("Comtrol will Came out from Uter loop ");

	}

}
