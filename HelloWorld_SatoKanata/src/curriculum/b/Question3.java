package curriculum.b;

import java.util.Random;
import java.util.Scanner;

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
		}
		
		System.out.println(sum);// 値を表示する
		
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
		
		/*
		 * Q9
		 */
		int count3 = 1;// 初期化
		int sum3 = 0;
		
		// count3が100までループ
		while(count3 <= 100) {
			sum3 += count3;// 
			count3++;// 1ずつ増える
		}
		
		System.out.println(sum3);
		
		/*
		 * Q10
		 */
		/*
		Scanner scanner = new Scanner(System.in);
		
		int input = 1;// 0以外の値で初期化する
		
		// inputが0ではない間はずっとループする
		while(input != 0){
			System.out.println("値を入力してください");
			input = scanner.nextInt();
		}
		
		System.out.println("終了しました");
		scanner.close();
		*/

		
		/*
		 * Q11
		 */
		
		// 外側のループ部分、何の段か
		for(int a = 1; a < 10; a++) {
			// 内側のループ部分、掛ける数
			for(int b = 1; b < 10; b++) {
				// 計算式を表示
				System.out.print(a + " * " + b + " = " + (a * b));
				
				if(a == 10 && b == 10) {
					// 式の最後の羅列までは何もしない
				}else { // 区切り線を表示
					System.out.print("||");
				}
				
			}
			System.out.println();
		}
		
		/*
		 * Q12
		 */
		// リストを作成
		String[] machines = {"パソコン","冷蔵庫","扇風機","洗濯機","加湿器","テレビ","ディスプレイ"};
		
		// 入力する準備
		Scanner scanner = new Scanner(System.in);
		System.out.println("入力してください");
		Random rand = new Random();
		
		
		String inputLine = scanner .nextLine();// 一度だけ入力される
		String[] selectedProducts = inputLine.split("、");// 
		
		int tvStock = rand.nextInt(12); // 0〜11
		int displayStock = 11 - tvStock; // 合計が11
		
		// 入力された商品を一つずつループ処理
		for (String item : selectedProducts) {
            item = item.trim();
            
            boolean found = false;
            // 入力された商品がリストにあるか管理
    		for(String machine : machines) {
    			if(machine.equals(item)) {
    				found = true;
    				break;
    			}
    		}
    		
    		
    		// 商品の数を管理
    		if(found) {
    			int Daisuu = switch(item) {
    			case "パソコン" -> rand.nextInt(11);// 0から11まで
    			case "冷蔵庫" -> rand.nextInt(11);// 0から11まで
    			case "扇風機" -> rand.nextInt(11);// 0から11まで
    			case "洗濯機" -> rand.nextInt(11);// 0から11まで
    			case "加湿器" -> rand.nextInt(11);// 0から11まで
    			// テレビとディスプレイをまとめる
    			case "テレビ","ディスプレイ" -> (item.equals("テレビ")) ? tvStock : displayStock;
    			default -> 0;
    			};
    			
    			// 出力部分
    			String result = item + "の残り台数は" + Daisuu + "台です";
    			System.out.println(result);
    			
    		}else {
    			System.out.println(item + "は指定の商品ではありません");// 対応してない商品が入力されたら
    		}
		
		
		
		
		}
		
		
		

	}
}
