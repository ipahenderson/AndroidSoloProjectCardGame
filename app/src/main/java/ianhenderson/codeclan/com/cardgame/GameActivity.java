package ianhenderson.codeclan.com.cardgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

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
    Player1ImageAdapter player1CardView;
    GridView player1CardGrid;
    Player2ImageAdapter player2CardView;
    GridView player2CardGrid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        player1Name = findViewById(R.id.player1_name);
        player2Name = findViewById(R.id.player2_name);
        gameResult = findViewById(R.id.game_result);
        player1CardGrid = findViewById(R.id.player1_card_panel);
        player2CardGrid = findViewById(R.id.player2_card_panel);
        deck = new Deck();
        player1 = new Player("Jardine");
        player2 = new Player("Matt");
        game = new Game();
        game.addPlayer(player1);
        game.addPlayer(player2);
        player1CardView = new Player1ImageAdapter(this, game);
        player1CardGrid.setAdapter(player1CardView);
        player2CardView = new Player2ImageAdapter(this, game);
        player2CardGrid.setAdapter(player2CardView);
    }


    public void updateScreen() {
        player1Name.setText(player1.getName());
        player2Name.setText(player2.getName());
        player1CardGrid.setAdapter(player1CardView);
        player2CardGrid.setAdapter(player2CardView);

    }

    public void onDealButtonClick(View view){
        player1.getHand().clear();
        player2.getHand().clear();
        game.runGame(deck);
        gameResult.setText(game.prettyScore());
        updateScreen();
    }


}
