package testPacientSKY.model;

public class Appointments {
	private String id;
	private String patient_id;
	private String calendar_id;
	private String start;
	private String end;
	private String patient_comment;
	private String note;
	private String time_slot_type_id;
	private String type_id;
	private int state;
	private String out_of_office_location;
	private boolean out_of_office;
	private boolean completed;
	private boolean is_scheduled;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(String patient_id) {
		this.patient_id = patient_id;
	}
	public String getCalendar_id() {
		return calendar_id;
	}
	public void setCalendar_id(String calendar_id) {
		this.calendar_id = calendar_id;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public String getPatient_comment() {
		return patient_comment;
	}
	public void setPatient_comment() {
		this.patient_comment = null;		
	}
	public void setPatient_comment(String patient_comment) {
		this.patient_comment = patient_comment;		
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getTime_slot_type_id() {
		return time_slot_type_id;
	}
	public void setTime_slot_type_id(String time_slot_type_id) {
		this.time_slot_type_id = time_slot_type_id;
	}
	public String getType_id() {
		return type_id;
	}
	public void setType_id(String type_id) {
		this.type_id = type_id;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getOut_of_office_location() {
		return out_of_office_location;
	}
	public void setOut_of_office_location(String out_of_office_location) {
		this.out_of_office_location = out_of_office_location;
	}
	public boolean isOut_of_office() {
		return out_of_office;
	}
	public void setOut_of_office(boolean out_of_office) {
		this.out_of_office = out_of_office;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	public boolean isIs_scheduled() {
		return is_scheduled;
	}
	public void setIs_scheduled(boolean is_scheduled) {
		this.is_scheduled = is_scheduled;
	}
	
	
	
}
