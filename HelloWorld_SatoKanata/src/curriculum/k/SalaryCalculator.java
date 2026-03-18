package curriculum.k;

// 社員の給与を計算し、レポートを出力するクラス
public class SalaryCalculator {
	
	public interface Payable{
		int calculateSalary();
		String getName();
	}
	
	public void calculateSalary(Employee e) {
		
		if (e.getType().equals("FullTime")) {
			System.out.println(e.getName() + " の給料は " + (e.getHours() * 1200) + " 円");
		} else if (e.getType().equals("Contract")) {
			System.out.println(e.getName() + " の給料は " + (e.getHours() * 1000) + " 円");
		}
	}
		
	
	

}
