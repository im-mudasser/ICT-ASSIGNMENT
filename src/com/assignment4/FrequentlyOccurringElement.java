package com.assignment4;

public class FrequentlyOccurringElement {

	public static void main(String[] args) {
		int arr[] = { 27, 27, 15, 15, 300, 1, 1, 1, 1, 1, 30, 1, 6, 7, 30 };

		findMostFrequentButMiniValue(arr);
	}

	private static void findMostFrequentButMiniValue(int[] arr) {

		int mostfrequent = arr[0];
		int maxfreq = -1;
		for (int i = 0; i < arr.length; i++) {
			int count = 1;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > maxfreq) {
				maxfreq = count;
				mostfrequent = arr[i];
			} else if (count == maxfreq) {
				mostfrequent = Math.min(mostfrequent, arr[i]);
			}

		}

		System.out.println(mostfrequent);

	}

}
