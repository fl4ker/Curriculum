package curriculum.h;

public abstract class Employee {
	
	private String employeeId;
	private String name;
	
	Employee(String id,String name){
		employeeId = id;
		name = name;
	}
	
	public String getEmployeeId(){
		return this.employeeId;
	}
	
	public String getName() {
		return this.name;
	}
	
	public abstract int calculateDailyWage(int hoursWorked);
	
	
	
	

}
