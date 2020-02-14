public class Card {

    private SuitType suit;
    private RankType rank;

    public Card(SuitType suit, RankType rank){
        this.suit = suit;
        this.rank = rank;
    }

    public SuitType getCardSuitType() {
        return suit;
    }

    public RankType getCardRankType() {
        return rank;
    }


}
