public class MainClass {
	public static void main(String [] args) {
		Quarter aQuarter = new Quarter();

		aQuarter.addItem(new House (10, 80, 100, 50, 100000, "Bergweg 23"));
		aQuarter.addItem(new Tree(144, 261));
		
		
		
		
		Road aRoad = new Road(50, 100);
		aQuarter.addItem(aRoad);
		
			
		aRoad.addPoint(110, 180);
		aRoad.addPoint(250, 150);
		aRoad.addPoint(320, 220);
		aRoad.addPoint(400, 220);
		
		
		
		aRoad.println();
		SimpleIO.println("Preis des Stadtteils: " + aQuarter.getPrice());
		
		
		
		
		
	}
}