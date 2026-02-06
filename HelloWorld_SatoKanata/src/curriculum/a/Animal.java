package curriculum.a;

public class Animal {
	// カプセル化する、フィールド
	private String name;
	private double length;
	private int speed;
	
	// それぞれのsetter,getter
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	

}
