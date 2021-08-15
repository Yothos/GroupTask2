package com.gruop.task;

public class Task1 {

	public static void main(String[] args) {

		int[][] num = { { 10, 12, 14 }, { 27, 23, 56 }, { 34, 65, 38 } };

		int sum = 0;

		for (int i = 0; i < num.length; i++) {
			for (int a = 0; a < num[i].length; a++) {
				sum = sum + num[i][a];
			}
		}		
		System.out.println(sum);
	}
}