package curriculum.k;

public class SalaryReporter {
	// 出力担当クラス
	public void report(Payable employee) {
		System.out.println(employee.getName() + "の給料は" + employee.calculateSalary() + "円");
	}

}
