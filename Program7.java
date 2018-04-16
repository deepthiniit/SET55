package com.niit;

public class Program7 {
public static void main(String[] args){
	String a="good23bad4";

    int sum = 0;

    String num = "";

    for(int i = 0; i < a.length(); i++) {
        if(Character.isDigit(a.charAt(i))) {
            num = num + a.charAt(i);
        } else {
            if(!num.equals("")) {
                sum = sum + Integer.parseInt(num);
                num = "";
            }
        }
    }

    System.out.println(sum);
}
	
}

