/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		// creates three new Card objects
		Card card1 = new Card("Ace", "Hearts", 1);
		Card card2 = new Card("Ace", "Hearts", 1);
		Card card3 = new Card("Seven", "Spades", 7);
		
		// tests accessor methods
		System.out.println("--------------------");
		System.out.println("ACCESSOR METHODS");
		System.out.println("--------------------");
		System.out.println("Card 1 suit: " + card1.suit());
		System.out.println("Card 2 suit: " + card2.suit());
		System.out.println("Card 3 suit: " + card3.suit());
		System.out.println("Card 1 rank: " + card1.rank());
		System.out.println("Card 2 rank: " + card2.rank());
		System.out.println("Card 3 rank: " + card3.rank());
		System.out.println("Card 1 Point Value: " + card1.pointValue());
		System.out.println("Card 2 Point Value: " + card2.pointValue());
		System.out.println("Card 3 Point Value: " + card3.pointValue());
		
		// tests the equality method
		System.out.println("--------------------");
		System.out.println("EQUALITY METHOD");
		System.out.println("--------------------");
		System.out.println("Card 1 and Card 2 equality : " + card1.matches(card2)); // should be true
		System.out.println("Card 2 and Card 3 equality: " + card2.matches(card3)); // should be false
		System.out.println("Card 1 and Card 3 equality: " + card1.matches(card3)); // should be false
		
		// tests the toString method
		System.out.println("--------------------");
		System.out.println("toString METHOD");
		System.out.println("--------------------");
		System.out.println("Card 1 to String : " + card1.toString()); 
		System.out.println("Card 2 to String : " + card2.toString()); 
		System.out.println("Card 3 to String : " + card3.toString());  
		
	}
}
