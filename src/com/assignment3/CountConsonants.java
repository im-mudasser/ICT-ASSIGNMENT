package com.assignment3;

public class CountConsonants {
	public static void countConst(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				count++;
			}
		}
		System.out.println("Number of consonansts are  : " + count);
	}

	public static void main(String[] args) {
		CountConsonants.countConst("abcbdsmdekrle");
	}

}
