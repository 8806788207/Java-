package myfirstjavaapp;

public class Reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 87654390
		int a= 87654390;
		// Use String Builder 
		int b =Integer.parseInt(new StringBuilder(String.valueOf(a)).reverse().toString());
		System.out.println(b);
	}

}
