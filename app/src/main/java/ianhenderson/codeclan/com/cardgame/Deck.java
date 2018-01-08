package ianhenderson.codeclan.com.cardgame;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
/**
 * Created by ianhenderson on 08/01/2018.
 */

public class Deck {

    private ArrayList<Card> cards;


    public Deck(){
        this.cards = new ArrayList<>();
    }


    public int deckSize(){
        return this.cards.size();
    }



    public void populateDeck(){
        for(SuitType suit : SuitType.values()){
            for(ValueType value : ValueType.values()){
                cards.add(new Card(suit, value));

            }
        }

    }


    public Card dealCard() {
        return this.cards.remove(0);
    }


    public void shuffleDeck(){
        Collections.shuffle(cards);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }
}






