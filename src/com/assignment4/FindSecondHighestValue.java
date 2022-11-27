package com.assignment4;

public class FindSecondHighestValue {

	public static void main(String[] args) {
		int arr[] = { 27, 27, 15, 15, 300, 1, 1, 1, 1, 1, 30, 1, 6, 7, 30 };
		System.out.println(findSecondHighestValue(arr));
	}

	private static int findSecondHighestValue(int[] arr) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				secondMax = max;
				max = arr[i];
			} else {
				if (arr[i] == max) {
					continue;
				} else if (arr[i] > secondMax) {
					secondMax = arr[i];
				}
			}
		}

		return secondMax;

	}

}
