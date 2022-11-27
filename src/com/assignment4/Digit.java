package com.assignment4;

public class Digit {
	public static int digit(int n, int k) {
		int i = 0;
		int r = 0;
		int q = 0;
		int temp = n;
		while (i <= k) {
			r = temp % 10;
			q = temp / 10;
			temp = q;
			i++;
		}

		return r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Digit.digit(29415, 0);
		Digit.digit(29415, 2);

	}

}
