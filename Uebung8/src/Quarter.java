public class Quarter {
	public static final int MAX_NO_QUARTERITEMS = 100; 
	
	private QuarterItem[] items;
	private int noOfItems;
	
	public Quarter() {
		items = new QuarterItem[MAX_NO_QUARTERITEMS];
		noOfItems = 0;
	}
	
	public void addItem(QuarterItem item) {
		items[noOfItems] = item;
		noOfItems++;
	}
	
	public double getPrice() {
		double sumOfPrices = 0;
		
		for (int i = 0; i < noOfItems; i++) {
			sumOfPrices += items[i].getPrice();
		}
		return sumOfPrices;
	}
	
	public void println() {
		SimpleIO.println("[Quarter: ");
		for (int i = 0; i < noOfItems; i++) {
			SimpleIO.print("  ");
			items[i].println();
		}
		System.out.println("]");
	}
}
