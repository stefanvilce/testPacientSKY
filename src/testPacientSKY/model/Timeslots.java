package testPacientSKY.model;

public class Timeslots {

	private String id;
	private String calendar_ui;
	private String start;
	private String end;
	//
	private String type_id;
	private boolean public_bookable;
	private boolean out_of_office;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCalendar_ui() {
		return calendar_ui;
	}
	public void setCalendar_ui(String calendar_ui) {
		this.calendar_ui = calendar_ui;
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
	public String getType_id() {
		return type_id;
	}
	public void setType_id(String type_id) {
		this.type_id = type_id;
	}
	public boolean isPublic_bookable() {
		return public_bookable;
	}
	public void setPublic_bookable(boolean public_bookable) {
		this.public_bookable = public_bookable;
	}
	public boolean isOut_of_office() {
		return out_of_office;
	}
	public void setOut_of_office(boolean out_of_office) {
		this.out_of_office = out_of_office;
	}
	
	
	
}
