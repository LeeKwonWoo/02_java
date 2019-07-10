package control.loop;

public class F2CTable {

	public static void main(String[] args) {
		for (double f = 0.0; f <= 100.0; f += 10.0) {
			System.out.printf("%5.1f F = %5.1f C%n", f, 5.0 / 9.0 * (f - 32.0));
		}
	}

}
