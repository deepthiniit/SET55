package com.niit;

import java.util.Scanner;

public class Program2 {
	public static String Personname(String[] args){
		String s1="firstname";
		String s2="lastname";
		System.out.println("Please enter a Firstname , MiddleName & Lastname separated by spaces");
	      Scanner sc = new Scanner(System.in);
	      String name = sc.nextLine();
	      System.out.println(name);
	      String[] arr = name.split(" ");
	      
	      for (int i = 0; i < arr.length - 1; i++) {
	          System.out.print(arr[i].charAt(0) + " ");
	      }
	      System.out.println(arr[arr.length-1]);
		return name;
	}
	public static void main(String[] args){
		System.out.println("Persons lastname and firstanme");
	}

}
