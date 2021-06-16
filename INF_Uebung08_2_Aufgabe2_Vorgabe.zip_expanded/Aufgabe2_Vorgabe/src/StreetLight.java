public class StreetLight extends QuarterItem {
	private boolean lampOn;
	private double lampPower;
	private double basePrice;

	public StreetLight(int nX, int nY, double nLampPower, double nBasePrice) {
		super(nX, nY);
		lampOn = false;
		lampPower = nLampPower;
		basePrice = nBasePrice;
	}
	
	public void switchOn() {
		lampOn = true;
	}
		
	public void switchOff() {
		lampOn = false;
	}
		
	public double getPrice() {
		return basePrice + lampPower * 0.10;
	}
	
	public void print() {
		SimpleIO.print("[StreetLight extends ");
		super.print();
		SimpleIO.print(": lampOn=" + lampOn);
		SimpleIO.print(", lampPower=" + lampPower);
		SimpleIO.print(", basePrice=" + basePrice + "]");
	}
}
