package ianhenderson.codeclan.com.cardgame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by ianhenderson on 08/01/2018.
 */

public class PlayerTest {


    Player player1;
    Player player2;
    Deck deck;



    @Before
    public void before(){
        player1 = new Player("Matt");
        player2 = new Player("Jardine");
        deck = new Deck();
        deck.populateDeck();
        deck.shuffleDeck();

    }


    @Test
    public void canGetName(){
        assertEquals("Matt", player1.getName());
    }

    @Test
    public void canTakeCards(){
        player1.takeCard(deck.dealCard());
        player1.takeCard(deck.dealCard());
        assertEquals(2, player1.getHand().size());
    }

}
