package com.jpmorgan.hotel.service;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;

import com.jpmorgan.hotel.room.AbstractRoom;

public interface RoomBookingService {

	public BigDecimal quoteRoom(String id, String... facilities);

	public Collection<AbstractRoom> getAvailableRooms();

	public void addRoom(AbstractRoom room);

	public void setAvailableRooms(Map<String, AbstractRoom> availableRoomsParam);
}
