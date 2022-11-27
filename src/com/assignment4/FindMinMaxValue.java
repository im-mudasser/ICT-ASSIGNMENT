package com.assignment4;

public class FindMinMaxValue {

	public static void main(String[] args) {
		int arr[] = { 1, 0, 5, -1, 4, 5, 22 };
		minMaxValue(arr);

	}

	private static void minMaxValue(int[] arr) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)

				max = arr[i];

			else {
				if (arr[i] < min)

					min = arr[i];

			}
		}
		System.out.println("Max value in array is  : " + max + " Min value in array is  : " + " " + min);
	}

}
