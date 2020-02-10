package com.stopbeing7.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateUtil du = new DateUtil();
		System.out.println("Current Date Time: " + currentDateTime());
	}
	
	public static String currentDateTime()
	{
	    Date date = Calendar.getInstance().getTime();  
	    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  
	    String strDate = dateFormat.format(date);  
		return strDate.toString();
	}

}
