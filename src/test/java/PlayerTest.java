import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class PlayerTest {

    Player player;
    Card card;



    @Before
    public void before() {
        player = new Player("Steve");
        card = new Card(SuitType.SPADES, RankType.ACE);
    }

    @Test
    public void canGetPlayerName() {
        assertEquals("Steve", player.getName());
    }

    @Test
    public void playerStartsWithAnEmptyHand() {
        assertEquals(0, player.cardCount());
    }

    @Test
    public void playerCanTakeTwoCards() {
        player.takeCard(card);
        player.takeCard(card);
        assertEquals(2, player.cardCount());
    }

    @Test
    public void playerCanRevealCard(){
        player.takeCard(card);
        assertEquals("ACE of SPADES", player.showCard(0));
    }


}
