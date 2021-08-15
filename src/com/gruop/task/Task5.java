package com.gruop.task;

public class Task5 {

	public static void main(String[] args) {
        int[] numbers= {9,11,13,15,23,26,29};
		
		for (int r=0; r<numbers.length; r++) {
			if (numbers[r]%1==r || numbers[r]%r==0) {
				
			}
			System.out.println(numbers[r]);
		}
}
}