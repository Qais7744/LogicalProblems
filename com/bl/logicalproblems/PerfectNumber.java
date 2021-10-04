package com.bl.logicalproblems;

import java.util.Scanner;

public class PerfectNumber {
	private static Scanner read;
	
	public static void main(String[] args) {
		int i;
		int number;
		int sum = 0;
		read = new Scanner(System.in);
		System.out.println(" Enter any Number :");
		number = read.nextInt();
		
			for (i = 1; i < number; i++)
			{
				if (number % i == 0)
				{
					sum = sum + i;
				}
			}
			if (sum == number)
			{
				System.out.println("is a Perfect Number :" + number);
			}	
			else
			{
				System.out.println("is not a Perfect Number :" + number);
			}
	}

}
