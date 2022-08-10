package com.module2and3.strings;



public class LengthOfLastWord {

	public static int getLength(String str) {
		
		StringBuilder sb = new StringBuilder(str);
		
		sb.reverse();
		
		String [] words = sb.toString().split(" ",0);
		
		return words[0].length();
	}
	
	public static void main(String[] args) {
		
		String s = "luffy is still joyboy";
		
		System.out.println(getLength(s));
	}
}
