package com.niit;

import java.util.HashMap;

public class Program3 {
	public static void main(String[] args){
		HashMap<String, String> Mulof4 = new HashMap<>();
		Mulof4.put("2", "hi");
		Mulof4.put("4", "hello");
		Mulof4.put("5", "how are you");
		Mulof4.put("8","hello world");
		
		System.out.println("Testing .isEmpty() method");
		if (!Mulof4.isEmpty())
        {
            System.out.println("HashMap Mulof4 is notempty");
 
            System.out.println("Mulof4 : " + Mulof4.get("Language"));
            System.out.println("Mulof4 : " + Mulof4.get("Platform"));
            System.out.println("Mulof4 : " + Mulof4.get("Code"));
            System.out.println("Mulof4: " + Mulof4.get("Learn"));
 
            System.out.println("Size Of HashMap : " + Mulof4.size());
        }
    }
	}


