package curriculum.j;

public abstract class ContractEmployee extends Employee {
	
	
	public ContractEmployee(int id, String name) {
		super(id,name);
	}
	
    public int costForDay(int hoursWorked) {
		
		int hourlyRate = 1000;
		return hoursWorked * hourlyRate;
	}


	
	
	

}
