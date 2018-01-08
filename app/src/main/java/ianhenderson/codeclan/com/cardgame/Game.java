package ianhenderson.codeclan.com.cardgame;

import java.util.ArrayList;
/**
 * Created by ianhenderson on 08/01/2018.
 */


public class Game {
    ArrayList<Player> players;
    Deck deck;

    public Game(){
        this.players = new ArrayList<>();
        this.deck  = new Deck();
    }

    public void addPlayer(Player inputPlayer1){
        this.players.add(inputPlayer1);
    }

    public ArrayList<Player> getPlayers(){
        return this.players;
    }

    public int playerCount(){
        return this.players.size();
    }


    public Player winner(Player inputPlayer1, Player inputPlayer2) {
        if (inputPlayer1.getHandTotal() > inputPlayer2.getHandTotal()){
                return inputPlayer1;
            }else{
                return inputPlayer2;
            }
        }

    public void runGame(ArrayList<Player> inputPlayers, Deck inputDeck) {
        inputDeck.populateDeck();
        inputDeck.shuffleDeck();
        inputPlayers.get(0).takeCard(inputDeck.dealCard());
        inputPlayers.get(0).takeCard(inputDeck.dealCard());
        inputPlayers.get(1).takeCard(inputDeck.dealCard());
        inputPlayers.get(1).takeCard(inputDeck.dealCard());
    }
}


