package uebung3;

public class uebung32 {

	public static void main(String[] args) {

		double value = 1;
		int count = -1;
		while (value < 10000) {
			SimpleIO.println("Wert ist unter 10000");
			SimpleIO.println(value);
			count++;
			value = value * 2;

		}
		SimpleIO.println();
		SimpleIO.println("n ist gleich " + count);

	}

}
