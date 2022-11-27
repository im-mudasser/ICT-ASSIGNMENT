package com.assignment4;

public class PermutationOfString {

	public static void permute(String str) {
		long fact = factorial(str);
		int i = 0;
		while (i < fact) {

			int length = str.length();
			int temp = i;
			StringBuilder sb = new StringBuilder(str);
			while (length != 0) {
				int r = temp % length;
				int q = temp / length;
				System.out.print(sb.charAt(r) + " ");
				sb.deleteCharAt(r);
				temp = q;
				length--;
			}
			System.out.println();

			i++;
		}

	}

	public static long factorial(String str) {

		int length = str.length();
		long fact = 1;
		for (int i = length; i >= 1; i--) {
			fact *= i;
		}
		return fact;
	}

	public static void pass(String str) {
		str = str.substring(1);
		System.out.println("inside the fun " + str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermutationOfString.permute("cat");

	}

}
