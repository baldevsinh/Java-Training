package com.module2and3.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSublistInList {

	public static void main(String[] args) {
		// this is our source list
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		// this is our target list
		List<Integer> subList = new ArrayList<>();
		subList.add(4);
		subList.add(5);
		subList.add(6);
		
		int tmp = Collections.indexOfSubList(list, subList);
		
		if(tmp > -1) {
			System.out.println("list contains the specified sublist");
			System.out.println("starting index of specified sublist in list is :"+tmp);
		}
		else
			System.out.println("list does not contain the specified sublist");
		
	}
}
