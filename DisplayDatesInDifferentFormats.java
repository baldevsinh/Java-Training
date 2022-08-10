package com.module2and3.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DisplayDatesInDifferentFormats {

	
	public static void main(String[] args) {
//		 1. yyyy-MM-dd
		LocalDate local = LocalDate.now();
		System.out.println("yyyy-MM-dd format :"+local);
		
//		 2. DD/MM/YY
		LocalDateTime local2 = LocalDateTime.now();
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String tmp = f.format(local2);
		System.out.println("dd/MM/yyyy format :"+tmp);
		
//		 3. dd MMM yyyy
		LocalDateTime local3 = LocalDateTime.now();
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd MMM yyyy");
		String tmp2 = f2.format(local3);
		System.out.println("dd MMM yyyy format :"+tmp2);
		
//		 4. E dd MMM yyyy
		LocalDateTime local4 = LocalDateTime.now();
		DateTimeFormatter f3 = DateTimeFormatter.ofPattern("E dd MMM yyyy");
		String tmp3 = f3.format(local4);
		System.out.println("E dd MMM yyyy format :"+tmp3);
		
	}
}
