package com.module2and3.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotateElementsOfList {

	public static void main(String[] args) {
		List<Integer> list  = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		// rotate elements 3 steps forward
		Collections.rotate(list, 3);
		
		for(int i : list) {
			System.out.println(i);
		}
	}
}
