public class TestHuman {
	public static void main(String[] args) {
		Human hugo;
		Human klara;
		
		hugo = new Human(93, 1.90);  // Hugo wiegt 93 kg und ist 190 cm groﬂ. 
		klara = new Human(49, 1.65); // Klara wiegt 49 kg und ist 165 cm groﬂ. 
		
		hugo.printRating();
		klara.printRating();
	
		hugo.loseWeight(5);  // Hugo nimmt 5kg ab.
		klara.gainWeight(3); // Klara nimmt 3kg zu. 
		
		hugo.printRating();
		klara.printRating();
	}
}
