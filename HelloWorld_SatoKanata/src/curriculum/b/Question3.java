package curriculum.b;

public class Question3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		 * Q1
		 */
		for (int num = 1; num <= 10; num++) {
			System.out.println(num);// 1から10までの値を一つずつ表示
		}
		
		/*
		 * Q2
		 */
		for (int num = 2; num <= 20; num += 2) {
			System.out.println(num);// 2から20までの偶数を表示
		}
		
		/*
		 * Q3
		 */
		for (int num = 10; num >= 1; --num) {
			System.out.println(num);// 10から1まで一つずつ表示
		}
		
		/*
		 * Q4
		 */
		int sum = 0;// 合計を貯める変数
		
		// 1から100まで1ずつ増やす処理を繰り返す
		for (int num = 1; num <= 100; num++) {
			sum += num;// sumにnumを足してsumを更新する
			System.out.println(num);// 値を表示する
		}
		
		/*
		 * Q5
		 */
		String[] sum2 = {"*", "**", "***", "****", "*****"};//
		
		// Markにsum2の要素が1つずつ代入される
		for(String Mark : sum2) {
			System.out.println(Mark);
		}
		
		/*
		 * Q6
		 */
		int count = 0;
		
		// countが10までループする
		while (count < 10) {
			count++;// countを1ずつ増やす
			System.out.println(count);
		}
		
		/*
		 * Q7
		 */
		int countD = 0;
		
		// countDが20までループ
		while(countD < 20) {
			countD += 2;// 2ずつ増える
			System.out.println(countD);
		}
		
		/*
		 * Q8
		 */
		int countD2 = 11;
		
		// countD2が1までループ
		while(countD2 > 1) {
			countD2 -= 1;// 1ずつ減る
			System.out.println(countD2);
		}
		
		
		
		
		

	}

}
