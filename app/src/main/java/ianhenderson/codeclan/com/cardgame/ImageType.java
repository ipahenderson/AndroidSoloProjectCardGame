package ianhenderson.codeclan.com.cardgame;

/**
 * Created by ianhenderson on 08/01/2018.
 */

public enum ImageType {
    ACEofHEARTS("@drawable/ace_of_hearts"),
    TWOofHEARTS("@drawable/two_of_hearts"),
    THREEofHEARTS("@drawable/three_of_hearts"),
    FOURofHEARTS("@drawable/four_of_hearts"),
    FIVEofHEARTS("@drawable/five_of_hearts"),
    SIXofHEARTS("@drawable/six_of_hearts"),
    SEVENofHEARTS("@drawable/seven_of_hearts"),
    EIGHTofHEARTS("@drawable/eight_of_hearts"),
    NINEofHEARTS("@drawable/nine_of_hearts"),
    TENofHEARTS("@drawable/ten_of_hearts"),
    JACKofHEARTS("@drawable/jack_of_hearts"),
    QUEENofHEARTS("@drawable/queen_of_hearts"),
    KINGofHEARTS("@drawable/king_of_hearts"),
    ACEofDIAMONDS("@drawable/ace_of_diamonds"),
    TWOofDIAMONDS("@drawable/two_of_diamonds"),
    THREEofDIAMONDS("@drawable/three_of_diamonds"),
    FOURofDIAMONDS("@drawable/four_of_diamonds"),
    FIVEofDIAMONDS("@drawable/five_of_diamonds"),
    SIXofDIAMONDS("@drawable/six_of_diamonds"),
    SEVENofDIAMONDS("@drawable/seven_of_diamonds"),
    EIGHTofDIAMONDS("@drawable/eight_of_diamonds"),
    NINEofDIAMONDS("@drawable/nine_of_diamonds"),
    TENofDIAMONDS("@drawable/ten_of_diamonds"),
    JACKofDIAMONDS("@drawable/jack_of_diamonds"),
    QUEENofDIAMONDS("@drawable/queen_of_diamonds"),
    KINGofDIAMONDS("@drawable/king_of_diamonds"),
    ACEofSPADES("@drawable/ace_of_spades"),
    TWOofSPADES("@drawable/two_of_spades"),
    THREEofSPADES("@drawable/three_of_spades"),
    FOURofSPADES("@drawable/four_of_spades"),
    FIVEofSPADES("@drawable/five_of_spades"),
    SIXofSPADES("@drawable/six_of_spades"),
    SEVENofSPADES("@drawable/seven_of_spades"),
    EIGHTofSPADES("@drawable/eight_of_spades"),
    NINEofSPADES("@drawable/nine_of_spades"),
    TENofSPADES("@drawable/ten_of_spades"),
    JACKofSPADES("@drawable/jack_of_spades"),
    QUEENofSPADES("@drawable/queen_of_spades"),
    KINGofSPADES("@drawable/king_of_spades"),
    ACEofCLUBS("@drawable/ace_of_clubs"),
    TWOofCLUBS("@drawable/two_of_clubs"),
    THREEofCLUBS("@drawable/three_of_clubs"),
    FOURofCLUBS("@drawable/four_of_clubs"),
    FIVEofCLUBS("@drawable/five_of_clubs"),
    SIXofCLUBS("@drawable/six_of_clubs"),
    SEVENofCLUBS("@drawable/seven_of_clubs"),
    EIGHTofCLUBS("@drawable/eight_of_clubs"),
    NINEofCLUBS("@drawable/nine_of_clubs"),
    TENofCLUBS("@drawable/ten_of_clubs"),
    JACKofCLUBS("@drawable/jack_of_clubs"),
    QUEENofCLUBS("@drawable/queen_of_clubs"),
    KINGofCLUBS("@drawable/king_of_clubs")
    ;

    private final String imageURL;

    private ImageType(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getImageURL() {
        return imageURL;
    }
}
