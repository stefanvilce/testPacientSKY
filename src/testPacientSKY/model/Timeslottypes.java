package testPacientSKY.model;

public class Timeslottypes {

	private String id;
	private String name;
	private int slot_size; //duration in minutes
	//
	private boolean public_bookable;
	private String color;
	private String icon;
	private String deleted;
	private boolean out_of_office;
	private boolean enable;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSlot_size() {
		return slot_size;
	}
	public void setSlot_size(int slot_size) {
		this.slot_size = slot_size;
	}
	public boolean isPublic_bookable() {
		return public_bookable;
	}
	public void setPublic_bookable(boolean public_bookable) {
		this.public_bookable = public_bookable;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getDeleted() {
		return deleted;
	}
	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}
	public boolean isOut_of_office() {
		return out_of_office;
	}
	public void setOut_of_office(boolean out_of_office) {
		this.out_of_office = out_of_office;
	}
	public boolean isEnable() {
		return enable;
	}
	public void setEnable(boolean enable) {
		this.enable = enable;
	}
	
	
	
	
}
