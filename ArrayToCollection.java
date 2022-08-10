package com.module2and3.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayToCollection {

	public static  void toList(int [] arr){
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i<arr.length; i++) {
			list.add(arr[i]);
		}
		
		for(int i : list) {
			 System.out.println(i);
		 }
	}
	
	public static void main(String[] args) {
		int [] a = {1,2,3,4};
		 toList(a);
		 
		 
	}
}
