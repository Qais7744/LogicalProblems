package com.bl.logicalproblems;

import java.util.Scanner;

public class FibonacciSeries {
	static void findSeries(int num, int first, int sec) {

		System.out.print(first + " " + sec + " ");
		int counter = 0, sum;
		while (counter < num - 2) {
			sum = first + sec;
			System.out.print(sum + " ");
			first = sec;
			sec = sum;
			counter++;
		}
	}

	public static void main(String[] args) {
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		number = scanner.nextInt();
		scanner.close();
		int first = 2, second = 4;

		findSeries(number, first, second);
	}
}
