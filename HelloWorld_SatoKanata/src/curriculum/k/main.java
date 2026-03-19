package curriculum.k;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		Payable staff1 = new FullTimeEmployee("佐藤",150);
		Payable staff2 = new ContractEmployee("鈴木",160);
		
		List<Payable> employees = new ArrayList<>();
		employees.add(staff1);
		employees.add(staff2);
		
		SalaryReporter reporter = new SalaryReporter();
		
		for(Payable employee : employees) {
			reporter.report(employee);
		}
		

	}

}
