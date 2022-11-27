package com.assignment2;

public class Currency {

	public static void currency(int n) {
		int combination1 = 6 + 9;
		int combination2 = 6 + 20;
		int combination3 = 9 + 20;
		if (n >= 0) {
			if (combination1 == n || combination2 == n || combination3 == n) {
				System.out.println("Yes possible");
			} else {
				System.out.println("Not possible");
			}
		} else {
			System.out.println(n + " currency cannot be negative");
		}

	}

	public static void main(String[] args) {
		Currency.currency(12);

	}

}
