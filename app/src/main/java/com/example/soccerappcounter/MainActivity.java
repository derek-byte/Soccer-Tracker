package com.example.soccerappcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.soccerappcounter.R;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int numberOfGames = 0;
    int yellowCardsA = 0;
    int redCardsA = 0;
    int yellowCardsB = 0;
    int redCardsB = 0;
    int swapsA= 3;
    int swapsB= 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addOneForTeamA(View v){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }


    public void addOneForTeamB(View v){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void addYCardA(View v){
        yellowCardsA = yellowCardsA +1;
        displayForYellowCardsA(yellowCardsA);
    }

    public void addRCardA(View v){
        redCardsA = redCardsA +1;
        displayForRedCardsA(redCardsA);
    }

    public void addYCardB(View v){
        yellowCardsB = yellowCardsB +1;
        displayForYellowCardsB(yellowCardsB);
    }

    public void addRCardB(View v){
        redCardsB = redCardsB +1;
        displayForRedCardsB(redCardsB);
    }

    public void decreaseSwapsA(View v){
        swapsA = swapsA - 1;
        displayForSwapsA(swapsA);
    }

    public void decreaseSwapsB(View v){
        swapsB = swapsB - 1;
        displayForSwapsB(swapsB);
    }

    public void resetGame(View v){
        scoreTeamA=0;
        scoreTeamB=0;
        yellowCardsA = 0;
        redCardsA = 0;
        yellowCardsB = 0;
        redCardsB = 0;
        swapsA = 3;
        swapsB = 3;
        numberOfGames=numberOfGames+1;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayForYellowCardsA(yellowCardsA);
        displayForRedCardsA(redCardsA);
        displayForYellowCardsB(yellowCardsB);
        displayForRedCardsB(redCardsB);
        displayForAmountOfGames(numberOfGames);
        displayForSwapsA(swapsA);
        displayForSwapsB(swapsB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForAmountOfGames(int score) {
        TextView scoreView = findViewById(R.id.amount_of_games);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForYellowCardsA(int score) {
        TextView scoreView = findViewById(R.id.yellow_cards_a);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForRedCardsA(int score) {
        TextView scoreView = findViewById(R.id.red_cards_a);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForYellowCardsB(int score) {
        TextView scoreView = findViewById(R.id.yellow_cards_b);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForRedCardsB(int score) {
        TextView scoreView = findViewById(R.id.red_cards_b);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForSwapsA(int score) {
        TextView scoreView = findViewById(R.id.swaps_a);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForSwapsB(int score) {
        TextView scoreView = findViewById(R.id.swaps_b);
        scoreView.setText(String.valueOf(score));
    }
}

