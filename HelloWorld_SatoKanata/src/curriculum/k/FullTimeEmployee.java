package curriculum.k;

public class FullTimeEmployee extends Employee implements Payable{
	
	private String name;
	private int hours;
	
	public FullTimeEmployee(String name,int hours) {
		super(name,"正社員",hours);
		
	}
	
	@Override
	public int getHours() {
		return hours * 1200;
	}
	
	@Override
	public String getName() {
		return name;
	}
	

}
