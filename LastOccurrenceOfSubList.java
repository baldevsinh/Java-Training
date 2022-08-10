package com.module2and3.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LastOccurrenceOfSubList {

	public static void main(String[] args) {
		// this is our source list
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(2);
		
		// this is our target list
		List<Integer> subList = new ArrayList<>();
		subList.add(1);
		subList.add(2);
		
		
		int tmp = Collections.lastIndexOfSubList(list, subList);
		
		if(tmp > -1) {
			System.out.println("list contains the specified sublist");
			System.out.println("last index of specified sublist in list is :"+tmp);
		}
		else
			System.out.println("list does not contain the specified sublist");
		
	}
}
