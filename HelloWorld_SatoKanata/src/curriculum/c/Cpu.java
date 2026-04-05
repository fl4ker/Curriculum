package curriculum.c;

import java.util.Random;

public class Cpu {
	// CPU側のメソッド
	public int getHand() {
		Random rand = new Random();
		return rand.nextInt(3);
	}
	
	

}
