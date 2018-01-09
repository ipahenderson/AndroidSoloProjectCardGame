package ianhenderson.codeclan.com.cardgame;

import java.util.ArrayList;

/**
 * Created by ianhenderson on 08/01/2018.
 */

public class Player {


    private String name;
    private ArrayList<Card> hand;

    public  Player(String inputName){
        this.name = inputName;
        this.hand = new ArrayList<>();
    }


    public String getName(){
        return this.name;
    }

    public ArrayList<Card> getHand(){
        return this.hand;
    }

    public void takeCard(Card inputCard) {
        this.hand.add(inputCard);
    }

    public int getHandTotal(){
        int total = 0;
        for (Card card : hand) {
            if (card.getValue().equals(ValueType.ACE) && total < 21) {
                total += card.getRealValue();
                total+= 10;
            }
            else{
                total += card.getRealValue();
            }
        }
        return total;
        }


}

