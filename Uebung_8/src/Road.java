public class Road extends QuarterItem {
	
	public static final int MAX_LENGTH_ROAD = 100; 
	
	private int[] roadCoords;
	private int number_of_coords;
	private double length;
	
	public Road(int nX, int nY) {
		
		super(nX, nY);
		roadCoords = new int[MAX_LENGTH_ROAD];
		
		number_of_coords = 0;
		
	}
	
	public void addPoint(int nX, int nY) {
		roadCoords[number_of_coords] = nX;
		number_of_coords++;
		roadCoords[number_of_coords] = nY;
		number_of_coords++;
		
	}
	public double getLength() {
		length = (x-roadCoords[0])*(x-roadCoords[0])+(y-roadCoords[1])*(y-roadCoords[1]);
		SimpleIO.println(x + "-" + roadCoords[0]);
		SimpleIO.println(y + "-" + roadCoords[1]);
		
		
		for (int i = 0; i <= number_of_coords-4; i++) {
			
			length = length + Math.sqrt((roadCoords[i]-roadCoords[i+2])*(roadCoords[i]-roadCoords[i+2])
					+ (roadCoords[i+1]-roadCoords[i+3])*(roadCoords[i+1]-roadCoords[i+3]));
			
			SimpleIO.println(roadCoords[i] + "-" + roadCoords[i+2]);
			SimpleIO.println(roadCoords[i+1] + "-" + roadCoords[i+3]);
			i++;
		
			}
		SimpleIO.println(length);
		return length;
	}
	
	public double getPrice(){
		return getLength()*1000; // Fixed price
	}
	
	public void print() {
		SimpleIO.print("[Road extends ");
		super.print();
		
		for (int i = 0; i <= number_of_coords-1; i++) {
			
			SimpleIO.print("[ " + roadCoords[i] + " " + roadCoords[i+1] + " ]");
			i++;
			
		}
		
		
		
		SimpleIO.print("]");
	}
	
	
	
}
