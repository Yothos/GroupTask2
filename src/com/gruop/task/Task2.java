package com.gruop.task;

public class Task2 {

	public static void main(String[] args) {
		int[][] num = { 
				{ 1, 2, 3, 4 },
				{ 5, 8, 9, 12 } 
				};
		int even = 0, odd = 0;
		for (int i = 0; i < num.length; i++) {
			for (int r = 0; r < num[i].length; r++) {
				if (num[i][r] % 2 == 0) {
					even = num[i][r];
					System.out.println(even + " ");
				} else if (num[i][r] % 2 == 0) {
					odd = num[i][r];
				}
			}
		}

	}

}
