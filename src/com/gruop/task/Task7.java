package com.gruop.task;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		int numbers[] = new int[] { 3, 5, 13, 94, 22, 11, 23 };
		int smallest = numbers[0];
		int largest = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > largest)
				largest = numbers[i];
			else if (numbers[i] < smallest)
				smallest = numbers[i];

		}

		System.out.println(smallest);
		System.out.println(largest);
	}
}