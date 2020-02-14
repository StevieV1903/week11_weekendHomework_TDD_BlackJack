import java.util.ArrayList;
public class Player {

    private String name;
    private ArrayList<Card> playerHand;

    public Player(String name){
        this.name = name;
        this.playerHand = new ArrayList<Card>();
    }

    public String getName() {
        return this.name;
    }

    public int cardCount() {
        return this.playerHand.size();
    }

    public void takeCard(Card card) {
        this.playerHand.add(card);
    }



    }

