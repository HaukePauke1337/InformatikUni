public class MainClass {
	public static void main(String[] args) {
		QuarterItem lake1 = new Lake(100, 150, 150, 80, 5, true, 50000);
		QuarterItem lake2 = new Lake(300, 400, 200, 30, 3, false, 10000);
		
		SimpleIO.println(lake1.getPrice());
		lake1.println();
		SimpleIO.println(lake2.getPrice());
		lake2.println();
	}
}