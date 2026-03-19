package curriculum.j;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		// Billableのリス
		List<Billable> employees = new ArrayList<>();
		
		employees.add(new FullTimeEmployee(1,"staff1"));
		employees.add(new ContractEmployee(2,"staff2"));
		
		
		for(Billable b : employees) {
			int hoursWorked = 10;// 出勤時間
			int wage = b.costForDay(hoursWorked);// 各社員ごとに給料が違う
			System.out.println("ID:" + b.id() + " 社員名:" + b.name() + " 給料:" + wage);
		}
		
		
		

	}

}
