package com.question1;

//(a)How to access the index of values present in the enum ?
enum Subjects {
	DBMS, DSA, NETWORKING, OPERATING_SYSTEMS;
}

public class EnumTest {
	public static void main(String args[]) {
		Subjects[] subjects = Subjects.values();

		for(Subjects s : subjects) {
			System.out.println("Index of "+s+" is "+s.ordinal());
		}
	}
}
