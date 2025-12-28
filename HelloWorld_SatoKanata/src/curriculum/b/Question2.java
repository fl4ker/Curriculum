package curriculum.b;

public class Question2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		 * Q1
		 */
		int score = 75;
		if (score > 60) {
			System.out.println("合格です！");// scoreが60以上なら合格です！と表示
		}
		
		/*
		 * Q2
		 */
		int age = 25;
		if (age >= 20 && age <= 30) {
			System.out.println("適正年齢です");// age が 20 以上 30 以下なら "適正年齢です" と表示
		}else {
			System.out.println("対象外です");// それ以外の場合は "対象外です" と表示
		}
		
		/*
		 * Q3
		 */
		int age2 = 18;
		if (age2 >= 20) {
			System.out.println("成人です");// age が 20 以上なら "成人です" と表示
		}else if (age2 >= 13 && age2 <= 19) {
			System.out.println("ティーンエイジャーです");// age が 13 以上 19 以下なら "ティーンエイジャーです" と表示
		}else if (age2 <= 12){
			System.out.println("子供です");// age が 12 以下なら "子供です" と表示
		}
		
		
		/*
		 * Q4
		 */
		int x = 30;
		int y = 15;
		int z = 50;
		int max;
		
		if(x > y && x > z) {
			System.out.println(max = x);// xの値が一番大きかったら表示
		}else if(y > x && y > z) {
			System.out.println(max = y);// yの値が一番大きかったら表示
		}else {
			System.out.println(max = z);// 他が当て嵌まらなかったら表示
		}
		
		
		/*
		 * Q5
		 */
		int num = 4;
		
		if (num > 0) {
			System.out.println("正の数です");// num値が0より大きいなら表示
		}else if(num == 0) {
			System.out.println("0です");// num値が0なら表示
		}else if(num < 0) {
			System.out.println("負の数です");// num値が0より小さいなら表示
		}
		
		/*
		 * Q6
		 */
		int value = 10;
		
		if(value % 2 == 0) {
			System.out.println("偶数です");// valueの値が2で割れるなら表示
		}else if(value % 2 == 1) {
			System.out.println("奇数です");// valueの値が2で割り切れないなら表示
		}
		
		
		
		
		
		
		

	}

}
