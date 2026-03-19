package curriculum.k;

public class FullTimeEmployee implements Payable {
	
	private String name;
	private int hours;
	
	public FullTimeEmployee(String name,int hours) {
		this.name = name;
		this.hours = hours;
	}
	
	@Override
	public int calculateSalary() {
		return hours * 1200;
	}
	
	@Override
	public String getName() {
		return name;
	}
	

}
