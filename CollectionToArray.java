package com.module2and3.collections;

import java.util.ArrayList;

import java.util.List;

public class CollectionToArray {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		Object[] arr =  list.toArray();
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
