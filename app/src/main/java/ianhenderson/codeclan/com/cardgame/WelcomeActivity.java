package ianhenderson.codeclan.com.cardgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;

public class WelcomeActivity extends AppCompatActivity {

    EditText playerName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        playerName = findViewById(R.id.playerNameInput);
        playerName.setRawInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_FLAG_CAP_SENTENCES);

    }

    public void onPlayButtonClick(View view){
        Intent intent = new Intent(this, GameActivity.class);
        String name = playerName.getText().toString();
        intent.putExtra("name", name);
        startActivity(intent);

    }
}
