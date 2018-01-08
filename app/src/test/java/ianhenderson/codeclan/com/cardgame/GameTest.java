package ianhenderson.codeclan.com.cardgame;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GameTest {

    Game game;
    Player player1;
    Player player2;
    Deck deck;


    @Before
    public void before(){
        game = new Game();
        player1 = new Player("Matt");
        player2 = new Player("Jardine");
        deck = new Deck();
        game.addPlayer(player1);
        game.addPlayer(player2);
    }


    @Test
    public void canAddPlayers(){
    assertEquals(2, game.players.size());
    }


    @Test
    public void canTotalHands(){
        deck.populateDeck();
        deck.shuffleDeck();
        player1.takeCard(deck.dealCard());
        player1.takeCard(deck.dealCard());
        assertEquals(true, player1.getHandTotal() != 0);
    }


    @Test
    public void canRunGame(){
        game.runGame(game.getPlayers(), deck);
        assertNotNull(game.winner(player1, player2));
    }


    @Test
    public void canGiveWinner(){
        game.runGame(game.getPlayers(), deck);
        System.out.println(game.winner(player1, player2).getName());
        assertNotNull(game.winner(player1, player2));
    }


}
