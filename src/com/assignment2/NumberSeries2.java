package com.assignment2;

public class NumberSeries2 {
	public static void series2(int tillUpto) {
		int i = 1;
		while (i < tillUpto) {
			System.out.print(i + ",");
			i += 2;

		}

	}

	public static void main(String[] args) {
		NumberSeries2.series2(12);

	}

}
