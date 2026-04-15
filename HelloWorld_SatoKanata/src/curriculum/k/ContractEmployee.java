package curriculum.k;

public class ContractEmployee extends Employee implements Payable {
	
	private String name;
	private int hours;
	
	public ContractEmployee(String name,int hours) {
		super(name,"契約社員",hours);
		
	}
	
	
	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public int getHours() {
		return this.hours * 1000;
	}
	

}
