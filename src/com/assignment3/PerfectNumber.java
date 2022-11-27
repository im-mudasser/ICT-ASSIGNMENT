package com.assignment3;

public class PerfectNumber {
	public static void perfectNumber(int number) {
		int sum = 0;
		if (number < 0) {
			System.out.println("Please enter the positive number only");
			System.exit(0);
		}
		for (int i = 1; i <= number; i++) {

			if (number % i == 0) {
				if (number != i) {
					sum += i;
				}
			}

		}
		if (sum == number) {
			System.out.println(number + "perfect number");
		} else {
			System.out.println(number + "not a perfect number");
		}

	}

	public static void main(String[] args) {
		PerfectNumber.perfectNumber(16);

	}

}
