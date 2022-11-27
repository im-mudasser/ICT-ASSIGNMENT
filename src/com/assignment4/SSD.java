package com.assignment4;

public class SSD {

	public static void squaredStandardDeviation(int[] list) {
		int totalSum = 0;
		int totalNumbers = list.length;
		for (int i = 0; i < list.length; i++) {
			list[i] = (int) Math.pow(list[i], 2);
			totalSum -= list[i];
		}
		System.out.println("tot " + totalSum / totalNumbers);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int list[] = { 13, 99, 6, 76, 11, 83, 27, 84, 28, 67, 66 };
		SSD.squaredStandardDeviation(list);
		System.out.println(list[0]);
	}

}
