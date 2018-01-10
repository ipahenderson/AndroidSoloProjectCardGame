package ianhenderson.codeclan.com.cardgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {


    ImageButton dealButton;
    Game game;
    Deck deck;
    Player player1;
    Player player2;
    TextView player2Name;
    TextView gameResult;
    Player1ImageAdapter player1CardView;
    GridView player1CardGrid;
    Player2ImageAdapter player2CardView;
    GridView player2CardGrid;
    TextView player1Points;
    TextView player2Points;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        player2Name = findViewById(R.id.player2_name);
        gameResult = findViewById(R.id.game_result);
        player1CardGrid = findViewById(R.id.player1_card_panel);
        player2CardGrid = findViewById(R.id.player2_card_panel);
        player1Points = findViewById(R.id.player1_points);
        player2Points = findViewById(R.id.player2_points);
        deck = new Deck();
        player1 = new Player("Dealer");
        player2 = new Player("Matt");
        game = new Game();
        game.addPlayer(player1);
        game.addPlayer(player2);
        game.setUpDeck();
        player1CardView = new Player1ImageAdapter(this, game);
        player1CardGrid.setAdapter(player1CardView);
        player2CardView = new Player2ImageAdapter(this, game);
        player2CardGrid.setAdapter(player2CardView);
        player2Name.setText(player2.getName());


    }


    public void updateScreen() {
        player1CardGrid.setAdapter(player1CardView);
        player2CardGrid.setAdapter(player2CardView);
        player1Points.setText("Points: " + player1.getHandTotal());
        player2Points.setText("Points: " + player2.getHandTotal());


    }

    public void presentWinner(){
        gameResult.setText(game.prettyScore());
    }

    public void onDealButtonClick(View view){
        game.freshDeck();
        player1.getHand().clear();
        player2.getHand().clear();
        game.runGame();
        presentWinner();
        updateScreen();
    }

    public void onHitButtonClick(View view){
        game.playerHit();
        updateScreen();
    }





}
