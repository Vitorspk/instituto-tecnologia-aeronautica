
public class Relogio {
	public static long agora() {
		long millis = System.currentTimeMillis();
		if (millis != 0) return millis;
		else return 1;	
	}
}
