package com.gruop.task;

public class Task3 {

	public static void main(String[] args) {
		int[][] num = { { 1, 2, 4, 5 }, { 12, 24, 13, 54 }, { 3, 45, 38, 96 } };
		int even = 0, odd = 0, sumEven = 0, sumOdd = 0;

		for (int i = 0; i < num.length; i++) {
			for (int a = 0; a < num[i].length; a++) {
				if (num[i][a] % 2 == 0) {
					even = num[i][a];
					sumEven += even;
				} else if (num[i][a] % 2 != 0) {
					odd = num[i][a];
					sumOdd += odd;
				}

			}
		}
		System.out.println("Odd sum " + sumOdd + " ");
		System.out.println("Even sum " + sumEven + " ");

	}

}
