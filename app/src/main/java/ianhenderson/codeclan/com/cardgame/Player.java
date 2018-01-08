package ianhenderson.codeclan.com.cardgame;

import java.util.ArrayList;

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
        for (Card card : hand){
            total += card.getRealValue();
        }
        return total;
        }


}

