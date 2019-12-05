package com.example.cs125finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EndActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        Button restartButton = findViewById(R.id.restartBtn);
        restartButton.setOnClickListener(view -> openMainActivity());
    }
    private void openMainActivity() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
