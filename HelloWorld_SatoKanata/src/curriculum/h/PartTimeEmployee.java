package curriculum.h;

public class PartTimeEmployee extends Employee{
	// 定数
	private static final int HOURLY_RATE = 1000;
	
	public PartTimeEmployee(String id, String name) {
		super(id,name); // Employeeクラスのフィールドを初期化
	}
	
	public int calculateDailyWage(int hourWorked) {
		return hourWorked * HOURLY_RATE;
	}
	

}
