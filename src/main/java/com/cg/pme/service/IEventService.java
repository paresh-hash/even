package com.cg.pme.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import com.cg.pme.exception.EventManagementException;
import com.cg.pme.model.Event;

public interface IEventService {
	String add_event(Event event) throws EventManagementException;

	boolean remove_event(String serialNumber) throws EventManagementException;

	Set<Event> list_events() throws EventManagementException;

	List<Event> list_events_location() throws EventManagementException;

	List<Event> list_location(String location) throws EventManagementException;

	List<Event> list_events_date(LocalDate startDate) throws EventManagementException;

	void persist() throws EventManagementException;

}
