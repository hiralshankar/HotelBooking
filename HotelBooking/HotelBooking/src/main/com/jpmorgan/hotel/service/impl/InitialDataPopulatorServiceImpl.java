package com.jpmorgan.hotel.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.jpmorgan.hotel.room.AbstractRoom;
import com.jpmorgan.hotel.room.impl.GreatViewRoom;
import com.jpmorgan.hotel.room.impl.StandardRoom;
import com.jpmorgan.hotel.room.impl.SuiteRoom;
import com.jpmorgan.hotel.service.InitialDataPopulatorService;
import com.jpmorgan.hotel.service.RoomBookingService;
/**
 * Populate initial room data
 * @author hiral
 *
 */
public class InitialDataPopulatorServiceImpl implements
		InitialDataPopulatorService {

	@Override
	public RoomBookingService getInitialRoomBookingService() {
		Map<String, AbstractRoom> availableRooms = new HashMap<String, AbstractRoom>();

		// add 2 great view rooms
		AbstractRoom gvRoom1 = new GreatViewRoom("GV1");
		availableRooms.put(gvRoom1.getId(), gvRoom1);

		AbstractRoom gvRoom2 = new GreatViewRoom("GV2");
		availableRooms.put(gvRoom2.getId(), gvRoom2);

		// add 3 suite rooms
		AbstractRoom suiteRoom1 = new SuiteRoom("S1");
		availableRooms.put(suiteRoom1.getId(), suiteRoom1);

		AbstractRoom suiteRoom2 = new SuiteRoom("S2");
		availableRooms.put(suiteRoom2.getId(), suiteRoom2);

		AbstractRoom suiteRoom3 = new SuiteRoom("S3");
		availableRooms.put(suiteRoom3.getId(), suiteRoom3);

		// add 5 standard rooms
		AbstractRoom stdRoom1 = new StandardRoom("STD1");
		availableRooms.put(stdRoom1.getId(), stdRoom1);

		AbstractRoom stdRoom2 = new StandardRoom("STD2");
		availableRooms.put(stdRoom2.getId(), stdRoom2);

		AbstractRoom stdRoom3 = new StandardRoom("STD3");
		availableRooms.put(stdRoom3.getId(), stdRoom3);

		AbstractRoom stdRoom4 = new StandardRoom("STD4");
		availableRooms.put(stdRoom4.getId(), stdRoom4);

		AbstractRoom stdRoom5 = new StandardRoom("STD5");
		availableRooms.put(stdRoom5.getId(), stdRoom5);

		RoomBookingService roomBookingService = new RoomBookingServiceImpl();
		roomBookingService.setAvailableRooms(availableRooms);

		return roomBookingService;
	}

}
