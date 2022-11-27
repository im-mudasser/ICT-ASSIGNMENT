package com.assignment4;

public class EuclideanAlgo {
	public static void greatestCommonDivisor(int m, int n) {
		if (m < 0 || n < 0) {
			System.out.println("Number should be positive");
			System.exit(0);
		}
		while (n != 0) {
			int temp = n;
			n = m % n;
			m = temp;
		}
		System.out.println(m);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EuclideanAlgo.greatestCommonDivisor(532, 112);
	}

}
