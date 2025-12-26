package curriculum.a;

public class Question1 {

	public static void main(String[] args) {
		byte byteNum = 0; // 変数byteNumの初期値を設定
		short shortNum = 0; // 変数shortNumの初期値を設定
		int intNum = 0; // 変数intNumの初期値を設定
		long longNum = 0L; // 変数longNumの初期値を設定
		float floatNum = 0.0f; // 変数floatNumの初期値を設定
		double doubleNum = 0.0; // 変数doubleの初期値を設定
		char letter = '\u0000'; // 変数letterの初期値を設定
		String letters = "null"; // 変数lettersの初期値を設定
		boolean isboolean = false; // 変数isbooleanの初期値を設定
		/*
		 * Q2
		 */
		byteNum = 10; // 変数の値を更新
		shortNum = 100; // 変数の値を更新
		intNum = 1000; // 変数の値を更新
		longNum = 10000; // 変数の値を更新
		floatNum = 9.5f; // 変数の値を更新
		doubleNum = 10.5; // 変数の値を更新
		letter = 'a'; // 変数の値を更新
		letters = "ハロー"; // 変数の値を更新
		isboolean = true; // 変数の値を更新
		
		/*
		 * Q3
		 */
		System.out.println(byteNum + shortNum + intNum + longNum); // 11110という値を出力する
		
		System.out.println(byteNum + byteNum); // 20という値を出力する
		
		System.out.println(letter + letters + isboolean); // aハローtrueという値を出力する
		
		System.out.println(byteNum + shortNum + intNum + longNum + 20); // 数字を足して11130という値を出力する
		
		System.out.println(longNum * longNum * shortNum); // 小数点以外の数字を全てかけて出力
		
		System.out.println(doubleNum / shortNum); // 10.5割る100をして出力
		
		System.out.println(byteNum - shortNum); // 10引く100をして出力
		
		/*
		 * Q4
		 */
		String name;
		name = "山田太郎";
		
		System.out.println("こんにちは、" + name + "さん！");// こんにちは、山田太郎さん! と表示する
		
		/*
		 * Q5
		 */
		int age;
		age = 25;
		
		System.out.println("年齢:" + age + "歳");// 年齢: 25歳 と表示する
		
		/*
		 * Q6
		 */
		int num1 = 10;
		int num2 = 5;
		int sum;
		
		sum = num1 + num2;// 10+5の結果をsumに代入
		System.out.println(sum);// 15と表示
		
		/*
		 * Q7
		 */
		int score = 80;
		score += 20;// 80+20をする
		
		System.out.println("最終スコア:" + score);// 最終スコア: 100  を表示
		
		/*
		 * Q8
		 * byte → short → int → long → float → double
		 */
		double doubleprice = 99.99;
		int price = (int) doubleprice;// int型にキャスト
		
		System.out.println("整数価格:" + price);// 整数価格:99と表示
		
		/*
		 * Q9
		 * String s = String.valueOf(100); //数値から文字列
		 * int i = Integer.parseInt("100");//文字列から数値
		 */
		String numStr = "123";
		int intStr = Integer.parseInt("123");// Stringからintに変換
		
		intStr += 10;// 123+10 
		System.out.println("変換後の値:" + intStr );// 変換後の値：133を表示
		
		/*
		 * Q10
		 */
		int num = 50;
		String strNum = String.valueOf(50);// intからStringに変換
		
		System.out.println("得点:" + strNum + "点");// "得点: 50点" の形で表示
		
		/*
		 * Q11
		 */
		int a = 10;
		int b = 20;
		boolean result = (a < b);// aがbより小さいかどうか
		
		System.out.println(result);// resultを表示
		
		/*
		 * Q12
		 * 条件式 ? 真の場合の値 : 偽の場合の値 ;
		 */
		int x = 15;
		
		String Result = (x >= 10) ? "OK" : "NG";// x が 10 以上なら "OK"、そうでなければ "NG" を表示
		System.out.println(Result);// 結果を表示
		
		/*
		 * Q13
		 */
		String text = "私はJavaが好きです。Javaは楽しい!";
		String changetext = text.replace("Java","Python");// "Java"から"Python"に置き換え
		
		System.out.println(changetext);// 置き換えた文章を表示
		
		

	}

}
