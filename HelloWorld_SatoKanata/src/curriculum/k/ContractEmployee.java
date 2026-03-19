package curriculum.k;

public class ContractEmployee implements Payable {
	
	private String name;
	private int hours;
	
	public ContractEmployee(String name,int hours) {
		this.name = name;
		this.hours = hours;
	}
	
	
	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public int calculateSalary() {
		return this.hours * 1000;
	}
	

}
