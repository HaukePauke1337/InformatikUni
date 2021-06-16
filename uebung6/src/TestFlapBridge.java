public class TestFlapBridge {
	public static void main (String [] args) {
		FlapBridge bridgeCalledDiffene = new FlapBridge(29);
		FlapBridge bridgeInStade = new FlapBridge(45);
		
		bridgeCalledDiffene.println();
		bridgeInStade.println();
		
		bridgeCalledDiffene.open();

		bridgeCalledDiffene.println();
		bridgeInStade.println();
		
		bridgeCalledDiffene.close();
		bridgeInStade.open();
		
		bridgeCalledDiffene.println();
		bridgeInStade.println();
	}
}
