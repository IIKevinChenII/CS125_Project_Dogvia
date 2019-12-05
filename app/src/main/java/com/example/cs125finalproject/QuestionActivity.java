package com.example.cs125finalproject;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class QuestionActivity extends AppCompatActivity {

    private int count = 0;
    ArrayList<String[]> qsBank = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        Button ansButton1 = findViewById(R.id.answerBtn1);
        Button ansButton2 = findViewById(R.id.answerBtn2);
        Button ansButton3 = findViewById(R.id.answerBtn4);
        Button ansButton4 = findViewById(R.id.answerBtn3);
        ansButton1.setOnClickListener(view -> clickedAnswer(1));
        ansButton2.setOnClickListener(view -> clickedAnswer(2));
        ansButton3.setOnClickListener(view -> clickedAnswer(3));
        ansButton4.setOnClickListener(view -> clickedAnswer(4));

        qsBank.add(new String[] {"Question 1", "trivia question", "answer1", "answer2", "answer3", "answer4", "1"});
        qsBank.add(new String[] {"Question 2", "trivia question", "answer1", "answer2", "answer3", "answer4", "1"});
        qsBank.add(new String[] {"Question 3", "trivia question", "answer1", "answer2", "answer3", "answer4", "1"});
        qsBank.add(new String[] {"Question 4", "trivia question", "answer1", "answer2", "answer3", "answer4", "1"});
        qsBank.add(new String[] {"Question 5", "trivia question", "answer1", "answer2", "answer3", "answer4", "1"});
        qsBank.add(new String[] {"Question 6", "trivia question", "answer1", "answer2", "answer3", "answer4", "1"});
        qsBank.add(new String[] {"Question 7", "trivia question", "answer1", "answer2", "answer3", "answer4", "1"});

        refreshUI();
    }
    private void clickedAnswer(int index) {
        if (index == Integer.parseInt(qsBank.get(count)[6])) {
            count++;
            if (count >= 7) {
                startActivity(new Intent(this, EmailActivity.class));
                finish();
                return;
            }
            refreshUI();
        } else {
            startActivity(new Intent(this, WrongActivity.class));
        }
    }
    private void refreshUI() {
        TextView titleTextView = findViewById(R.id.titleText);
        TextView questionTextView = findViewById(R.id.questionText);
        Button ansButton1 = findViewById(R.id.answerBtn1);
        Button ansButton2 = findViewById(R.id.answerBtn2);
        Button ansButton3 = findViewById(R.id.answerBtn4);
        Button ansButton4 = findViewById(R.id.answerBtn3);
        titleTextView.setText(qsBank.get(count)[0]);
        questionTextView.setText(qsBank.get(count)[1]);
        ansButton1.setText(qsBank.get(count)[2]);
        ansButton2.setText(qsBank.get(count)[3]);
        ansButton3.setText(qsBank.get(count)[4]);
        ansButton4.setText(qsBank.get(count)[5]);
    }
}