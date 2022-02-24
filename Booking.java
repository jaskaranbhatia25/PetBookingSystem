package edu.ucalgary.ensf409;
public class Booking{
	private final String STARTDATE;
	private final String ENDDATE;
	private final Pet BOOKEDPET;
	private final Employee CAREGIVER;
	
	public Booking(Pet pet, Employee assigned, String startDate, String endDate){
		this.BOOKEDPET = pet;
		this.CAREGIVER = assigned;
		this.STARTDATE = startDate;
		this.ENDDATE = endDate;
	}
	public String getStartDate(){
		return STARTDATE;
	}
	public String getEndDate(){
		return ENDDATE;
	}
	public Pet getBookedPet(){
		return BOOKEDPET;
	}
	public Employee getCaregiver(){
		return CAREGIVER;
	}
}
	