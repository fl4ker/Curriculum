package curriculum.f;

public class Employee {
	public static Employee staff;
	public String employeeId;// フィールド
	public String name;
	
	
	// showInfoのメソッド
	public void showInfo() {
		System.out.println("社員ID:" + employeeId + "," + "名前:" + name);
	}
	
	

}
