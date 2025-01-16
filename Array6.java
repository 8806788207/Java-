package myfirstjavaapp;

public class Array6 {

	public static void main(String[] args) {
		
		// 22 23 24 
		// 25 26 27 
		// 28 29 30 
		int a[][]= {{22, 23, 24 }, {25, 26, 27 }, {28, 29, 30}};
		
		int rows= a.length; // length is an property it is not an array
		int  Columns = a[0].length;  /// 4 
		
		// Outer Loop 
		for (int i= 0; i<rows; i++ ) {
			// Inner Loop 
			for (int j=0 ; j< Columns; j++) {
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}
		
	

}
}
