package com.example.android.snooker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA=0;
    int scoreB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void redA(View view){
        scoreA+=1;
        displayA(scoreA);
    }

    public void blackA(View view){
        scoreA+=7;
        displayA(scoreA);
    }

    public void yellowA(View view){
        scoreA+=2;
        displayA(scoreA);
    }

    public void greenA(View view){
        scoreA+=3;
        displayA(scoreA);
    }

    public void brownA(View view){
        scoreA+=4;
        displayA(scoreA);
    }

    public void blueA(View view){
        scoreA+=5;
        displayA(scoreA);
    }

    public void pinkA(View view){
        scoreA+=6;
        displayA(scoreA);
    }

    public void foulA(View view){
        scoreB+=4;
        displayB(scoreB);
    }

    public void redB(View view){
        scoreB+=1;
        displayB(scoreB);
    }

    public void blackB(View view){
        scoreB+=7;
        displayB(scoreB);
    }

    public void pinkB(View view){
        scoreB+=6;
        displayB(scoreB);
    }

    public void blueB(View view){
        scoreB+=5;
        displayB(scoreB);
    }

    public void brownB(View view){
        scoreB+=4;
        displayB(scoreB);
    }

    public void greenB(View view){
        scoreB+=3;
        displayB(scoreB);
    }

    public void yellowB(View view){
        scoreB+=2;
        displayB(scoreB);
    }

    public void foulB(View view){
        scoreA+=4;
        displayA(scoreA);
    }

    public void reset(View view){
        scoreA=0;
        scoreB=0;
        displayA(scoreA);
        displayB(scoreB);
    }

    public void displayA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.P_A_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.P_B_score);
        scoreView.setText(String.valueOf(score));
    }
}
