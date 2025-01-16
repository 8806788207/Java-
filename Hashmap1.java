 package myfirstjavaapp;

import java.util.HashMap;

public class Hashmap1 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>(); 
		hm.put(1, "jan"); 
		hm.put(2,"Feb"); 
		hm.put(3, "Mar");
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(3));
		System.out.println(hm.get(2));
		System.out.println(hm);  // all value with Key 
		System.out.println(hm.get(hm));
		

	}

}
