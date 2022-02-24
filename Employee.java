package edu.ucalgary.ensf409;
public class Employee{
	private String name;
	private final String IDNUMBER;
	private String managerID;
	private Employee[] supervisedEmployees = new Employee[10];
	
	
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
	    return this.name;
	}
	
	
	public String getIDNumber(){
		return IDNUMBER;
	}
	public void setManagerID(String newManager){
		this.managerID = managerID;
	}
	public String getManagerID(){
		return this.managerID;
	}
	public void addEmployee(Employee newEmployee){
		for(int i=0;i<supervisedEmployees.length;i++){
			if(supervisedEmployees[i] == null){
				supervisedEmployees[i] = newEmployee;
			}
            break;
		}
	}
	
	    
	public Employee[] getEmployees(){
		return this.supervisedEmployees;
	}
	
	public Employee(String name, String idNumber){
		this.name = name;
		this.IDNUMBER = idNumber;
		
	}
	
	public Employee(String name, String idNumber, String managerID){
		
		this.name = name;
		this.IDNUMBER = idNumber;
		this.managerID = managerID;
		
	}
}


	
		