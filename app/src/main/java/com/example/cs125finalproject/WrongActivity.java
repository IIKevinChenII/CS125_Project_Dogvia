package com.example.cs125finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class WrongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrong);
        Button restartButton = findViewById(R.id.restartBtn);
        restartButton.setOnClickListener(view -> finish());
    }
}
