package com.assignment2;

public class MinimunPoint {
	public static void minimunPoint() {

		int x = -3000;
		int y = -3000;
		double min = 10000000.;
		int min_x = 0, min_y = 0;
		while (x++ < 3000) {
			while (y++ < 3000) {

				double f = (1 + x) * (1 + x);
				if (f < min) {
					min_x = x;
					min = f;
					min_y = y;
				}

			}

		}
		System.out.println(min + " " + min_x + " " + min_y);

	}

	public static void main(String[] args) {
		MinimunPoint.minimunPoint();
	}
}
