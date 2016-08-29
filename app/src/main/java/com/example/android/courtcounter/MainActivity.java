package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int resetScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays 1 point for Free Throws.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById( R.id.team_a_score);
        quantityTextView.setText("" + number);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays 1 point for Free Throws.
     */
    public void freeThrowA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayTeamA(scoreTeamA);
    }

    /**
     * Displays for +2 Points.
     */
    public void twoPointsA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayTeamA(scoreTeamA);
    }

    /**
     * Displays for +3 Points.
     */
    public void threePointsA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays 1 point for Free Throws.
     */
    public void freeThrowB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayTeamB(scoreTeamB);
    }

    /**
     * Displays for +2 Points.
     */
    public void twoPointsB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayTeamB(scoreTeamB);
    }

    /**
     * Displays for +3 Points.
     */
    public void threePointsB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayTeamB(scoreTeamB);
    }

    /**
     * Displays 0 for reset button.
     */
    public void resetAll(View view) {
        resetScore = scoreTeamA = 0;
        resetScore = scoreTeamB = 0;
        displayTeamA(resetScore);
        displayTeamB(resetScore);
    }

}
