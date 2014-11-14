package com.jpmorgan.hotel.room.impl;

import java.math.BigDecimal;

import com.jpmorgan.hotel.facilities.Facility;
import com.jpmorgan.hotel.facilities.HotelFacilities;
import com.jpmorgan.hotel.room.AbstractRoom;

/**
 * Room class to represent Great View Rooms
 * 
 * Revision 1.0 - Refactoring by Hiral
 * 
 * @author jpmorgan, hiral
 * 
 */
public class GreatViewRoom extends AbstractRoom {

	private final BigDecimal MULTIPLYING_FACTOR = new BigDecimal("2.0");

	/**
	 * Constructor great view room and set room id
	 * 
	 * @param id
	 *            RoomId
	 */
	public GreatViewRoom(String id) {
		setId(id);
	}

	/**
	 * 
	 * @param facilities
	 * @return
	 */
	public BigDecimal calculatePrice(String... facilities) {
		BigDecimal price = BigDecimal.ZERO;
		for (String facility : facilities) {
			Facility facilityObj = HotelFacilities.FACILITY
					.getFacility(facility);

			if (null != facilityObj)
				price = price.add(facilityObj.getPrice());
		}
		return price.multiply(MULTIPLYING_FACTOR);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GreatViewRoom :" + getId();
	}
}
