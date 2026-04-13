package curriculum.d;
import java.util.Random;

public class Character {
	private Random random;
	
	public Character() {
        this.random = new Random();
    }
	
	public int[] generateStatus(int... limits) {
		int[] status = new int[limits.length];
		for(int i = 0; i < limits.length; i++) {
			status[i] = random.nextInt(limits[i]);
		}
		return status;
	}
	
	
	


}
