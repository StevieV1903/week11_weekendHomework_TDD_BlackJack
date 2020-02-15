import org.junit.Before;

public class GameTest {

    Player player1;
    Player player2;
    Deck deck;
    Game game;
    Card card1;
    Card card2;
    Card card3;
    Card card4;

    @Before
    public void before() {
        player1 = new Player("Steve");
        player2 = new Player("Norman");
        deck = new Deck();
        game = new Game(deck);
        game.addPlayer(player1);
        game.addPlayer(player2);
        card1 = new Card(SuitType.DIAMONDS, RankType.EIGHT);
        card2 = new Card(SuitType.CLUBS, RankType.QUEEN);
        card3 = new Card(SuitType.SPADES, RankType.TWO);
        card4 = new Card(SuitType.HEARTS, RankType.ACE);







    }


}
