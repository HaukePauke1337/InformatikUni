public class Tree extends QuarterItem {
	public Tree(int nX, int nY) {
		super(nX, nY);
	}
	
	public double getPrice(){
		return 100; // Fixed price
	}
	
	public void print() {
		SimpleIO.print("[Tree extends ");
		super.print();
		SimpleIO.print("]");
	}
}
