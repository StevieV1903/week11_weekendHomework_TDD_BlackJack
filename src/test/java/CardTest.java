import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CardTest {

    Card  card;

    @Before
    public void before(){
        card = new Card(SuitType.CLUBS, RankType.QUEEN);
    }

    @Test
    public void canGetSuitFromCard(){
        assertEquals(SuitType.CLUBS, card.getCardSuitType());
    }

    @Test
    public void canGetRankFromCard(){
        assertEquals(RankType.QUEEN, card.getCardRankType());
    }
}
