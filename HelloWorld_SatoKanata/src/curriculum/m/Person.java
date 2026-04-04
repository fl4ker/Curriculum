package curriculum.m;

public class Person {
	// インスタンスフィールドを定義
	String name;
	int age;
	double height;
	double weight;
	//double bmi;
	
	

	  // コンストラクタを定義しインスタンスフィールドに値をセット
	 Person(String name,int age,double height,double weight){
		 this.name = name;
		 this.age = age;
		 this.height = height;
		 this.weight = weight;
		  
	 }
	 
	 // BMIを計算して返すインスタンスメソッド
	 double getBmi() {
		 return this.weight / (this.height * this.height); 
	 }
	 
	 void print() {
		 System.out.println("名前は" + this.name + "です");
		 System.out.println("年は" + this.age + "です");
		 System.out.printf("BMIは%.2fです%n",this.getBmi());
		 System.out.println("合計1人です");
	 }
	 

}
