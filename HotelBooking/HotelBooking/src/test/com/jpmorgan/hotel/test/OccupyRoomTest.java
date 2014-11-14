package com.jpmorgan.hotel.test;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

import com.jpmorgan.hotel.service.RoomBookingService;
import com.jpmorgan.hotel.service.impl.InitialDataPopulatorServiceImpl;
/**
 * Testing Occupy rooms 
 * @author hiral
 *
 */
public class OccupyRoomTest {

	@Test
	public void testOccupyRoomsIncorrect() {
		InitialDataPopulatorServiceImpl inital = new InitialDataPopulatorServiceImpl();
		RoomBookingService service = inital.getInitialRoomBookingService();

		assertEquals(10, service.getAvailableRooms().size());

		String[] facility = new String[] { "ROOM_BREAKFAST" , "ENSUITE_BATHROOM"};
		BigDecimal price = service.quoteRoom("GV1", facility);

		assertEquals(price, new BigDecimal("10.00"));
	}
	
	@Test
	public void testOccupyRoomsCorrect() {
		InitialDataPopulatorServiceImpl inital = new InitialDataPopulatorServiceImpl();
		RoomBookingService service = inital.getInitialRoomBookingService();

		assertEquals(10, service.getAvailableRooms().size());

		String[] facility = new String[] { "ROOM_BREAKFAST" };
		BigDecimal price = service.quoteRoom("GV1", facility);

		assertEquals(price, new BigDecimal("10.00"));
	}
}