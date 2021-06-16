public class MainClass {
	public static void main(String [] args) {
		Quarter aQuarter = new Quarter();

		aQuarter.addItem(new House (10, 80, 100, 50, 100000, "Bergweg 23"));
		aQuarter.addItem(new Tree(144, 261));
		
		SimpleIO.println("Preis des Stadtteils: " + aQuarter.getPrice());
	}
}