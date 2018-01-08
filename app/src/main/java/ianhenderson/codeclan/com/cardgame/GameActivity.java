package ianhenderson.codeclan.com.cardgame;

import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.io.File;

public class GameActivity extends AppCompatActivity {

    ImageView player1Card1;
    ImageView player1Card2;
    ImageView player2Card1;
    ImageView player2Card2;
    ImageButton dealButton;
    Game game;
    Deck deck;
    Player player1;
    Player player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        player1Card1 = findViewById(R.id.player1_card1);
        player1Card2 = findViewById(R.id.player1_card2);
        player2Card1 = findViewById(R.id.player2_card1);
        player2Card2 = findViewById(R.id.player2_card2);
        deck = new Deck();
        player1 = new Player("Jardine");
        player2 = new Player("Matt");
        game = new Game();
        game.addPlayer(player1);
        game.addPlayer(player2);
    }


    public void updateScreen(){
        String player1Card1Path = player1.getHand().get(0).getImage();
        String player1Card2Path = player1.getHand().get(1).getImage();
        String player2Card1Path = player2.getHand().get(0).getImage();
        String player2Card2Path = player2.getHand().get(1).getImage();
        int res1 = getResources().getIdentifier(player1Card1Path, "drawable", this.getPackageName());
        int res2 = getResources().getIdentifier(player1Card2Path, "drawable", this.getPackageName());
        int res3 = getResources().getIdentifier(player2Card1Path, "drawable", this.getPackageName());
        int res4 = getResources().getIdentifier(player2Card2Path, "drawable", this.getPackageName());
        player1Card1.setImageResource(res1);
        player1Card2.setImageResource(res2);
        player2Card1.setImageResource(res3);
        player2Card2.setImageResource(res4);
    }

    public void onDealButtonClick(View view){
        game.runGame(deck);
        updateScreen();
    }


}
