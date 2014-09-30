import java.util.ArrayList;

/**  For testing purposes only.
 */
public class Main {

	/**  Uses the Deck class methods and prints the results.
	 */
	public static void main(String[] args) {
		
		System.out.println("Test for the Deck class. \n");
		Deck deck = new Deck();
		
		System.out.println("Printing the deck...\n");
		System.out.println(deck.toString() + "\n");
		
		System.out.println("Printing the top card: " + deck.peek().toString() + "\n");
		
		System.out.println("Dealing 1 card: ");
		ArrayList<Card> dealtCards1 = deck.deal(1);
		System.out.println(dealtCards1.get(0).toString()+"\n");
		
		System.out.println("Shuffling the deck...\n");
		deck.shuffle();
		
		System.out.println("Dealing 3 cards: ");
		ArrayList<Card> dealtCards2 = deck.deal(3);
		for (int i = 0; i < dealtCards2.size(); i++) {
			System.out.println(dealtCards2.get(i).toString());
		}
		System.out.println();
		
		System.out.println("Shuffling the deck...\n");
		deck.shuffle();
		
		System.out.println("Dealing 7 cards: ");
		ArrayList<Card> dealtCards3 = deck.deal(7);
		for (int i = 0; i < dealtCards3.size(); i++) {
			System.out.println(dealtCards3.get(i).toString());
		}
		System.out.println();
		
		System.out.println("Printing the remainder of deck...\n");
		System.out.println(deck.toString());
		
		System.out.println("Refreshing the deck... \n");
		deck.refresh();
		System.out.println(deck.toString() + "\n");
	}
}
