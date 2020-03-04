package testPacientSKY.controllers;

import java.util.List;

import testPacientSKY.model.Appointments;
import testPacientSKY.model.Timeslots;

public class FindFreeTimeSlots {
	
	public List<Appointments> theList;
	public List<Timeslots> timeslotsList;
	
	public FindFreeTimeSlots(List<Appointments> list) { 
		theList = list; 
		timeslotsList = null;
	}

	public List<Appointments> sortTheList(List<Appointments> list) {
		
		return null;
	}
	
	
	public List<Timeslots> findTimeSlots() {
		for(int i=0; i < theList.size() - 1; i++) {
			Appointments currentAppointment = theList.get(i);
			Appointments nextAppointment = theList.get(i+1);
			
			if(currentAppointment.getEnd() != nextAppointment.getStart()) {
				Timeslots timeslot = new Timeslots();
				timeslot.setId(currentAppointment.getId());
				timeslot.setCalendar_ui(currentAppointment.getCalendar_id());
				timeslot.setStart(currentAppointment.getEnd());
				timeslot.setEnd(nextAppointment.getStart());
				timeslot.setType_id(currentAppointment.getType_id());
				timeslot.setPublic_bookable(true);
				timeslot.setOut_of_office(currentAppointment.isOut_of_office());
				timeslotsList.add(timeslot);
			}			
		}
		return timeslotsList;
	}
	
	
}
