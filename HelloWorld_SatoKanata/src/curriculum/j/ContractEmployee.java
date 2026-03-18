package curriculum.j;

public class ContractEmployee extends Employee {
	
	
	public ContractEmployee(int id, String name) {
		super(id,name);
	}
	
    public int costForDay(int hoursWorked) {
		
		int hourlyRate = 1000;
		return hoursWorked * hourlyRate;
	}


	@Override
	public int id() {
		return super.id();
	}


	@Override
	public String name() {
		return super.name();
	}
	
	

}
