package myfirstjavaapp;

public class Static3 {

	int roll; // declearing Global Variable 
	String name; // Delecarig global variable 
	static String college = "IIT Bomby" ;// static variable 

	
	//Constructor 
	
	Static3(int r, String n ){ 
		roll =r;
		name=n;
	
	}
	
	public void getresult() {
		
		System.out.println( roll + ""+ name +" " + college);
	}
	

}
