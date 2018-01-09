package ianhenderson.codeclan.com.cardgame;

import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

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
    TextView player1Name;
    TextView player2Name;
    TextView gameResult;
    ImageAdapter player1CardView;
    GridView player1CardGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        player1Name = findViewById(R.id.player1_name);
        player2Name = findViewById(R.id.player2_name);
        player1Card1 = findViewById(R.id.player1_card1);
        player1Card2 = findViewById(R.id.player1_card2);
        player2Card1 = findViewById(R.id.player2_card1);
        player2Card2 = findViewById(R.id.player2_card2);
        gameResult = findViewById(R.id.game_result);
        player1CardGrid = findViewById(R.id.player1_card_panel);
        deck = new Deck();
        player1 = new Player("Jardine");
        player2 = new Player("Matt");
        game = new Game();
        game.addPlayer(player1);
        game.addPlayer(player2);
        player1CardView = new ImageAdapter(this, game);
        player1CardGrid.setAdapter(player1CardView);
    }


    public void updateScreen() {
        player1Name.setText(player1.getName());
        player2Name.setText(player2.getName());
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
//        player1CardGrid.setAdapter(player1CardView);

    }

    public void onDealButtonClick(View view){
        player1.getHand().clear();
        player2.getHand().clear();
        game.runGame(deck);
        gameResult.setText(game.prettyScore());
        updateScreen();
    }


}
