package com.assignment3;

public class SumOfDiagonalMatrix {
	public static void sumOfMatrix(int list[][]) {
		int sumOfDiagonal = 0;
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length; j++) {
				if (i == j) {
					sumOfDiagonal += list[i][j];
				}
			}
		}
		System.out.println("Sum of Diagonal is :" + sumOfDiagonal);
	}

	public static void main(String[] args) {
		int list[][] = { { 3, 4, 5 }, { 1, 2, 3 }, { 4, 7, 1 } };
		SumOfDiagonalMatrix.sumOfMatrix(list);

	}

}
