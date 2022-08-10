package com.module2and3.arrays;

import java.util.Arrays;

public class FindDuplicateInArray {

	public static int removeDuplicate(int[] arr) {
		int d = -1;
		Arrays.sort(arr);
		int i = 0;
		while(i < arr.length) {
			if( i+1 < arr.length && arr[i] == arr[i+1]) {
				d = arr[i];
				
				break;
				
			}
			i++;
		}
		//when array doesn't contains any duplicates then it returns -1
		return d;
	}

	public static void main(String[] args) {
		int[] a = { 1,2,3,3,4,4 };
		System.out.println(removeDuplicate(a));
	}
}
