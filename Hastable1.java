package myfirstjavaapp;

import java.util.Hashtable;

public class Hastable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>(); 
		
		ht.put(1, "jan");
		ht.put(2, "Feb"); 
		ht.put(3, "Mar"); 
		
		System.out.println(ht.get(1));
		System.out.println(ht.get(2));
		System.out.println(ht.get(3));

		System.out.println(ht);
	}

}
