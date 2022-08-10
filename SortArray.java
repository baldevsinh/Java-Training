package com.module2and3.arrays;

public class SortArray {

	public static void sortArray(int [] arr) {
		int count0 = 0, count1 = 0, count2 = 0;
		
		for(int i = 0; i<arr.length; i++) {
			switch(arr[i]) {
			case 0 : 
				count0++;
				break;
			case 1 :
				count1++;
				break;
			case 2 :
				count2++;
				break;
			}
			
		}
		
		//update array
		int i = 0;
		while(count0 > 0) {
			arr[i] = 0;
			count0--;
			i++;
		}
		
		while(count1 > 0) {
			arr[i] = 1;
			count1--;
			i++;
		}
		
		while(count2 > 0) {
			arr[i] = 2;
			count2--;
			i++;
		}
	}
	public static void main(String[] args) {
		int [] a = {2,2,1,0,2,1,0,0,1};
		sortArray(a);
		for(int i : a) {
			System.out.print(i+" ");
		}
	}
}
