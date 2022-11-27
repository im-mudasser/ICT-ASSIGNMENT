package com.assignment3;

import java.util.ArrayList;

/* Write a Python program to create a list by concatenating a given list 
which range goes from 1 to n.
Sample list: ['p', 'q']
n =5
Sample Output : ['p1', 'q1', 'p2', 'q2', 'p3', 'q3', 'p4', 'q4', 'p5', 'q5']*/
public class ConcatList {
	public static void concatList(String list[], int n) {
		ArrayList<String> newList = new ArrayList<String>();
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < list.length; j++) {
				newList.add(list[j] + i);
			}

		}
		System.out.println(newList);
	}

	public static void main(String[] args) {
		String[] list = { "p", "q" };
		ConcatList.concatList(list, 2);

	}

}
