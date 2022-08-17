package com.module2and3.dates;

import java.text.DateFormat;
import java.util.*;

public class DisplayTimeInDifferentCountriesFormat {
	
	public static void main(String[] args) throws Exception {

		Date date = new Date();

		String french = DateFormat.getDateInstance(DateFormat.LONG, Locale.FRENCH).format(date);
		System.out.println("french	: "+french);

		String china = DateFormat.getDateInstance(DateFormat.LONG, Locale.CHINA).format(date);
		System.out.println("china	: "+china);

		String german = DateFormat.getDateInstance(DateFormat.LONG, Locale.GERMAN).format(date);
		System.out.println("german	: "+german);

		String italy = DateFormat.getDateInstance(DateFormat.LONG, Locale.ITALY).format(date);
		System.out.println("italy	: "+italy);

		String korea = DateFormat.getDateInstance(DateFormat.LONG, Locale.KOREA).format(date);
		System.out.println("korea	: "+korea);

		String uk = DateFormat.getDateInstance(DateFormat.LONG, Locale.UK).format(date);
		System.out.println("uk	: "+uk);

		String us = DateFormat.getDateInstance(DateFormat.LONG, Locale.US).format(date);
		System.out.println("us	: "+us);
	}
}
