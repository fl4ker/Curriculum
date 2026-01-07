package curriculum.b;

public class Question2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		 * Q1
		 */
		int score = 75;
		if (score >= 60) {
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
		}else {
			System.out.println("奇数です");// valueの値が2で割り切れないなら表示
		}
		
		/*
		 * Q7
		 */
		int score2 = 50;
		
		if(score2 >= 90) {
			System.out.println("優");// score2の値が90以上なら表示
		}else if(score2 >= 70){
			System.out.println("良");// 70以上なら表示
		}else if(score2 >= 50 && score2 <= 69) {
			System.out.println("可");// 50以上なら表示
		}else if(score2 < 50) {
			System.out.println("不可");// 50未満なら表示
		}
		
		/*
		 * Q8
		 */
		String text = null;
		
		if(text == null || text.equals("")) {
			System.out.println("入力が無効です");// コンソール入力が null または空文字("")のときに「入力が無効です」と表示
		}
		
		/*
		 * Q9
		 */
		int day = 7;// この値は対応する曜日を表す
		
		//dayの値によってそれぞれの曜日を表示
		switch(day) {
		case 1:
			System.out.println("月曜日");
			break;
		case 2:
			System.out.println("火曜日");
			break;
		case 3:
			System.out.println("水曜日");
			break;
		case 4:
			System.out.println("木曜日");
			break;
		case 5:
			System.out.println("金曜日");
			break;
		case 6:
			System.out.println("土曜日");
			break;
		case 7:
			System.out.println("日曜日");
			break;
		default:
			System.out.println("無効な入力です");// 1から7までの値以外が入力されたら表示
		}
		
		/*
		 * Q10
		 */
		int month = 4;// 1から12までの対応する季節を表す
		
		// 入力されたmonthの値によって対応する季節を表示
		switch(month) {
		case 12,1,2:
			System.out.println("冬");
		break;
		case 3,4,5:
			System.out.println("春");
		break;
		case 6,7,8:
			System.out.println("夏");
		break;
		case 9,10,11:
			System.out.println("秋");
		break;
		default:
			System.out.println("無効な月です");// 1から12までの値以外が入力されたら表示
		}
		
		

	}

}
