package com.jpmorgan.hotel.room.impl;

import java.math.BigDecimal;

import com.jpmorgan.hotel.room.AbstractRoom;

/**
 * Room class to represent Standard Rooms
 * 
 * Revision 1.0 - Refactoring by Hiral
 * 
 * @author jpmorgan, hiral
 * 
 */
public class StandardRoom extends AbstractRoom {

	private final Integer FACILITY_DEFAULT_PRICE_THRESHOLD = 3;
	private final BigDecimal FACILITY_DEFAULT_PRICE = new BigDecimal("3.0");
	private final BigDecimal FACILITY_BEYOND_THRESHOLD_PRICE = new BigDecimal(
			"6.0");

	/**
	 * Constructor creating standard room and set room id
	 * 
	 * @param id
	 *            RoomId
	 */
	public StandardRoom(String id) {
		setId(id);
	}

	/**
	 * 
	 * @param facilities
	 * @return
	 */
	public BigDecimal calculatePrice(String... facilities) {
		if (facilities.length > FACILITY_DEFAULT_PRICE_THRESHOLD) {
			BigDecimal price = FACILITY_DEFAULT_PRICE
					.multiply(FACILITY_DEFAULT_PRICE);
			BigDecimal remainingFacilitiesLength = new BigDecimal(
					facilities.length - FACILITY_DEFAULT_PRICE_THRESHOLD);
			price = price.add(FACILITY_BEYOND_THRESHOLD_PRICE
					.multiply(remainingFacilitiesLength));
			return price;
		} else {
			return FACILITY_DEFAULT_PRICE.multiply(new BigDecimal(
					facilities.length));
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StandardRoom :" + getId();
	}
}
