import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DeckTest {

    private Deck deck;
    private Card card;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void theDeckStartsEmpty(){
        assertEquals(0, deck.getSizeOfDeck());
    }

    @Test
    public void theFullDeckHas52CardsWhenPopulated(){
        //need to populate the array of cards with a getter method (getCards)
        deck.populateDeckWithCards(deck.getCards());
        assertEquals(52, deck.getSizeOfDeck());
    }

    @Test
    public void theDeck
}
