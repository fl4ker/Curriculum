package curriculum.k;


public class Employee {
	
	private String name;
	private String type;
	private int hours;
	
	public Employee(String name,String type,int hours) {
		this.name = name;
		this.type = type;
		this.hours = hours;
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	
	public int getHours() {
		return hours;
	}

	public int calculateSalary() {
		return 0;
	}
	

}
