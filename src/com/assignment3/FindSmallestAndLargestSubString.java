package com.assignment3;

public class FindSmallestAndLargestSubString {
	public static void subString(String str) {
		String smallest, largest = " ";
		String[] splitString = str.split("\\s+");
		smallest = largest = splitString[0];
		for (int i = 0; i < splitString.length; i++) {
			if (splitString[i].length() < smallest.length()) {
				smallest = splitString[i];
			}
			if (splitString[i].length() > largest.length()) {
				largest = splitString[i];
			}
		}
		System.out.println("Smallest word  is [" + smallest + "]");
		System.out.println("Largest word is [" + largest + "]");

	}

	public static void main(String[] args) {
		String str = "My Village is a beautiful place";
		FindSmallestAndLargestSubString.subString(str);
	}

}
