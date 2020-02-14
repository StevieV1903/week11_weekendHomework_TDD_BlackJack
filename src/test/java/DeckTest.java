import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

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
        //check that that array list is empty at the start
        assertEquals(0, deck.getSizeOfDeck());
    }

    @Test
    public void theFullDeckHas52CardsWhenPopulated(){
        //need to populate the array of cards with a getter method (getCards)
        deck.populateDeckWithCards(deck.getCards());
        assertEquals(52, deck.getSizeOfDeck());
    }

    @Test
    public void theDeckCanDealACard(){
        //need to populate the deck
        //need to remove a card from the populated array list
        //deck size should be 51
        deck.populateDeckWithCards(deck.getCards());
        deck.dealCard();
        assertEquals(51, deck.getSizeOfDeck());

    }
}
