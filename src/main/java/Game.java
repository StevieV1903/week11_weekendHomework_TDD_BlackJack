import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;
    private Deck deck;

    public Game(Deck deck){
        this.players = new ArrayList<Player>();
        this.deck = deck;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public int playerCount(){
        return this.players.size();
    }
}
