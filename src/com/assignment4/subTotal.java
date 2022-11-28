package com.assignment4;

public class subTotal {

	public static double[] SubTotal(double list[]) {

		double total = 0;
		for (int i = 0; i < list.length; i++) {

			total += list[i];
			list[i] = total;

		}

		return list;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double list[] = { 5.8, 2.6, 9.1, 3.4, 7.0 };

	}

}
