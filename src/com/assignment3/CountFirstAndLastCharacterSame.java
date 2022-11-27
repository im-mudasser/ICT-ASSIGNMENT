package com.assignment3;

public class CountFirstAndLastCharacterSame {
	/*
	 * Write a Python program to count the number of strings where the string length
	 * is 2 or more and the first and last character are same from a given list of
	 * strings. Sample List: ['abc', 'xyz', 'aba', '1221'] Expected Result : 2
	 */
	public static void firstAndLastchSame(String str[]) {
		int count = 0;

		for (int i = 0; i < str.length; i++) {
			if (str.length >= 2) {
				if (str[i].charAt(i) == (str[i].charAt(str[i].length() - 1))) {
					count++;
				}
			}

		}
		System.out.println("No of times " + count);
	}

	public static void main(String[] args) {
		String[] str = { "aba", "xyz", "aba", "1221" };
		CountFirstAndLastCharacterSame.firstAndLastchSame(str);
	}

}
