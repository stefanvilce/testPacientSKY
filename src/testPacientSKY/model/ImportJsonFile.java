package testPacientSKY.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ImportJsonFile {

	public List<Appointments> appointments;
	
	
	public ImportJsonFile() { appointments = null; }
	
	public static JSONObject parseJSONFile(String filename) throws JSONException, IOException {
        String content = new String(Files.readAllBytes(Paths.get(filename)));
        return new JSONObject(content);
    }
	// https://stackoverflow.com/questions/8997598/importing-json-into-an-eclipse-project
	// De fapt, asta este linkul cel bun:
	// https://stackoverflow.com/questions/7463414/what-s-the-best-way-to-load-a-jsonobject-from-a-json-text-file
	
	public List<Appointments> takeDataFromJSON(String filename) throws JSONException, IOException {
		
		 filename = "C:\\Users\\svi\\Documents\\workspace-spring-tool-suite-4-4.3.1.RELEASE\\testPacientSKY\\src\\resources\\" + filename;
		 				 
	     JSONObject jsonObject = parseJSONFile(filename);
		 JSONArray appointmentsArray = jsonObject.getJSONArray("appointments");
	     
	     for(int i = 0; i < appointmentsArray.length(); i++) {
	    	 JSONObject appObj = (JSONObject) appointmentsArray.get(i);
	    	 Appointments appointment = new Appointments();
	    	 appointment.setId(appObj.getString("id"));
	    	 appointment.setPatient_id(appObj.getString("patient_id"));
	    	 appointment.setCalendar_id(appObj.getString("calendar_id"));
	    	 appointment.setStart(appObj.getString("start"));
	    	 appointment.setEnd(appObj.getString("end"));
	    	 appointment.setPatient_comment(appObj.getString("patient_comment"));
	    	 appointment.setNote(appObj.getString("note"));
	    	 appointment.setTime_slot_type_id(appObj.getString("time_slot_type_id"));
	    	 appointment.setType_id(appObj.getString("type_id"));
	    	 appointment.setState(appObj.getInt("state"));
	    	 appointment.setOut_of_office_location(appObj.getString("out_of_office_localtion"));
	    	 appointment.setOut_of_office(appObj.getBoolean("out_of_office"));
	    	 appointment.setCompleted(appObj.getBoolean("completed"));
	    	 appointment.setIs_scheduled(appObj.getBoolean("is_scheduled"));
	    	 saveAppointment(appointment);
	     }	    
	     return appointments;
	}
	
	
	public void saveAppointment(Appointments appoint) {
		appointments.add(appoint);
	}
	
	
	
	
	
	
}
