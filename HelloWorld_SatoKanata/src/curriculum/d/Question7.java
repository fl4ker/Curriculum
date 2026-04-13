package curriculum.d;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Question7 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		Character generator = new Character();
		
		// テキストファイルの読み込み
		try {
			List<String> lines = Files.readAllLines(Paths.get("DaemonStatus.txt"));
			
			for(String line : lines){
				System.out.println(line);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		boolean isWin = false;
		
		// バトル判定
		while(!isWin) {
			System.out.println("プレイヤー名を入力してください");
			// プレイヤー名を入力させる
			String player = scanner.nextLine();
			
			int [] result= generator.generateStatus(100, 51, 30);
			
			System.out.println("HP: " + result[0]);
			System.out.println("AT: " + result[1]);
			System.out.println("SP: " + result[2]);
			
			scanner.close();
			if(player ) {
				
				
				
				
			}else if(){
				
				
			}else {
				
			}
			
			// どちらかのHPが0になったらループ終了
			/*if(playerHp == 0) {
				
				isWin = true;
			}else {
				
				isWin = true;
			}
			*/
			
		}
		scanner.close();
		
	}

}
