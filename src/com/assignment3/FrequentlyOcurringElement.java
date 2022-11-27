package com.assignment3;

public class FrequentlyOcurringElement {
	public static int frequentlyOcurringElement(int list[]) {
		int maxFreq = 0;
		int mostFrequent = -1;
		for (int i = 0; i < list.length; i++) {
			int countFreq = 1;
			for (int j = 0; j < list.length; j++) {
				if (list[i] == list[j]) {
					countFreq = countFreq + 1;
				}
			}
			if (maxFreq < countFreq) {
				maxFreq = countFreq;
				mostFrequent = list[i];
			} else if (maxFreq == countFreq) {
				mostFrequent = Math.min(mostFrequent, list[i]);
			}
		}
		return mostFrequent;
	}

	public static void main(String[] args) {
		int[] arr = { 12, 12, 27 };
		int res = frequentlyOcurringElement(arr);
		System.out.println(res);

	}

}
