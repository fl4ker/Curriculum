package curriculum.h;

public class FullTimeEmployee {
	// 時給を定数で設定
	private static final int HOURLY_RATE = 1200;
	
	public FullTimeEmployee(String id, String name) {
		super();
	}
	
	public int calculateDailyWage(int hoursWorked) {
        if (hoursWorked <= 8) {
            return hoursWorked * HOURLY_RATE;// 働いた時間✖基本時給
        } else {
            // 8時間を超えた分は25%割増
            int regularPay = 8 * HOURLY_RATE;
            int overtimeHours = hoursWorked - 8;
            int overtimePay = (int) (overtimeHours * HOURLY_RATE * 1.25);
            return regularPay + overtimePay;
        }
    }
	
	
	
	

}
