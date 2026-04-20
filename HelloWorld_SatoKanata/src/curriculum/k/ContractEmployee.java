package curriculum.k;

public class ContractEmployee extends Employee implements Payable {
	
	private String name;
	private int hours;
	
	public ContractEmployee(String name,int hours) {
		super(name,"契約社員",hours);
		
	}
	
	public String getName(int hours) {
		return this.name;
	}
	
	public int getHours(String name) {
		return this.hours * 1000;
	}
	
	@Override
    public int calculateSalary() {
        return getHours() * 1000;
    }
	

}
