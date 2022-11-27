package com.assignment2;

public class NumberSeries1 {
	public static void series1(int tillUpto) {
		int i = 1;
		int lowerPart = 2;
		int upperPart = 0;
		while (i < tillUpto) {
			upperPart += i;
			System.out.print(upperPart + "/" + lowerPart + ",");
			i *= 2;
			lowerPart *= 2;
		}
	}

	public static void main(String[] args) {
		NumberSeries1.series1(12);
	}

}
