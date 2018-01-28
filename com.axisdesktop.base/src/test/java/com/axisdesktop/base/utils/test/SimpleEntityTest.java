package com.axisdesktop.base.utils.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Calendar;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.axisdesktop.base.db.entity.SimpleEntity;

class SimpleEntityTest {
	static Calendar cal;
	static SimpleEntity<Integer> entity;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cal = Calendar.getInstance();
		entity = new SimpleEntity<>();
		entity.setCreated( cal );
		entity.setDescription( "long description" );
		entity.setId( 105 );
		entity.setModified( cal );
		entity.setName( "test case" );
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void testToString() {
		System.out.println( entity.toString() );
	}

	@Test
	void testGetDescription() {
		assertTrue( "long description".equals( entity.getDescription() ) );
	}

	@Test
	void testGetName() {
		assertTrue( "test case".equals( entity.getName() ) );
	}

	@Test
	void testGetId() {
		assertTrue( entity.getId() == 105 );
	}

	@Test
	void testGetCreated() {
		assertTrue( entity.getCreated() == cal );
	}

	@Test
	void testGetModified() {
		assertTrue( entity.getModified() == cal );
	}

}
