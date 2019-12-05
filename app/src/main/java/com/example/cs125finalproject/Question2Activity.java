package com.example.cs125finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Question2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        Button wrongButton1 = findViewById(R.id.answerBtn1);
        Button wrongButton2 = findViewById(R.id.answerBtn2);
        Button wrongButton3 = findViewById(R.id.answerBtn4);
        Button correctButton = findViewById(R.id.answerBtn3);
        wrongButton1.setOnClickListener(view -> openWrongActivity());
        wrongButton2.setOnClickListener(view -> openWrongActivity());
        wrongButton3.setOnClickListener(view -> openWrongActivity());
        correctButton.setOnClickListener(view -> openNextQuestionActivity());
    }
    private void openWrongActivity() {
        startActivity(new Intent(this, WrongActivity.class));
    }
    private void openNextQuestionActivity() {
        startActivity(new Intent(this, EmailActivity.class));
        finish();
    }
}