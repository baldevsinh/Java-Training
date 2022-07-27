package com.question1;

//(b)Which kind of Exception will be thrown when we trying to access 
//the element which is not present in the enum ?
enum Subjects1{
	DBMS, DSA, NETWORKING, OPERATING_SYSTEMS;
} 

public class EnumTest2{
	public static void main(String args[]){
		
		//we take one subject which is not available in enum in order to 
		//throw an exception
		//it will throw java.lang.IllegalArgumentException
	
		String str = "JAVA";
 
		System.out.println(Subjects1.valueOf(str));
}
}
