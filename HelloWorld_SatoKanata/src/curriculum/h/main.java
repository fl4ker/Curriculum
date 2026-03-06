package curriculum.h;

public class main {

	public static void main(String[] args) {
		
		FullTimeEmployee staff1 = new FullTimeEmployee("01","A社員");
		
		PartTimeEmployee staff2 = new PartTimeEmployee("02","B社員");
		
		int hours = 9; // 勤務時間
		
		System.out.println("正社員の給与:" + staff1.calculateDailyWage(hours) + "円");
		System.out.println("パート社員の給与:" + staff2.calculateDailyWage(hours) + "円");
		

	}

}
