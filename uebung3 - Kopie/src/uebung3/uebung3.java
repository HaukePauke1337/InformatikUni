package uebung3;

public class uebung3 {

	public static double BMI(double m, double h) {

		return m / (Math.pow(h, 2));
	}

	public static String Elsefunktion(double BMI) {

		if (BMI < 18.5) {

			// SimpleIO.println("Untergewicht");
			return "Untergewicht";

		} else {
			if (BMI >= 25) {
				// SimpleIO.println("Übergewicht");
				return "Übergewicht";
			} else {
				// SimpleIO.println("Alles in Ordnung");
				return "Alles in Ordnung";
			}
		}
	}

	public static void main(String[] args) {

		double Masse;
		SimpleIO.println("Masse in Kilogramm");
		Masse = SimpleIO.readDouble();

		double Hoehe;
		SimpleIO.println("Höhe in Metern mit Punkt als Trennzeichen");
		Hoehe = SimpleIO.readDouble();

		double BMI = BMI(Masse, Hoehe);
		SimpleIO.println(BMI);
		SimpleIO.println(Elsefunktion(BMI));
	}

}
