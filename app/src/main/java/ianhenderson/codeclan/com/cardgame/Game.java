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


    public void setUpDeck(){
        deck.populateDeck();
        deck.setImages();
        deck.shuffleDeck();
    }

    public void runGame() {
        this.players.get(0).takeCard(deck.dealCard());
        this.players.get(0).takeCard(deck.dealCard());
        this.players.get(1).takeCard(deck.dealCard());
        this.players.get(1).takeCard(deck.dealCard());
    }

    public String prettyScore(){
        Player player1 = players.get(0);
        Player player2 = players.get(1);
        Player gameWinner = winner(player1, player2);

        if (player1.getHandTotal() == 21 && player2.getHandTotal() == 21){
            return "It's a draw, both players have BLACKJACK!";
        }
        else if ((player1.getHandTotal() == player2.getHandTotal() &&
                (player1.getHand().size() == 2) == (player2.getHand().size() == 2))
                && player1.getHandTotal() == 20)
        {
            return "It's a draw, both players have " + player1.getHandTotal() + " points!";
        }
        else if (gameWinner.getHandTotal() == 21 && gameWinner.getHand().size() == 2){
            return gameWinner.getName() + " wins with: \n" + "BLACKJACK! " +
                    "\n (Points: " + gameWinner.getHandTotal() + ")";
        }
        else if (player1.getHandTotal() > 21){
            return player1.getName() + " is bust!";
        }
        else if (player2.getHandTotal() > 21){
            return player2.getName() + " is bust!";
        }
        else{
            return gameWinner.getName() + " wins with: \n" +
                    gameWinner.getHand().get(0).prettyName() +
                    " & " + gameWinner.getHand().get(1).prettyName() +
                    "\n (Points: " + gameWinner.getHandTotal() + ")";
        }
    }

    public void playerHit(){
        Player player1 = players.get(0);
        Player player2 = players.get(1);
        player2.takeCard(deck.dealCard());

        if (player1.getHandTotal() <= 16){
            player1.takeCard(deck.dealCard());
        }
    }

    public void computerHit(){
        Player computer = players.get(0);
        if (computer.getHandTotal() <= 16) {
            computer.takeCard(deck.dealCard());
        }
    }

    public void freshDeck(){
        if (deck.deckSize() < 52){
            setUpDeck();
        }
    }
}


