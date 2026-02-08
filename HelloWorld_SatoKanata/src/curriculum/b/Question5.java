package curriculum.b;

import curriculum.a.Animal;// 
import curriculum.a.Greeting;// curriculum.aからインポート

public class Question5 {
	
	public static void main(String[] args) {
		helloWorld(); // Q1を表示
		
		// Q2
		int result = doubleValue(10);// 変数に値を入れる
		System.out.println(result);
		
		// Q3
		int num1 = 10;
		int num2 = 7;
		
		System.out.print(num1);
		if(isEven(num1)) {
			System.out.println("は偶数です");
		}else {
			System.out.println("は奇数です");
		}
		
		
		// Q4
		Greeting greeter = new Greeting();// Greetingクラスのインスタンスを作成
		greeter.sayHello();// メソッドを呼び出す
		
		
		// Q5
		Animal lion = new Animal();// Animalクラスのインスタンス
		
		// setterで値を設定
		lion.setName("ライオン");
		lion.setLength(2.1);
		lion.setSpeed(80);
		
		//getterで値を取得、出力
		System.out.println("動物の情報");
        System.out.println("名前 " + lion.getName());
        System.out.println("体長 " + lion.getLength() + "m");
        System.out.println("速度 時速" + lion.getSpeed() + "km");
		
		
		
		
		
	}
	private static boolean isEven(boolean result2) {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}
	/*
	 * Q1
	 */
	public static void helloWorld() {
        System.out.println("HelloWorld!");
    }
	
	
	/*
	 * Q2
	 */
	// 引数を受け取って計算するメソッド
	public static int doubleValue (int num) {
		int sum = num * 2;
		return sum;// 
	}
	
	
	/*
	 * Q3
	 */
	
	//偶数か奇数を判別するメソッド
	public static boolean isEven(int num) {
		return num % 2 == 0;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
