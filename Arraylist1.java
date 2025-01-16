package myfirstjavaapp;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist1 {

	public static void main(String[] args) {
		
		// Creating ArrayList and Import Package for that 
		ArrayList<Object> obj = new ArrayList<Object> (); 
		// Adding Objcet in Array list

		// 1St Way to Print arraylist
		obj.add(10);
		obj.add("selenium");
		obj.add(6.0);
		obj.add(3>9);
		
		// print arraylist element
		System.out.println(obj);
		
		// 2nd way to print arraylist using for each loop 
		for(Object bcd : obj ) {
			System.out.println(" For each loop "+ bcd);
			
			// 3rd way to print arraylist using whileloop 
			Iterator abc = obj.iterator();{
				while(abc.hasNext()) {
					
				System.out.println(" while loop:"+abc.next());
				}
			}
		}
	}

}
