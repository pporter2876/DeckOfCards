import java.util.ArrayList;
import java.util.Collections;

/**  Each instance of the Deck class represents a deck of cards.
 *   ArrayList<Card> cards represents the deck itself.
 *   The deck can be shuffled, refreshed back to a full deck, 
 *   have the top card peeked at and dealt n cards at a time.
 */
public class Deck {

	public ArrayList<Card> cards;
	
	/**  Constructor.  Uses the refresh method in order to create a new full 
	 *    deck.   
	 */
	public Deck() {
		this.refresh();
	}
	
	/**  Refreshes the deck by creating a new ArrayList of 52 total cards
	 *     and then shuffles at the end.  Cards have values of 2 to 10, Jack,
	 *     Queen, King, or Ace and a suite of Spade, Heart, Club, or Diamond.
	 *     Each of the 52 cards are unique.
	 */
	public void refresh() {	
		
		//  erases the old list of cards to start fresh
		this.cards = new ArrayList<Card>(52);
		for (int i = 0; i < 4; i++) {
			
			String suit = "";
			
			switch (i) {
				case 0:
					suit = "Spade";
					break;
				case 1:
					suit = "Heart";
					break;
				case 2:
					suit = "Club";
					break;
				default:
					suit = "Diamond";
					break;
			}
			
			for (int j = 2; j < 15; j++) {
				
				String value = "";
				
				switch (j) {
					case 11:
						value = "Jack";
						break;
					case 12:
						value = "Queen";
						break;
					case 13:
						value = "King";
						break;
					case 14:
						value = "Ace";
						break;
					default:
						value = "" + j;
						break;
				}
				
				this.cards.add(new Card(suit, value));
			}
		}
		
		//  shuffles the newly created list of cards
		this.shuffle();
	}
	
	/**  Randomizes the deck's ArrayList of cards.
	 */
	public void shuffle() {
		Collections.shuffle(this.cards);
	}	
	
	/**  Deals n cards.
	 *   
	 *   @param n - the number of cards to be dealt, must be less
	 *     than the amount in the deck 
	 *   @return - an ArrayList<Card> of dealt cards
	 */
	public ArrayList<Card> deal(int n) {
		
		ArrayList<Card> dealtCards = new ArrayList<Card>(0);
		
		if (n > cards.size()) {
			n = cards.size();
		}
		
		for (int i = 0; i < n; i++) {
			dealtCards.add(cards.remove(0));
		}
		
		return dealtCards;
	}
	
	/**  Returns the top card of the deck but does not remove it from
	 *     the ArrayList<Card> cards.
	 * 
	 *   @return - returns the card at index 0 of cards.  If the deck is
	 *     empty returns null.
	 */
	public Card peek() {
		
		if (!cards.isEmpty()) {
			return cards.get(0);
		}
		
		return null;
	}
	
	/**  Returns a String representation of the deck as it is.
	 */
	public String toString() {
		String ret = "The deck contains: ";
		
		if (!cards.isEmpty()) {
			ret += "\n\n";
			for (int i = 0; i < cards.size(); i++) {
				ret += cards.get(i).toString() + "\n";
			}
		}
		else {
			ret += "nothing!";
		}
		
		return ret;
	}
}
