DeckOfCards
===========

Deck of Cards

The Deck of Cards project features the Deck structure in software containing an Array List of Card elements.  Each Card object has:

- A String suit (Heart, Spade, Club, Diamond)
- A String value (2 to 10, Jack, Queen, King, or Ace)

The Deck itself only contains:

- An ArrayList<Card> cards

The Deck has methods:

- refresh, which creates a new deck and then shuffles
- shuffle, which randomizes the list of the deck
- peek, which returns the top element without removing it from the deck
- deal, which removes n cards from the cards ArrayList and returns them in an ArrayList

The Main.java class is just for testing purposes to display the uses of the Deck methods.
