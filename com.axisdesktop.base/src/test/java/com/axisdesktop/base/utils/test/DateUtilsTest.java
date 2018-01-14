package com.axisdesktop.base.utils.test;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.axisdesktop.base.utils.DateUtils;

class DateUtilsTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void testCalendarToString() {
		Calendar calendar = Calendar.getInstance();
		calendar.set( 2014, Calendar.FEBRUARY, 16, 22, 12, 56 );

		assertEquals( new String( "2014-02-16 22:12:56" ), DateUtils.calendarToString( calendar ) );
	}

}
