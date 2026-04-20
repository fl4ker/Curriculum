package curriculum.d;

// ファイル操作用
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;

public class Question7 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		Character generator = new Character();
		
		// テキストファイルの読み込み
		int[] daemonData = new int[3];
		try(BufferedReader br = new BufferedReader(new FileReader("DaemonStatus.txt"))){
			String line = br.readLine();
			if(line != null) {
				System.out.println(line);
				String[] values = line.split(",");
 				for(int i = 0; i < 3; i++){
					daemonData[i] = Integer.parseInt(values[i].trim());
				}
			}
		}catch(Exception e) {
			daemonData = new int[]{100, 10, 10}; // 失敗時の予備
		}
		
		boolean isWin = false;
		
		System.out.println("プレイヤー名を入力してください");
		
		// バトル判定
		while(!isWin) {
			//System.out.println("プレイヤー名を入力してください");
			// プレイヤー名を入力させる
			String playerName = scanner.nextLine();
			
			int [] playerData = generator.generateStatus(100, 51, 30);
			
			System.out.println("HP: " + playerData[0]);
			System.out.println("AT: " + playerData[1]);
			System.out.println("SP: " + playerData[2]);
			
			if() {
				if(playerData[2] > daemonData[2]) {
					System.out.println(playerName + "の先制攻撃");
					daemonData[0] -= playerData[1];
					continue;
					
				}else if(daemonData[2] > playerData[2]){
					System.out.println("Daemonの先制攻撃");
					playerData[0] -= daemonData[1];
					continue;
					
				}else {
					// 乱数を追加して振り分ける
					int atRandom = generator.generateStatus(2)[0];
					if(atRandom == 0) {
						daemonData[0] -= playerData[1];
					}else {
						daemonData[0] -= playerData[1];
					}
					  
				}
			}
			/*if(playerData[2] > daemonData[2]) {
				System.out.println(playerName + "の先制攻撃");
				daemonData[0] -= playerData[1];
				continue;
				
			}else if(daemonData[2] > playerData[2]){
				System.out.println("Daemonの先制攻撃");
				playerData[0] -= daemonData[1];
				continue;
				
			}else {
				// 乱数を追加して振り分ける
				int atRandom = generator.generateStatus(2)[0];
				if(atRandom == 0) {
					daemonData[0] -= playerData[1];
				}else {
					daemonData[0] -= playerData[1];
				}
				  
			}*/
			
			// どちらかのHPが0になったらループ終了
			if(playerData[0] == 0) {
				System.out.println(playerName + "の勝利");
				isWin = true;
			}else if(daemonData[0] == 0){
				System.out.println("Daemonの勝利");
				isWin = true;
			}else {
				System.out.println("引き分け");
				isWin = true;
			}
			
			
		}
		scanner.close();
		
	}

}
