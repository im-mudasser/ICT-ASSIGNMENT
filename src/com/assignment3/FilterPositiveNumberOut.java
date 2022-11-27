package com.assignment3;

import java.util.ArrayList;

public class FilterPositiveNumberOut {
	public static void filterPositiveNumberOut(int originalArr[]) {
		ArrayList<Integer> filterArrayList = new ArrayList<>();
		for (int i = 0; i < originalArr.length; i++) {
			if (originalArr[i] < 0) {
				filterArrayList.add(originalArr[i]);
			}
		}
		System.out.println(filterArrayList);
	}

	public static void main(String[] args) {
		int originalArr[] = { 2, -16, 2, -5, 0, 1, -2, -3 };
		FilterPositiveNumberOut.filterPositiveNumberOut(originalArr);
	}

}
