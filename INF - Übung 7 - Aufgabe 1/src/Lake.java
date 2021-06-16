
public class Lake extends QuarterItem {

	private int length;
	private int width;
	private double avgDepth;
	private boolean hasBeach;
	private double additionalCosts;

	public Lake(int nX, int nY, int nwidth, int nlength, double navgDepth, boolean nhasBeach,
			double nadditionalCosts) {

		super(nX, nY);
		width = nwidth;
		length = nlength;
		avgDepth = navgDepth;
		hasBeach = nhasBeach;
		additionalCosts = nadditionalCosts;
	}

	public double getPrice() {
		double Beachcosts = 0;
		if (hasBeach == true) {
			Beachcosts = 150000;
		}

		return (Math.PI * (length / 2) * (width / 2)) * avgDepth * 100 + additionalCosts + Beachcosts;
	}
	
	
	public void print() {
		SimpleIO.print("[Lake extends ");
		super.print();
		SimpleIO.print(": width=" + width);
		SimpleIO.print(", length=" + length);
		SimpleIO.print(", avgDepth=" + avgDepth);
		SimpleIO.print(", hasBeach=" + hasBeach);
		SimpleIO.print(", additionalCosts=" + additionalCosts + "]");
	}
}
