package com.axisdesktop.base.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtils {
	public static String calendarToString( Calendar cal ) {
		if( cal == null ) return "";

		SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );

		return sdf.format( cal.getTime() );
	}
}
