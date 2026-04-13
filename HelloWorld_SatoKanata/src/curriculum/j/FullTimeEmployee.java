package curriculum.j;

class FullTimeEmployee extends Employee implements Billable  {
	
	public FullTimeEmployee(int id, String name) {
		// Employeeクラスのコンストラクタを呼び出す
		super(id, name);
	}

	@Override
	public int costForDay(int hoursWorked) {
		
		int hourlyRate = 1250;
		int overtime = Math.max(0, hoursWorked - 8);
		int regularHours = hoursWorked - overtime;
		return (regularHours * hourlyRate) + (int)(overtime * hourlyRate * 1.25);
		
	}

	
	

}
