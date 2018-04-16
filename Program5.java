package com.niit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program5 {
	public static void main(String[] args) throws IOException {

	    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	    System.out.println("Enter the Length of the String");
	    final int inputLength = Integer.parseInt(input.readLine());//the size of the string

	    if (inputLength >= 10000) {
	        System.err.println("The size of the string can not be greater than 10,000");
	        System.exit(1);
	    }

	    System.out.println("Enter letters");
	    String word = input.readLine().toLowerCase().trim();

	    word = word.replaceAll(" ", "");

	    final char[] vowels = {'a', 'e', 'i', 'o', 'u'};
	    short found = 0;

	    for (final char c : vowels) if (searchForVowel(c, word)) found++;

	    String result = (found == vowels.length) ? "yes" : "no";

	    System.out.println(result);
	}

	private static boolean searchForVowel(char vowel, String word) {
	    final char[] chars = word.toCharArray();
	    boolean isContains = false;

	    for (char c : chars) {
	        if (c == vowel) {
	            isContains = true;
	            break;
	        }
	    }

	    return isContains;
	  }
}
