package curriculum.i;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();// リストの初期化
		
		// リストの作成
		employees.add(new FullTimeEmployee("Fstaff1","staff1"));// idとnameの二つのStringを設定する
		employees.add(new FullTimeEmployee("Fstaff2","staff2"));
		employees.add(new ContractEmployee("Cstaff1","staff3"));
		employees.add(new ContractEmployee("Csfaff2","staff4"));
		
		//Employee staff1 = new FullTimeEmployee();
		
		
		for(Employee e : employees) {
			int hoursWorked = 10;// 出勤時間
			int wage = e.calculateDailyWage(hoursWorked);// 各社員ごとに給料が違う
			System.out.println("ID:" + e.id + " 社員名:" + e.name + " 給料:" + wage);
		}
		
		
		
		

	}

}
