package com.assignment3;

public class IsTraingular {
	public static int isTraingular(int n) {
		int sum = 0;
		if (n < 0) {
			return 0;
		}
		for (int i = 0; sum < n; i++) {
			sum = sum + i;
		}

		if (sum == n) {
			return 1;
		}
		return 0;

	}

	public static void main(String[] args) {
		System.out.println(isTraingular(12));

	}

}
