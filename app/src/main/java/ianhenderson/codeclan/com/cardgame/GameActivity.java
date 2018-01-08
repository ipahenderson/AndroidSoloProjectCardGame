package ianhenderson.codeclan.com.cardgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Deck deck = new Deck();
        Player player1 = new Player("Jardine");
        Player player2 = new Player("Matt");
        Game game = new Game();
        game.addPlayer(player1);
        game.addPlayer(player2);
        game.runGame(deck);

    }
}
