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

    public void runGame(Deck inputDeck) {
        inputDeck.populateDeck();
        inputDeck.setImages();
        inputDeck.shuffleDeck();
        this.players.get(0).takeCard(inputDeck.dealCard());
        this.players.get(0).takeCard(inputDeck.dealCard());
        this.players.get(1).takeCard(inputDeck.dealCard());
        this.players.get(1).takeCard(inputDeck.dealCard());
    }

    public String prettyScore(){
        Player player1 = players.get(0);
        Player player2 = players.get(1);
        return winner(player1, player2).getName() + " wins with: \n" +
                winner(player1, player2).getHand().get(0).prettyName() +
                " & " + winner(player1, player2).getHand().get(1).prettyName() +
                " (Points: " + winner(player1, player2).getHandTotal() + ")";
    }
}


