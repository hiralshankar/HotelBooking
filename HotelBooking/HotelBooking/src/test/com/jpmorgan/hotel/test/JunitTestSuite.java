package com.jpmorgan.hotel.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
/**
 * JUnit test suite
 * @author hiral
 *
 */
//JUnit Suite Test
@RunWith(Suite.class)
@Suite.SuiteClasses({ AvailableRoomsTest.class, OccupyRoomTest.class,
		VacateRoomTest.class })
public class JunitTestSuite {
}