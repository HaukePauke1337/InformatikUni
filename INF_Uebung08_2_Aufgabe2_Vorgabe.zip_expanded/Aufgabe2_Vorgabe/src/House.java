public class House extends QuarterItem {
	private int width;
	private int depth;
	private double price;
	private String name;
	
	public House(int nX, int nY, int nWidth, int nDepth, double nPrice, String nName) {
		super(nX, nY);
		width = nWidth;
		depth = nDepth;
		price = nPrice;
		name = nName;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void print() {
		SimpleIO.print("[House extends ");
		super.print();
		SimpleIO.print(": width=" + width);
		SimpleIO.print(", depth=" + depth);
		SimpleIO.print(", price=" + price);
		SimpleIO.print(", name=" + name + "]");
	}
}
