package com.example.cs125finalproject;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuestionActivity extends AppCompatActivity {

    private int count = 0;
    ArrayList<String[]> qsBank = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        Button ansButton1 = findViewById(R.id.answerBtn1);
        Button ansButton2 = findViewById(R.id.answerBtn2);
        Button ansButton3 = findViewById(R.id.answerBtn3);
        Button ansButton4 = findViewById(R.id.answerBtn4);
        ansButton1.setOnClickListener(view -> clickedAnswer(1));
        ansButton2.setOnClickListener(view -> clickedAnswer(2));
        ansButton3.setOnClickListener(view -> clickedAnswer(3));
        ansButton4.setOnClickListener(view -> clickedAnswer(4));

        qsBank.add(new String[] {"Question 1", "How many words can a dog learn?", "less than 100", "100 to 500", "500 to 1000", "more than 1000", "4"});
        qsBank.add(new String[] {"Question 2", "Which is the most popular dog breed in 2018?", "German Shepherd Dog", "Labrador Retriever", "Golden Retriever", "French Bulldog", "2"});
        qsBank.add(new String[] {"Question 3", "Who enacted a dog tax because the dogs were killing his sheep?", "Thomas Jefferson", "John Adams", "George Washington", "Benjamin Franklin", "1"});
        qsBank.add(new String[] {"Question 4", "When do dogs see the best?", "Day time", "Dawn and dusk", "Night time", "Same except night time", "2"});
        qsBank.add(new String[] {"Question 5", "Where do dogs sweat?", "Tongue", "Body", "Paws", "Tail", "3"});
        qsBank.add(new String[] {"Question 6", "According to research, petting a dog can reduce your _____?", "Blood pressure", "Immune tolerance", "Arthritis", "GPA", "1"});
        qsBank.add(new String[] {"Question 7", "Dogs are direct descendants of _____?", "Horses", "Bears", "Foxes", "Wolves", "4"});
        qsBank.add(new String[] {"Question 8", "How many families in the U.S. own a dog?", "1 in 3", "1 in 5", "1 in 4", "1 in 2", "1"});
        qsBank.add(new String[] {"Question 9", "In what country's capital was it illegal to own a dog as a pet?", "France", "Sweden", "Iceland", "Ukraine", "3"});
        qsBank.add(new String[] {"Question 10", "What type of dog does not bark?", "Doberman", "Basenji", "Shiba Inu", "Akita", "2"});

        refreshUI();
    }
    private void clickedAnswer(int index) {
        if (index == Integer.parseInt(qsBank.get(count)[6])) {
            count++;
            if (count >= 10) {
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
        Button ansButton3 = findViewById(R.id.answerBtn3);
        Button ansButton4 = findViewById(R.id.answerBtn4);
        titleTextView.setText(qsBank.get(count)[0]);
        questionTextView.setText(qsBank.get(count)[1]);
        ansButton1.setText(qsBank.get(count)[2]);
        ansButton2.setText(qsBank.get(count)[3]);
        ansButton3.setText(qsBank.get(count)[4]);
        ansButton4.setText(qsBank.get(count)[5]);
    }
}