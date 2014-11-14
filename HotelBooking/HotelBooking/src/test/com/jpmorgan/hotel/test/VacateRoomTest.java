package com.jpmorgan.hotel.test;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

import com.jpmorgan.hotel.room.AbstractRoom;
import com.jpmorgan.hotel.room.impl.GreatViewRoom;
import com.jpmorgan.hotel.service.RoomBookingService;
import com.jpmorgan.hotel.service.impl.InitialDataPopulatorServiceImpl;
/**
 * Tsting vacate room
 * @author hiral
 *
 */
public class VacateRoomTest {

	@Test
	public void testVacateRoomsIncorrect() {
		InitialDataPopulatorServiceImpl inital = new InitialDataPopulatorServiceImpl();
		RoomBookingService service = inital.getInitialRoomBookingService();

		assertEquals(10, service.getAvailableRooms().size());

		String[] facility = new String[] { "ROOM_BREAKFAST" };
		BigDecimal price = service.quoteRoom("GV1", facility);

		assertEquals(price, new BigDecimal("0.0"));
		AbstractRoom gvRoom1 = new GreatViewRoom("GV1");
		service.addRoom(gvRoom1);

		assertEquals(10, service.getAvailableRooms().size());
	}
	
	@Test
	public void testVacateRoomsCcorrect() {
		InitialDataPopulatorServiceImpl inital = new InitialDataPopulatorServiceImpl();
		RoomBookingService service = inital.getInitialRoomBookingService();

		assertEquals(10, service.getAvailableRooms().size());

		String[] facility = new String[] { "ROOM_BREAKFAST" };
		BigDecimal price = service.quoteRoom("GV1", facility);

		assertEquals(price, new BigDecimal("10.00"));
		AbstractRoom gvRoom1 = new GreatViewRoom("GV1");
		service.addRoom(gvRoom1);

		assertEquals(10, service.getAvailableRooms().size());
	}
}