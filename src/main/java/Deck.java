import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<Card>();
    }

    public int getSizeOfDeck() {
        return this.cards.size();
    }

    public ArrayList<Card> getCards() {
        return this.cards;
    }

    public void populateDeckWithCards(ArrayList<Card> cards){
        for (SuitType suit : SuitType.values()){
            for(RankType rank : RankType.values()){
                cards.add(new Card(suit, rank));
            }
        }
    }
}
