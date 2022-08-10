package com.module2and3.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class AddTimeToDate {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2022, Month.AUGUST, 8);
		LocalDateTime dateTime = date.atTime(LocalTime.of(10, 8));
		
		System.out.println(dateTime);
	}
}
