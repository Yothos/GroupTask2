package com.gruop.task;

public class Task8 {

	public static void main(String[] args) {
		
		int largest=0;
		int secondLargest=0;
		
		int[]arr= {13,24,54,75,35,68};
		
		for (int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondLargest = largest;
				largest = arr[i];
			}else if(arr[i]>secondLargest) {
				secondLargest=arr[i];
			}
		}
		System.out.println(secondLargest);

	}

}
