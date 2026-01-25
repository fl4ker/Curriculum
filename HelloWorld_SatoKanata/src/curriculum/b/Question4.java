package curriculum.b;

public class Question4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		/*
		 * Q1
		 */
		// int型の配列を作成
		int[] Num = {1,2,3,4,5};
		
		// 格納した値を順番に表示
		for(int Numbers : Num) {
			System.out.println(Numbers);
		}
		
		
		/*
		 * Q2
		 */
		// 配列を作成
		int[] Num2 = {10,20,30,40,50};
		
		// 末尾から処理する、Num2.length - 1は５０の箇所を指している
		for(int num = Num2.length - 1; num >= 0; num --){
			System.out.println(Num2[num]);
		}
		
		/*
		 * Q3
		 */
		
		int[] Num3 = {3,5,7,9,11};
		int total = 0;// 初期化しておく
		
		// 取り出した要素を合計する
		for(int num : Num3) {
			total += num;
		}
		
		System.out.println(total);
		
		/*
		 * Q4
		 */
		int[] Num4 = {12,7,9,21,5,18};
		// それぞれ０番目の値を基本の値に設定する
		int high = Num4[0];
		int low = Num4[0];
		
		// 拡張for文で比較する
		for(int num : Num4) {
			if (num > high) {// numの値が現在の値よりも大きかったら更新する
				high = num;
			}
			if(num < low) {// numの値が現在の値よりも小さかったら更新する
				low = num;
			}
		}
		
		System.out.println(high);
		System.out.println(low);
		
		/*
		 * Q5
		 */
		int[] Num5 = {1,2,3,4,5};
		
		for(int num : Num5) {
			System .out.println(num * 2);// 要素を２倍にして表示
		}
		
		/*
		 * Q6
		 */
		/*int[] Num6 = {4,7,10,15,20};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("入力してください");
		int input = scanner .nextInt();// nextIntで数値の入力
		
		boolean found = false;
		
		// 入力された値が配列の要素に含まれているか判別
		for(int num : Num6) {
			if(num == input){
				found = true;
				break;
			}
		}
		
		
		//　判別をした値を表示
		if(found) {
			System.out.println(input + "は配列に含まれています");
		}else {
			System.out.println(input + "は配列に含まれていません");
		}
		*/
		/*
		 * Q7
		 */
		// 二次元配列
		int [][] array = {
			{1,2},
			{3,4},
			{5,6}
		};
		// 二重ループ
		for(int Line1 = 0; Line1 < array.length; Line1++) {// 行(1次元配列)をループ
			for(int Line2 = 0; Line2 < array[Line1].length; Line2++) {// 列(行の中の要素)をループ
				System.out.print(array[Line1][Line2] + " ");// printにすることで改行せずに表示
			}
			System.out.println();
		}
		
		/*
		 * Q8
		 */
		
		int [][] array2 = {
				{10,20,30},
				{40,50,60},
				{70,80,90}
		};
		
		int output = 0;
		
		for(int L1 = 0; L1 < array2.length; L1++) {// 行を取り出す
			for(int L2 = 0; L2 < array2[L1].length; L2++) {// 要素を取り出す
				output += array2[L1][L2]; // outputに行ごとの要素を足して更新していく
			}
			System.out.println(output);
		}
		
		/*
		 * Q9
		 */
		
		int[][] array3 = {
				{12,15,8},
				{6,19,25},
				{30,2,10}
		};
		// 最初の要素で初期化
		int High = array3[0][0];
		int Low = array[0][0];
		
		// 
		for(int[] L1 : array3) {
			for(int L2 : L1) {
				if(L2 > High) {
					High = L2;// 最大値を更新
				}
				if(L2 < Low) {
					Low = L2;// 最小値を更新
				}
			}
		}
		
		System.out.println(High);
		System.out.println(Low);
		
		/*
		 * Q10
		 */
		
		int[][][] array4 = {
				{{1,2},
				{3,4}},
				{{5,6},
				{7,8}}
		};
		
		// 3次元配列のため三重ループ
		for(int L1 = 0; L1 < array4.length; L1++) {
			for(int L2 = 0; L2 < array[L1].length; L2++) {
				for(int L3 = 0; L3 < array4[L1][L2].length; L3++) {
					System.out.print(array4[L1][L2][L3]);
				}
			}
		}
		
		

	}

}
