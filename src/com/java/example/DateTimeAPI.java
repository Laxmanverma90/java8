package com.java.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeAPI {
	
	public static void main(String[] args) {
		DateTimeAPI api =  new DateTimeAPI();
		api.localDateTimeExp();
//		api.zonedTimeAndDate();
	}

	public void localDateTimeExp() {
		// the current date
		LocalDate date = LocalDate.now();
		System.out.println("the current date is " + date);

		// the current time
		LocalTime time = LocalTime.now();
		System.out.println("the current time is " + time);

		// will give us the current time and date
		LocalDateTime current = LocalDateTime.now();
		System.out.println("current date and time : " + current);

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatedDateTime = current.format(format);
		System.out.println("in foramatted manner " + formatedDateTime);
		
		LocalDate date2 =  LocalDate.of(2014, Month.DECEMBER, 12); 
	  
	    Period timePeriod = Period.between(date2, date); 
	    System.out.println("timePeriod = "+timePeriod);
	}

	public void zonedTimeAndDate(){
	    LocalDateTime date = LocalDateTime.now(); 
	    DateTimeFormatter format1 =  
	      DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
	      
	    String formattedCurrentDate = date.format(format1); 
	      
	    System.out.println("formatted current Date and Time : "+formattedCurrentDate);  
	  
	    // to get the current zone 
	    ZonedDateTime currentZone = ZonedDateTime.now();  
	    System.out.println("the current zone is "+currentZone.getZone());  
	    ZoneId tokyo = ZoneId.of("Asia/Tokyo"); 
	    ZonedDateTime tokyoZone = currentZone.withZoneSameInstant(tokyo); 
	    System.out.println("tokyo time zone is " +tokyoZone);
	}
}
