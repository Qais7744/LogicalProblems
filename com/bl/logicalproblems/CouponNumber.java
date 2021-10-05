package com.bl.logicalproblems;

import java.util.Scanner;

public class CouponNumber {

		static int[] coupon = new int[userInputNumber()];

		static int userInputNumber()
		{
			@SuppressWarnings("resource")
			Scanner user = new Scanner(System.in);
			System.out.print("Enter the lengh of array : ");
			int inputValue = user.nextInt();
			return inputValue;
		}

		static int randomValue()
		{
			int randomValue = (int) (Math.random() * 100);
			return randomValue;
		}

		static void inputValue()
		{
			int i = 0;
			final int Zero = 0;
			while (coupon.length > i)
			{
				int temp = randomValue();
				System.out.println("the value  generated" + temp + " i " + i);
				for (int j = Zero; j <= i; j++)
					if (temp == coupon[j])
						break;
				coupon[i] = temp;
				i++;
			}
			printValue();
		}

		public static void printValue()
		{
			final int ZERO = 0;
			for (int i = ZERO; i < coupon.length; i++)
			{
				System.out.println("the coupon number " + i + " " + coupon[i]);
			}
		}

		public static void main(String[] args)
		{
			inputValue();
		}

}


