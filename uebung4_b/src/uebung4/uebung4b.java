package uebung4;

public class uebung4b {

	private static double s = 0.001;
	// private static double A = 1;
	private static double roh = 7850;
	private static double cp = 490;
	private static double qsol = 900;
	private static double p = 0.2;
	private static double alphawind = 40;
	private static double alphastill = 15;
	private static double Tu = 293.15;
	private static double Tstahl0 = 293.15;

	// Die Funktion Laufzeit erlaubt eine Nutzereingabe für die Dauer,
	// also nach welcher Zeit das Experiment abgebrochen wird.
	public static double Laufzeit() {

		double Laufzeit;
		SimpleIO.println("Bitte die Laufzeit der Untersuchung in Sekunden angeben");
		Laufzeit = SimpleIO.readDouble();
		Laufzeit = Laufzeit  * 10;

		return Laufzeit;
	}

	// Berechnung der Temperatur durch Erwärmung bei Wind
	public static double Twind() {

		double t;
		double T = Tstahl0;
		double deltaT;
		int count = 0;

		double Zeitdauer = Laufzeit();

		for (t = 0; count <= Zeitdauer; t = t + 0.1) {


			SimpleIO.println("Die aktuelle Zeit beträgt " + t + " Sekunden");
			SimpleIO.println("Temperatur beträgt momentan " + T + " °C");

			deltaT = (1 / (s * roh * cp)) * (qsol * (1 - p) - alphawind * (T - Tu)) * 0.1;
			T = T + deltaT;
			count++;

		}

		return T - 273.15;
	}

	// Berechnung der Temperatur durch Erwärmung bei Wind
	public static double Tstill() {
		double t;
		double T = Tstahl0;
		double deltaT = 1;
		int count = 0;

		double Zeitdauer = Laufzeit();

		for (t = 0; count <= Zeitdauer; t = t + 0.1) {

			// (t = 0; deltaT <= 0.05; t = t+0.1) {

			SimpleIO.println("Die aktuelle Zeit beträgt " + t + " Sekunden");
			SimpleIO.println("Temperatur beträgt momentan " + T + " °C");

			deltaT = (1 / (s * roh * cp)) * (qsol * (1 - p) - alphastill * (T - Tu)) * 0.1;
			T = T + deltaT;
			count++;

		}

		return T - 273.15;
	}

	// Mit dieser Funktion wird Ã¼berprÃ¼ft, ob die Temperatur sinkt oder steigt, um
	// anschlieÃŸend
	// einen String auszugeben. Da die Temperatur sowohl bei Wind als auch ohne Wind
	// steigt,
	// ist die Funktion Ã¼berflÃ¼ssig. Ich will sie aber behalten weil sie ja jetzt
	// schon drin ist :D
	public static String Vorzeichen(double Tnachher) {

		String Vorzeichen;
		double placeholder = Tnachher - Tstahl0;
		if (placeholder >= 0) {
			Vorzeichen = "gesunken";
		} else {
			Vorzeichen = "gestiegen";
		}
		return Vorzeichen;
	}

	public static boolean Entscheidung() {

		SimpleIO.println("Soll die Temperaturerhöhung bei Wind, oder Windstille berechnet werden ? [w/ws]");
		String s;
		s = SimpleIO.readString();

		s = s.toLowerCase().trim();
		if (s.equals("w")) {
			return true;
		}
		if (s.equals("ws")) {
			return false;
		}
		throw new NumberFormatException(
				"Es muss genau 'w' oder 'ws' eingegeben werden. Andere Werte können nicht verarbeitet werden.");
	}

	public static void main(String[] args) {

		// Hier der Input: Soll Wind oder Windstill angezeigt werden

		boolean WoderWS = Entscheidung();

		if (WoderWS) {
			double Tempwind;
			Tempwind = Twind();
			double Stahltempanfang = Tstahl0 - 273.15;
			SimpleIO.println("Die Starttemperatur beträgt " + Stahltempanfang + " °C");

			SimpleIO.println("\nDie resultierende Temperatur beträgt " + Tempwind + " °C");

			SimpleIO.println("\nSomit ist die Temperatur um " + Math.abs(Tempwind - Stahltempanfang) + " °C " + Vorzeichen(Tempwind));

		} else {
			double Tempstill;
			Tempstill = Tstill();
			double Stahltempanfang = Tstahl0 - 273.15;
			SimpleIO.println("Die Starttemperatur beträgt " + Stahltempanfang + " °C");

			SimpleIO.println("\nDie resultierende Temperatur beträgt " + Tempstill + " °C");

			SimpleIO.println("\nSomit ist die Temperatur um " + Math.abs(Tempstill - Stahltempanfang) + " °C " + Vorzeichen(Tempstill));
		}
	}
}
