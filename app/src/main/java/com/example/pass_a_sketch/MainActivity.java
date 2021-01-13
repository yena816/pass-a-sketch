package com.example.pass_a_sketch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button createRoomButton;
    private Button joinRoomButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createRoomButton = (Button) findViewById(R.id.goToCreateRoom);
        createRoomButton.setOnClickListener(v -> openCreateRoom());

        joinRoomButton = (Button) findViewById(R.id.goToJoinRoom);
        joinRoomButton.setOnClickListener(v -> openJoinRoom());
    }

    public void openCreateRoom() {
        Intent intent = new Intent(this, CreateRoom.class);
        startActivity(intent);
    }

    public void openJoinRoom() {
        Intent intent = new Intent(this, JoinRoom.class);
        startActivity(intent);
    }
}