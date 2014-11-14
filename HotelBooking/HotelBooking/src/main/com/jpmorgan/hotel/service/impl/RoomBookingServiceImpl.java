package com.jpmorgan.hotel.service.impl;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;

import com.jpmorgan.hotel.room.AbstractRoom;
import com.jpmorgan.hotel.service.RoomBookingService;

/**
 * Room service impl
 */
public class RoomBookingServiceImpl implements RoomBookingService {
	/**
	 * availableRooms
	 */
	private Map<String, AbstractRoom> availableRooms;

	/**
	 * 
	 * @param id
	 * @param facilities
	 * @return
	 */
	public BigDecimal quoteRoom(String id, String... facilities) {
		AbstractRoom room = availableRooms.get(id);
		availableRooms.remove(id);

		return room.calculatePrice(facilities);
	}

	/**
	 * 
	 * @return
	 */
	public Collection<AbstractRoom> getAvailableRooms() {
		return availableRooms.values();
	}

	@Override
	public void addRoom(AbstractRoom room) {
		availableRooms.put(room.getId(), room);
	}

	/**
	 * @param availableRooms
	 *            the availableRooms to set
	 */
	public void setAvailableRooms(Map<String, AbstractRoom> availableRoomsParam) {
		availableRooms = availableRoomsParam;
	}
}
