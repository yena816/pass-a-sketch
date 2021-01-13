package com.example.pass_a_sketch;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class JoinRoom extends AppCompatActivity {
    private Button joinGameButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.join_room);

        joinGameButton = (Button) findViewById(R.id.goToCreateRoom2);
        joinGameButton.setOnClickListener(v -> openCreateRoom2());
    }

    public void openCreateRoom2() {
        Intent intent = new Intent(this, CreateRoom.class);
        startActivity(intent);
    }
}
