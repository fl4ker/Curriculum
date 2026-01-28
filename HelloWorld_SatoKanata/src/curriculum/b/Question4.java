package curriculum.b;

public class Question4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		/*
		 * Q1
		 */
		// int型の配列を作成
		int[] num1 = {1,2,3,4,5};
		
		// 格納した値を順番に表示
		for(int Numbers : num1) {
			System.out.println(Numbers);
		}
		
		
		/*
		 * Q2
		 */
		// 配列を作成
		int[] num2 = {10,20,30,40,50};
		
		// 末尾から処理する、Num2.length - 1は５０の箇所を指している
		for(int num = num2.length - 1; num >= 0; num --){
			System.out.println(num2[num]);
		}
		
		/*
		 * Q3
		 */
		
		int[] num3 = {3,5,7,9,11};
		int total = 0;// 初期化しておく
		
		// 取り出した要素を合計する
		for(int num : num3) {
			total += num;
		}
		
		System.out.println(total);
		
		/*
		 * Q4
		 */
		int[] num4 = {12,7,9,21,5,18};
		// それぞれ０番目の値を基本の値に設定する
		int high = num4[0];
		int low = num4[0];
		
		// 拡張for文で比較する
		for(int num : num4) {
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
		int[] num5 = {1,2,3,4,5};
		
		for(int num : num5) {
			System .out.println(num * 2);// 要素を２倍にして表示
		}
		
		/*
		 * Q6
		 */
		/*int[] num6 = {4,7,10,15,20};
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("入力してください");
		int input = scanner .nextInt();// nextIntで数値の入力
		
		boolean found = false;
		
		// 入力された値が配列の要素に含まれているか判別
		for(int num : num6) {
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
		for(int line1 = 0; line1 < array.length; line1++) {// 行(1次元配列)をループ
			for(int line2 = 0; line2 < array[line1].length; line2++) {// 列(行の中の要素)をループ
				System.out.print(array[line1][line2] + " ");// printにすることで改行せずに表示
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
		
		for(int l1 = 0; l1 < array2.length; l1++) {// 行を取り出す
			for(int l2 = 0; l2 < array2[l1].length; l2++) {// 要素を取り出す
				output += array2[l1][l2]; // outputに行ごとの要素を足して更新していく
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
		int high2 = array3[0][0];
		int low2 = array3[0][0];
		
		// 
		for(int[] l1 : array3) {
			for(int l2 : l1) {
				if(l2 > high2) {
					high2 = l2;// 最大値を更新
				}
				if(l2 < low2) {
					low2 = l2;// 最小値を更新
				}
			}
		}
		
		System.out.println(high2);
		System.out.println(low2);
		
		/*
		 * Q10
		 */
		
		int[][][] array4 = {
				{{1,2},{3,4}},
				{{5,6},{7,8}}
		};
		
		// 3次元配列のため三重ループ
		for(int l1 = 0; l1 < array4.length; l1++) {
			for(int l2 = 0; l2 < array4[l1].length; l2++) {
				for(int l3 = 0; l3 < array4[l1][l2].length; l3++) {
					System.out.println(array4[l1][l2][l3]);
				}
			}
		}
		
		

	}

}
