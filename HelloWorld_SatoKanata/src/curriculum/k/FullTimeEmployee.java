package curriculum.k;

public class FullTimeEmployee extends Employee implements Payable{
	
	private String name;
	private int hours;
	
	public FullTimeEmployee(String name,int hours) {
		super(name,"正社員",hours);
		
	}
	
	
	@Override
    public int calculateSalary() {
        // 親クラスの getHours() を使って計算
        return getHours() * 1200; 
    }

}
