package ianhenderson.codeclan.com.cardgame;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by ianhenderson on 08/01/2018.
 */

public class GameTest {

    Game game;
    Player player1;
    Player player2;
    Deck deck;
    Card card1;
    Card card2;


    @Before
    public void before(){
        game = new Game();
        player1 = new Player("Matt");
        player2 = new Player("Jardine");
        deck = new Deck();
        card1 = new Card(SuitType.SPADES, ValueType.ACE);
        card2 = new Card(SuitType.SPADES, ValueType.JACK);

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
        game.runGame(deck);
        assertNotNull(game.winner(player1, player2));
    }


    @Test
    public void canGiveWinner(){
        game.runGame(deck);
        System.out.println(game.winner(player1, player2).getName());
        assertNotNull(game.winner(player1, player2));
    }

    @Test
    public void canDrawWithBlackJack(){
        deck.populateDeck();
        deck.shuffleDeck();
        player1.takeCard(card1);
        player1.takeCard(card2);
        player2.takeCard(card1);
        player2.takeCard(card2);
        assertEquals("It's a draw, both players have BLACKJACK!", game.prettyScore());
    }
    @Test
    public void canDrawWithTwoCardScore(){
        deck.populateDeck();
        deck.shuffleDeck();
        player1.takeCard(card2);
        player1.takeCard(card2);
        player2.takeCard(card2);
        player2.takeCard(card2);
        assertEquals("It's a draw, both players have " + player1.getHandTotal() + " points!", game.prettyScore());
    }

}

