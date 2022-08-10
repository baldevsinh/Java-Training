package com.module2and3.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DisplayDateAndTime {

	public static void main(String[] args) {
		
		// method - 1 using Date
		
		System.out.println("(1)Current Date and Time :"+new Date().toString());
		
		//method - 2 using Calander
		
		Calendar cal = Calendar.getInstance();
		System.out.println("(2)Current Date and Time :"+cal.getTime());
		
		//method - 3 using java.time.LocalDate class and its now() method
		//display current date
		LocalDate local = LocalDate.now();
		System.out.println("(3)Current Date :"+local);
		
		//display current time
		LocalTime time = LocalTime.now();
		System.out.println("(4)Current Time :"+time);
		
		// method - 4 displaying date and time together
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println("(5)Current Date and Time :"+dt);
		
		
	}
}
