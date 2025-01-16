package myfirstjavaapp;

public class Variable4 {

	public static void main(String[] args) {
	           // 0,1,2,3,4,5,6 Position of variable 
		int a[]= {1,2,3,4,5,6,100}; //int type array 
		
		           //0      , 1  Position of variable 
		String b[]= {"java" ,"selenium "};//String Type array 
		
		System.out.println(b[0]);//java
		System.out.println(a[4]);//5
		System.out.println(b[1]);//selenium
		System.out.println(a[6]);//100
        System.out.println(a[2]);//3
        System.out.println(a[3]);//4
        System.out.println(a[5]);//6
        System.out.println(a[0]);//1
        
        Object c[] = {1,2,3,4,99,1001,"Test1","Test2",3>12};//Object Array 
        System.out.println(c[1]);//2
        System.out.println(c[5]);//1001
        System.out.println(c[7]);//Test2
        System.out.println(c[8]);// False
	}
	

}
