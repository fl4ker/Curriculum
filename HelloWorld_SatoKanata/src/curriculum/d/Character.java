package curriculum.d;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;

public class Character {
	private Random random;
	
	public Character() {
        this.random = new Random();
    }
	
	public int[] generateStatus(int... limits) {
		int[] status = new int[limits.length];
		for(int i = 0; i < limits.length; i++) {
			status[i] = random.nextInt(limits[i]) + 1;
		}
		return status;
	}
	
	// テキストファイルの読み込み
	public int[] loadDaemon(String fileName) {
		int[] stats = new int[3];
		int count = 0;
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
			br.readLine();// 1行目を飛ばす
			String line;
			while ((line = br.readLine()) != null && count < 3) {
                line = line.trim();
                if (line.isEmpty()) continue; // 空行があれば飛ばす
                
                stats[count] = Integer.parseInt(line);
                count++;
			}
 			
			
		}catch(Exception e) {
			System.out.println("読み込みに失敗したためデフォルト値設定になります");
			e.printStackTrace();
			return new int[]{100, 10, 10}; // 失敗時の予備
		}
		return stats;
	}
	
	


}
