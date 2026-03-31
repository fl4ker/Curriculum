package curriculum.g;

public class Main {

	public static void main(String[] args) {
		
		// オブジェクトを生成
		Employee staff = new Employee();
		
		// setメソッドで設定
		staff.setEmployeeId("E002");
		staff.setName("田中花子");
		
		// getメソッドで出力
		System.out.println("社員ID:" + staff.getEmployeeId() + ",名前:" + staff.getName());
		
		

	}

}
