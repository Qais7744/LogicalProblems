package com.bl.logicalproblems;

import java.util.Scanner;

public class PrimeNumber {
	private static Scanner read;
	
	public static void main(String[] args) {
		read =new Scanner (System.in);
		int number;
		int count = 0;
		System.out.println("Enter the Number :");
		number = read.nextInt();
		read.close();
		
		for (int i = 1; i <= number; i++)
			if (number % i == 0)
					count++;
		if (count == 2)
		{
			System.out.println("It is a Prime Number");
		}
		else
		{
			System.out.println("It is Not Prime Number");
		}
	}
}
