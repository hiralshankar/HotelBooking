package com.jpmorgan.hotel.facilities;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
/**
 * Hotel Facility Singleton
 * @author user
 *
 */
public enum HotelFacilities {
	FACILITY;

	private static final Map<String, Facility> facilityMap;

	static {
		facilityMap = new HashMap<String, Facility>();

		// populate all facilities statically
		Facility facility1 = new Facility();
		facility1.setId(1);
		facility1.setDescription("ROOM_BREAKFAST");
		facility1.setPrice(new BigDecimal("5.0"));
		facilityMap.put(facility1.getDescription(), facility1);

		Facility facility2 = new Facility();
		facility2.setId(2);
		facility2.setDescription("ENSUITE_BATHROOM");
		facility2.setPrice(new BigDecimal("4.0"));
		facilityMap.put(facility2.getDescription(), facility2);

		Facility facility3 = new Facility();
		facility3.setId(3);
		facility3.setDescription("INTERNET");
		facility3.setPrice(new BigDecimal("2.0"));
		facilityMap.put(facility3.getDescription(), facility3);

		Facility facility4 = new Facility();
		facility4.setId(4);
		facility4.setDescription("LATE_CHECKOUT");
		facility4.setPrice(new BigDecimal("1.0"));
		facilityMap.put(facility4.getDescription(), facility4);

		Facility facility5 = new Facility();
		facility5.setId(5);
		facility5.setDescription("SWIMMINGPOOL");
		facility5.setPrice(new BigDecimal("1.0"));
		facilityMap.put(facility5.getDescription(), facility5);
	}

	/**
	 * @return the facilityMap
	 */
	public static Map<String, Facility> getFacilityMap() {
		return facilityMap;
	}

	public static Facility getFacility(String facilityStr) {
		return facilityMap.get(facilityStr);
	}
}
