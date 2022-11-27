package com.assignment2;

public class BinaryToDecimal {
	public static void binaryToDecimal(int binaryValue) {
		int i = 0;
		int toDecimal = 0;
		String str = Integer.toString(binaryValue);
		int length = str.length();
		while (i < length) {
			int number = binaryValue % 10;
			binaryValue = binaryValue / 10;
			toDecimal += number * Math.pow(2, i);
			i++;
		}
		System.out.println(toDecimal);

	}

	public static void main(String[] args) {
		BinaryToDecimal.binaryToDecimal(1000001);

	}

}
