package com.example.pass_a_sketch;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PickTeams extends AppCompatActivity {
    private Button startGameButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pick_teams);

        startGameButton = (Button) findViewById(R.id.goToGame);
        startGameButton.setOnClickListener(v -> openGame());
    }

    public void openGame() {
        Intent intent = new Intent(this, FirstDraw.class);
        startActivity(intent);
    }
}
