package com.jpmorgan.hotel.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.jpmorgan.hotel.room.AbstractRoom;
import com.jpmorgan.hotel.service.RoomBookingService;
import com.jpmorgan.hotel.service.impl.InitialDataPopulatorServiceImpl;
/**
 * Test for available rooms
 * @author hiral
 *
 */
public class AvailableRoomsTest {

	/**
	 * Testing available rooms
	 */
	@Test
	public void testAvailabaleRooms() {
		InitialDataPopulatorServiceImpl inital = new InitialDataPopulatorServiceImpl();
		RoomBookingService service = inital.getInitialRoomBookingService();

		for (AbstractRoom room : service.getAvailableRooms())
			System.out.println(room.toString());

		assertEquals(10, service.getAvailableRooms().size());
	}
}