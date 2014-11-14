package com.jpmorgan.hotel.room;

import java.math.BigDecimal;

/**
 * Abstract root class for Hotel rooms
 * 
 * @author hiral
 * 
 */
public abstract class AbstractRoom {
	/**
	 * Attribute used to store room id id
	 */
	private String id;

	/**
	 * Sets the room id
	 * 
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Gets the room id
	 * 
	 * @param id
	 *            the id to set
	 */
	protected void setId(String id) {
		this.id = id;
	}

	/**
	 * Calculating room price
	 * @param facilities
	 * @return
	 */
	public abstract BigDecimal calculatePrice(String... facilities);
}
