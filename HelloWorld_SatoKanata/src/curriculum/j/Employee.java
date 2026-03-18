package curriculum.j;

interface Billable{
	int id();
	String name();

	int costForDay(int hoursWorked);
}


public abstract class Employee implements Billable{
	
	private int id;
	private String name;
	
	// コンストラクタで初期化
	public Employee(int id,String name){
		this.id = id;// thisを使う
		this.name = name;
	}
	
	// mainクラスから呼ぶために必要
	public int id() {
		return id;
	}
	
	public String name() {
		return name;
	}
	

}
