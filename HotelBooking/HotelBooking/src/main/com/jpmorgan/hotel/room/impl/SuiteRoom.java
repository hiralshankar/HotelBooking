package com.jpmorgan.hotel.room.impl;

import java.math.BigDecimal;

import com.jpmorgan.hotel.facilities.Facility;
import com.jpmorgan.hotel.facilities.HotelFacilities;
import com.jpmorgan.hotel.room.AbstractRoom;

/**
 * Room class to represent Suite Rooms
 * 
 * Revision 1.0 - Refactoring by Hiral
 * 
 * @author jpmorgan, hiral
 * 
 */
public class SuiteRoom extends AbstractRoom {

	/**
	 * Constructor creating suite room and set room id
	 * 
	 * @param id
	 *            RoomId
	 */
	public SuiteRoom(String id) {
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
		return price;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SuiteRoom :" + getId();
	}
}
