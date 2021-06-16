public class TestIntVector {
	public static void main(String[] args) {
		IntVector x;
		IntVector y;
		
		x = new IntVector(3);
		x.setValue(0, 1);
		x.setValue(1, 2);
		x.setValue(2, 3);
		
		y = new IntVector(3);
		y.setValue(0, 9);
		y.setValue(1, -3);
		y.setValue(2, 4);
		
		SimpleIO.println(x.scalarProduct(y));
	}
}
