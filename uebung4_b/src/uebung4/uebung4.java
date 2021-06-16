package uebung4;

public class uebung4 {

	private static int cutOffDecimalPlaces(double value) {
		return (int) value;
	}

	public static double Fi(double i) {
		return i * 12 + 100;
	}

	public static double Ai(double L, double n) {
		double Fi = Fi(n);
		return ((L - n) / L) * Fi;
	}

	public static void main(String[] args) {

		SimpleIO.println("Bitte die Länge eingeben: ");
		double L = SimpleIO.readDouble();

		int count;
		int n = cutOffDecimalPlaces(L);

		double A = 0;

		for (count = 0; count <= n; count++) {
			// SimpleIO.println(count);

			double Ai = Ai(L, count);
			A = A + Ai;

		}
		SimpleIO.println("Die Kraft A ist: " + A + " kN groß!");
	}

}
