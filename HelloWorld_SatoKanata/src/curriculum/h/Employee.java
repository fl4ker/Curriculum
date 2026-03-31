package curriculum.h;

public abstract class Employee {
	// フィールド
	private String employeeId;
	private String name;
	
	Employee(String id,String name){
		employeeId = id;
		this.name = name;
	}
	
	public String getEmployeeId(){
		return this.employeeId;
	}
	
	public String getName() {
		return this.name;
	}
	
	// 抽象メソッド
	public abstract int calculateDailyWage(int hoursWorked);
	
	
	
	

}
