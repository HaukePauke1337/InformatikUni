
public class uebung5 {

	public static int noOfDivisors(int x) {
		int Anzahl_der_Teiler = 0;

		for (int y = 2; y < x; y++) {

			double s = x % y;
			if (s == 0) {
				Anzahl_der_Teiler++;
			}

		}

		return Anzahl_der_Teiler;

	}

	public static void main(String[] args) {

		for (int a = 2; a < 100; a++) {

			int Teiler_von_a = noOfDivisors(a);
			if (Teiler_von_a == 0) {
				SimpleIO.println(a);
			}

		}

	}

}
