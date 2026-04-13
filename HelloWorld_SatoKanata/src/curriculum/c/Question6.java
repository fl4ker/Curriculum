package curriculum.c;
import java.util.Scanner;

public class Question6 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Cpu cpu = new Cpu();
		
		
		String[] hands = {"グー","チョキ","パー"};
		boolean isWin = false;
		
		while(!isWin) {
			System.out.println("グー(0),チョキ(1),パー(2) 入力してください");
			
			int playerHand = scanner.nextInt();
			
			if (!scanner.hasNextInt()) {
                System.out.println("数字以外は入力できません");
                scanner.next(); 
                continue;
            }
			
			// ０から２以外の数字が入力された時に表示させる
			if(playerHand < 0 || playerHand > 2) {
				System.out.println("0から2までの範囲で入力してください");
				continue;
			}
			
			int cpuHand = cpu.getHand();// cpuのメソッドを参照
			System.out.println("プレイヤー: " + hands[playerHand]);
			System.out.println("CPU: " + hands[cpuHand]);
			
			if(playerHand == cpuHand) {
				System.out.println("あいこになりました");
			//	３つのパターンに当てはまれば勝ちの条件を付与
			}else if((playerHand == 0 && cpuHand == 1) || // 自分：グー、相手：チョキ
			           (playerHand == 1 && cpuHand == 2) || // 自分：チョキ、相手：パー
			           (playerHand == 2 && cpuHand == 0)) { // 自分：パー、相手：グー
				System.out.println("プレイヤーの勝ちです");
				isWin = true;// 勝った時にwhile文のループから抜ける
				
			}else {
				System.out.println("プレイヤーの負けです");
				
			}
			
		}
		
		scanner.close();
	}

}
