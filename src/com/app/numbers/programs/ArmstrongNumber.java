// Write a Java Program to check Armstrong number.
package com.app.numbers.programs;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int c=0,a,temp;  
		System.out.println("Enter Number: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); //It is the number to check Armstrong  
        in.close();
		
		temp=n;  
		while(n>0)  
		{  
			a=n%10;  
			n=n/10;  
			c=c+(a*a*a);  
		}  
		if(temp==c)  
			System.out.println("Given number is Armstrong Number");   
		else 
			System.out.println("Given number is Not Armstrong Number");   
	}  
}
