package curriculum.c;

import java.util.Random;

public class Cpu {
	Random rand = new Random();
	
	// CPU側のメソッド
	public int getHand() {
		
		return rand.nextInt(3);
	}
	
	

}
