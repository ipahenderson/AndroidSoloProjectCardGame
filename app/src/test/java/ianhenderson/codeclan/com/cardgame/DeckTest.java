package ianhenderson.codeclan.com.cardgame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
/**
 * Created by ianhenderson on 08/01/2018.
 */

public class DeckTest {

    Deck deck;



    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void deckStartsEmpty(){
        assertEquals(0, deck.deckSize());
    }


    @Test
    public void deckHas52Cards(){
        deck.populateDeck();
        for (Card card : deck.getCards()){
            System.out.println(card.prettyName());
        }
        assertEquals(52, deck.deckSize());
    }

    @Test
    public void deckHasImages(){
        deck.populateDeck();
        deck.setImages();
        for (Card card : deck.getCards()){
            System.out.println(card.prettyName());
        }
        assertEquals("@drawable/queen_of_clubs", deck.getCards().get(50).getImage());
    }


    @Test
    public void canDealCard(){
        deck.populateDeck();
        Card firstCard = new Card(SuitType.values()[0], ValueType.values()[0]);
        assertEquals(firstCard.getValue(), deck.dealCard().getValue());
    }


    @Test
    public void randomCardDealt(){
        deck.populateDeck();
        deck.shuffleDeck();
        System.out.println(deck.dealCard().prettyName());
    }



}
