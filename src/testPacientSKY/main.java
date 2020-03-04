package testPacientSKY;

import java.io.IOException;
import java.util.List;

import org.json.JSONException;

import testPacientSKY.controllers.FindFreeTimeSlots;
import testPacientSKY.model.Appointments;
import testPacientSKY.model.ImportJsonFile;
import testPacientSKY.model.Timeslots;

public class main {

	public static void main(String[] args) {
		
		System.out.println("Teste vere!"); // asta trebuie sa dispara de aici pentru ca nu are ce cauta!!!!
		
		try {
			ImportJsonFile importJsonFile = new ImportJsonFile();			
			List<Appointments> list = importJsonFile.takeDataFromJSON("Danny boy.json");
			FindFreeTimeSlots findFreeTimeSlots = new FindFreeTimeSlots(list);
			List<Timeslots> timeslots = findFreeTimeSlots.findTimeSlots();
			for(Timeslots timeslot : timeslots) {
				System.out.println("{ ");
				System.out.println("    id: " + timeslot.getId() + ", ");
				System.out.println("    calendar_ui: " + timeslot.getCalendar_ui() + ", ");
				System.out.println("    start: " + timeslot.getStart() + ", ");
				System.out.println("    end: " + timeslot.getEnd() + ", ");
				System.out.println("    public_bookable: " + timeslot.isPublic_bookable() + ", ");
				System.out.println("    out_of_office: " + timeslot.isOut_of_office() + ", ");
				System.out.println("    type_id: " + timeslot.getType_id() + " ");
				System.out.println("}, ");
			}
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
