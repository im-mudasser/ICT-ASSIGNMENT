package com.assignment4;

public class FindDashesBetweenTwoStrings {

	public static boolean find(String str1, String str2) {
		int i = 0;
		boolean correct = true;
		while (++i < Math.min(str1.length(), str2.length())) {
			if (str1.charAt(i) == '-') {
				if (str2.charAt(i) == '-') {
					continue;
				} else {
					correct = false;
					break;
				}
			}

		}

		return correct;

	}

	public static void main(String[] args) {

		boolean result = FindDashesBetweenTwoStrings.find("Hello-world", "Hello-wor");
		System.out.println(result);
	}

}
