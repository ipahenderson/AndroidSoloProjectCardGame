package ianhenderson.codeclan.com.cardgame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by ianhenderson on 08/01/2018.
 */

public class CardTest {


    Card card1;
    Card card2;


    @Before
    public void before(){
        card1 = new Card(SuitType.HEARTS, ValueType.SEVEN);
        card2 = new Card(SuitType.DIAMONDS, ValueType.TWO);
    }


    @Test
    public void canGetSuit(){
        assertEquals(SuitType.HEARTS, card1.SuitType());
    }


    @Test
    public void canGetValue(){
        assertEquals(ValueType.TWO, card2.getValue());
    }


    @Test
    public void cardSevenIs7(){
        assertEquals(7, card1.getRealValue());
    }


}
