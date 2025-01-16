package myfirstjavaapp;

public class Array5 {

	public static void main(String[] args) {

		// Defining multidivisional array
		// 1 2 3 4
		// 5 6 7 8
		// 9 10 11 12

		int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		// Total number of rows
		int row = a.length; // Legnth is the property of an array
		System.out.println(row); // 3

		// ttal number of Column
		int colums = a[0].length;
		System.out.println(colums);

		// print all values in matrix form
		// Outer Loop
		for (int i = 0; i < row; i++) {
			
			// inner loop 
			for (int j =0 ; j< colums ; j++ ) {
				
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}

	}

}
