package com.example.cs125finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Question2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        Button wrongButton1 = findViewById(R.id.wrongBtn1);
        Button wrongButton2 = findViewById(R.id.wrongBtn2);
        Button wrongButton3 = findViewById(R.id.wrongBtn3);
        Button correctButton = findViewById(R.id.correctBtn);
        wrongButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWrongActivity();
            }
        });
        wrongButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWrongActivity();
            }
        });
        wrongButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWrongActivity();
            }
        });
        correctButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openQuestion2Activity();
            }
        });
    }
    private void openWrongActivity() {
        startActivity(new Intent(this, WrongActivity.class));
        finish();
    }
    private void openQuestion2Activity() {
        startActivity(new Intent(this, EmailActivity.class));
        finish();
    }
}