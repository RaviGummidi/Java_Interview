// write a java program to reverse a string without using inbult functions
package com.app.string.programs;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		String original, reverse = "";
		System.out.println("Enter the string to be reversed");
		Scanner in = new Scanner(System.in);
		original = in.nextLine();
		int length = original.length();
		for(int i=length-1; i>=0; i--) {
			reverse = reverse + original.charAt(i);   //used inbuilt method charAt() to reverse the string
		}
		System.out.println("reverse of the string: "+reverse);
		
	}

}
