package ianhenderson.codeclan.com.cardgame;

public class Card {

    private SuitType suit;
    private ValueType value;

    public Card(SuitType suit, ValueType value) {
        this.suit = suit;
        this.value = value;
    }


    public SuitType SuitType() {
        return this.suit;
    }

    public ValueType getValue() {
        return this.value;
    }

    public int getRealValue() {
        return this.value.getValue();
    }

    public String prettyName(){
        return value.toString() + " of " + suit.toString();
    }
}
