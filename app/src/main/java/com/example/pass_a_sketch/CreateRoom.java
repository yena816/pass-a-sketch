package com.example.pass_a_sketch;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CreateRoom extends AppCompatActivity {
    private Button pickTeamsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_room);

        pickTeamsButton = (Button) findViewById(R.id.goToPickTeams);
        pickTeamsButton.setOnClickListener(v -> openPickTeams());
    }

    public void openPickTeams() {
        Intent intent = new Intent(this, PickTeams.class);
        startActivity(intent);
    }

}
