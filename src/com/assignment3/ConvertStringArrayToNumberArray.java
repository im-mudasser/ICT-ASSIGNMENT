package com.assignment3;

import java.util.ArrayList;

public class ConvertStringArrayToNumberArray {
	public static void toNumbers(String strList[]) {
		ArrayList<Integer> integers = new ArrayList<>();
		for (int i = 0; i < strList.length; i++) {
			integers.add(Integer.parseInt(strList[i]));

		}
		System.out.println(integers);

	}

	public static void main(String[] args) {
		String[] str = { "1", "2", "3" };
		ConvertStringArrayToNumberArray.toNumbers(str);
	}

}
