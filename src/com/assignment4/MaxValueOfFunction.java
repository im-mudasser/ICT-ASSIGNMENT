package com.assignment4;

public class MaxValueOfFunction {
	public static long f1(long x) {
		long max = 0;
		if (x > max) {
			max = x;
		}
		return max;

	}

	public static double f2(long x) {

		double max = 0.0;
		x = -5 / 3 * x - 3;

		if (x > max) {
			max = x;
		}
		return max;

	}

	public static double f3(long x) {
		double max = 0.0;
		x = -5 * x * x + 2 * x - 3;
		if (x > max) {
			max = x;
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long f1Max = 0;
		double f2Max = 0.0;
		double f3Max = 0.0;

		int i = -10000;
		while (i <= 20000) {
			f1Max = f1(i);
			f2Max = f2(i);
			f3Max = f3(i);
			i++;
		}
		System.out.println(f1Max);
		System.out.println(f2Max);
		System.out.println(f3Max);
	}

}
