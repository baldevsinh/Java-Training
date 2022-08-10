package com.module2and3.strings;

import java.util.Arrays;

public class Anagram {

	public static boolean isValid(String str1, String str2) {
		char [] arr1 = str1.toCharArray();
		char [] arr2 = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		boolean tmp = Arrays.equals(arr1, arr2);
		
		return tmp;
	}
	
	public static void main(String[] args) {
		String s1 = "anagram";
		String s2 = "nagaram";
		
		System.out.println(isValid(s1, s2));
	}
}
