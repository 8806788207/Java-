package myfirstjavaapp;

public class Encapulation1 {
	String name; // Global variable 
	int b ; // Global variable 
	final int c = 2; // Final variable 
	
	public void a() {
	//	c=2 ;  // final variable can not change the value 
	}
	// final method 
 final void d() {
	 System.out.println(" Final method");
 }
 public void setName(String s) {
	 this.name = s; 
	 this.b = 5; 
	 System.out.println(b);
	 System.out.println(c); 
 }
 public String getName() {
	 return name; 
 }
}
