package curriculum.d;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


public class Question7 {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		Character generator = new Character();
		
		int [] playerData = generator.generateStatus(100, 51, 30);
		int[] daemonData = generator.loadDaemon("src/curriculum/d/DaemonStatus.txt");
		
		StringBuilder log = new StringBuilder(); // ログ記録用
		boolean isWin = false;
		
		// プレイヤー名を入力させる
		System.out.println("プレイヤー名を入力してください");
		String playerName = scanner.nextLine();
		
		// バトル判定
		while(!isWin) {
			String turnMsg = "";
			
			System.out.println("\n【現在のステータス】");
			System.out.println(playerName + " HP: " + playerData[0] + " / AT: " + playerData[1] + " / SP: " + playerData[2]);
			System.out.println("Daemon HP: " + daemonData[0] + " / AT: " + daemonData[1] + " / SP: " + daemonData[2]);
			
			/*System.out.println("HP: " + playerData[0]);
			System.out.println("AT: " + playerData[1]);
			System.out.println("SP: " + playerData[2]);*/
			
			
			// スピード判定 先攻・後攻の決定
			boolean playerFirst = false;
			if(playerData[2] > daemonData[2]) {
				playerFirst = true;
				
			}else if(daemonData[2] == playerData[2]){
				playerFirst = (generator.generateStatus(2)[0] == 0);
				
			}/*else {
				// 乱数を追加して振り分ける
				int atRandom = generator.generateStatus(2)[0];
				if(atRandom == 0) {
					turnMsg = playerName + " の攻撃 Daemonに" + playerData[1] + "のダメージ\n";
					daemonData[0] -= playerData[1];
				}else {
					turnMsg = "Daemonの攻撃 " + playerName + "に" + daemonData[1] + "のダメージ\n";
					playerData[0] -= daemonData[1];
				}
				System.out.print(turnMsg);
				log.append(turnMsg); // ログに追加
				System.out.println(playerName + " HP: " + playerData[0] + " / Daemon HP: " + daemonData[0]);
			}*/
			
			// 交互に攻撃
			if(playerFirst) {
				// プレイヤー先攻
				attack(playerName, playerData[1], "Daemon", daemonData, log);
				if (daemonData[0] > 0) { // Daemonが生きていれば反撃
					attack("Daemon", daemonData[1], playerName, playerData, log);
				}
			}else {
				// Daemon先攻
				attack("Daemon", daemonData[1], playerName, playerData, log);
				if (playerData[0] > 0) { // プレイヤーが生きていれば反撃
					attack(playerName, playerData[1], "Daemon", daemonData, log);
				}
			}
			
			// どちらかのHPが0になったらループ終了
			if(playerData[0] <= 0) {
				String result = "Daemonの勝利";
				System.out.println(result);
				log.append("結果: ").append(result);
				isWin = true;
			}else if(daemonData[0] <= 0){
				String result = playerName + "の勝利";
				System.out.println(result);
				log.append("結果: ").append(result);
				isWin = true;
			}
			
			
			
		}
		
		try (FileWriter fw = new FileWriter("src/curriculum/d/battle_log.txt")) {
            fw.write(log.toString());
            System.out.println("\n結果を battle_log.txt に保存しました。");
        } catch (IOException e) {
        	System.out.println("ログの保存に失敗しました: " + e.getMessage());
        }
		
		scanner.close();
		
	}
	
	// 攻撃処理を共通化したメソッド
		private static void attack(String attacker, int at, String target, int[] targetData, StringBuilder log) {
			String msg = attacker + "の攻撃 " + target + "に" + at + "のダメージ\n";
			System.out.print(msg);
			log.append(msg);
			targetData[0] -= at;
		}

}
