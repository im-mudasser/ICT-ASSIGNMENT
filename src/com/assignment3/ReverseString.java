package com.assignment3;

public class ReverseString {
	public static void rev(String str) {
		char[] str1 = str.toCharArray();
		int j = str1.length - 1;
		for (int i = 0; i < str1.length / 2; i++) {
			char temp = str1[i];
			str1[i] = str1[j];
			str1[j] = temp;
			j--;

		}

		for (int i = 0; i < str1.length; i++) {
			System.out.print(str1[i]);
		}

	}

	public static void main(String[] args) {
		ReverseString.rev("mudasser shahzad");

	}

}
