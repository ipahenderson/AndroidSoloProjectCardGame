package ianhenderson.codeclan.com.cardgame;

/**
 * Created by ianhenderson on 08/01/2018.
 */

public class Card {

    private SuitType suit;
    private ValueType value;
    private String image;

    public Card(SuitType suit, ValueType value) {
        this.suit = suit;
        this.value = value;
        this.image = null;
    }


    public SuitType SuitType() {
        return this.suit;
    }

    public ValueType getValue() {
        return this.value;
    }

    public String getImage(){
        return this.image;
    }



    public void setImage(ImageType imageEnum){
        this.image = imageEnum.getImageURL();
    }

    public int getRealValue() {
        return this.value.getValue();
    }

    public String prettyName(){
        return value.toString() + " of " + suit.toString();
    }
}
