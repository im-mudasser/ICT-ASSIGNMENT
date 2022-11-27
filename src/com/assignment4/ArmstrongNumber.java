package com.assignment4;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		String input = in.nextLine();
		in.close();
		int size = input.length();
		int number = Integer.parseInt(input);
		int temp = number;
		int i = 0;
		int sum = 0;
		while (i < size) {

			int q = temp / 10;
			int r = temp % 10;

			int square = (int) Math.pow(r, size);
			sum += square;

			temp = q;
			i++;

		}
		if (sum == number) {
			System.out.println("ArmstrongNumber");
		} else {
			System.out.println("Not a ArmstrongNumber");
		}
	}

}
