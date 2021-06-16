public class QuarterItem {
	private int x;
	private int y;
	
	public QuarterItem(int nX, int nY) {
		x = nX;
		y = nY;
	}
	
	public double getPrice() {
		return 0; // Not known here
	}
	
	public void print() {
		SimpleIO.print("[QuarterItem: x=" + x + ", y=" + y + "]");
	}
	
	public void println() {
		print(); // Calls method in same object
		SimpleIO.println(""); // Goto next line 
	}
}
