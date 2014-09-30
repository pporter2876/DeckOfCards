/**  Each instance of the class represents a single card and
 *     has a unique suit (Heart, Spade, Club, Diamond) and value
 *     (2 to 10, Jack, Queen, King, or Ace).
 */
public class Card {

	private String suit;
	private String value;
	
	/**  Instantiates the instance with a unique String suit and
	 *     String value.  
	 * 
	 *   @param s - String suit
	 *   @param v - String value
	 */
	public Card(String s, String v) {
		suit = s;
		value = v;
	}
	
	/**  Returns a String representation of the card's suit and
	 *     value.
	 */
	public String toString() {
		return "The " + value + " of " + suit + "s."; 
	}
}
