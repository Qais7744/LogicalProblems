package com.bl.logicalproblems;

import java.util.Scanner;

public class ReverseNumber {
	// A method for reverse
	public static void reverseMethod(int number) {
		if (number < 10)
		{
			System.out.println(number);
			return;
		} 
		else
		{
			System.out.print(number % 10);
			// Method is calling itself: recursion
			reverseMethod(number / 10);
		}
	}

	public static void main(String args[]) {
		int num = 0;
		System.out.println("Enter your number : ");
		Scanner read = new Scanner(System.in);
		num = read.nextInt();
		read.close();
		System.out.print("Reverse of the input number is:");
		reverseMethod(num);
		System.out.println();
	}

}
