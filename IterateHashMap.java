package com.module2and3.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IterateHashMap {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "Java");
		map.put(2, "Javascript");
		map.put(3, "Python");
		
		Set<Map.Entry<Integer,String>> set = map.entrySet();
		
		
		
		Iterator<Map.Entry<Integer, String>> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}
}
