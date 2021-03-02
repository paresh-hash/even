package com.cg.pme.service;

import java.util.Comparator;

import com.cg.pme.model.Event;

public class LocationComparator implements Comparator<Event> {

	@Override
	public int compare(Event e1, Event e2) {

		String location = e1.getLocation();
		String otherLocation = e2.getLocation();
		return location.compareTo(otherLocation);
	}

}
