package com.example.android.scorekeeper;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class MatchControlActivity extends Activity {

    String team1 = " BRA";
    String team2 = " USA";

    int totalSingleShotsTeam1;
    int totalDoubleShotsTeam1;
    int totalTripleShotsTeam1;
    int totalPointsTeam1;
    int totalFaultsTeam1;

    int totalSingleShotsTeam2;
    int totalDoubleShotsTeam2;
    int totalTripleShotsTeam2;
    int totalPointsTeam2;
    int totalFaultsTeam2;

    ImageView trophy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_control);

        // used to hide or show imageViewtrophy
        trophy = findViewById(R.id.imageViewtrophy);

    }// close onCreate


    // ##### TEAM 2 SECTION #####

    // SINGLE SHOTS TEAM 1
    public void increment1Team1(View view){
        display1(++totalPointsTeam1);
        displayTotalSingleShotTeam1(++totalSingleShotsTeam1);
        Toast.makeText(this, getString(R.string.added_1_point) + team1, Toast.LENGTH_SHORT).show();
    }
    public void decrement1Team1(View view){
        if (totalPointsTeam1 <= 0){
            Toast.makeText(this, R.string.warning_less_than_zero_points, Toast.LENGTH_SHORT).show();
        }else {
            display1(--totalPointsTeam1);
            displayTotalSingleShotTeam1(--totalSingleShotsTeam1);
            Toast.makeText(this, getString(R.string.subtracted_1_point) + team1, Toast.LENGTH_SHORT).show();
        }
    }

    // DOUBLE SHOTS TEAM 1
    public void increment2Team1(View view){
        display1(totalPointsTeam1 = totalPointsTeam1 + 2);
        displayTotalDoubleShotTeam1(++totalDoubleShotsTeam1);
        Toast.makeText(this, getString(R.string.added_2_points) + team1, Toast.LENGTH_SHORT).show();
    }
    public void decrement2Team1(View view){
        if (totalPointsTeam1 <= -1){
            Toast.makeText(this, R.string.warning_less_than_zero_points, Toast.LENGTH_SHORT).show();
        }else {
            display1(totalPointsTeam1 = totalPointsTeam1 - 2);
            displayTotalDoubleShotTeam1(--totalDoubleShotsTeam1);
            Toast.makeText(this, getString(R.string.subtracted_2_points) + team1, Toast.LENGTH_SHORT).show();
        }
    }

    // TRIPLE SHOTS TEAM 1
    public void increment3Team1(View view){
        display1(totalPointsTeam1 = totalPointsTeam1 + 3);
        displayTotalTripleShotTeam1(++totalTripleShotsTeam1);
        Toast.makeText(this, getString(R.string.added_3_points) + team1, Toast.LENGTH_SHORT).show();
    }
    public void decrement3Team1(View view){
        if (totalPointsTeam1 <= -1){
            Toast.makeText(this, R.string.warning_less_than_zero_points, Toast.LENGTH_SHORT).show();
        }else {
            display1(totalPointsTeam1 = totalPointsTeam1 - 3);
            displayTotalTripleShotTeam1(--totalTripleShotsTeam1);
            Toast.makeText(this, getString(R.string.subtracted_3_points) + team1, Toast.LENGTH_SHORT).show();
        }
    }

    // FAULTS TEAM 1
    public void incrementFaultTeam1(View view){
        displayFaults1(++totalFaultsTeam1);
        Toast.makeText(this, getString(R.string.added_1_fault) + team1, Toast.LENGTH_SHORT).show();
    }
    public void decrementFaultTeam1(View view){
        if (totalFaultsTeam1 <= 0){
            Toast.makeText(this, R.string.warning_less_than_zero_faults, Toast.LENGTH_SHORT).show();
        }else {
            displayFaults1(--totalFaultsTeam1);
            Toast.makeText(this, getString(R.string.subtracted_1_fault) + team1, Toast.LENGTH_SHORT).show();
        }
    }

    // ##### when called, this method can be used to manipulate data on TextView id "totalPointsTeam1"
    private void display1(int number){
        TextView quantityTextView = findViewById(R.id.totalPointsTeam1);
        quantityTextView.setText("" + number);
    }

    // ##### when called, this method can be used to manipulate data on TextView id "totalFaultsTeam1"
    private void displayFaults1(int number){
        TextView quantityTextView = findViewById(R.id.totalFaultsTeam1);
        quantityTextView.setText("" + number);
    }
    // ##### when called, this method can be used to manipulate data on TextView id "totalSingleShotsTeam1"
    private void displayTotalSingleShotTeam1(int number){
        TextView quantityTextView = findViewById(R.id.totalSingleShotsTeam1);
        quantityTextView.setText("" + number);
    }
    // ##### when called, this method can be used to manipulate data on TextView id "totalDoubleShotsTeam1"
    private void displayTotalDoubleShotTeam1(int number){
        TextView quantityTextView = findViewById(R.id.totalDoubleShotsTeam1);
        quantityTextView.setText("" + number);
    }
    // ##### when called, this method can be used to manipulate data on TextView id "totalTripleShotsTeam1"
    private void displayTotalTripleShotTeam1(int number){
        TextView quantityTextView = findViewById(R.id.totalTripleShotsTeam1);
        quantityTextView.setText("" + number);
    }


// ##### TEAM 2 SECTION #####

    // SINGLE SHOTS TEAM 2
    public void increment1Team2(View view){
        display2(++totalPointsTeam2);
        displayTotalSingleShotTeam2(++totalSingleShotsTeam2);
        Toast.makeText(this, getString(R.string.added_1_point) + team2, Toast.LENGTH_SHORT).show();
    }
    public void decrement1Team2(View view){
        if (totalPointsTeam2 <= 0){
            Toast.makeText(this,R.string.warning_less_than_zero_points, Toast.LENGTH_SHORT).show();
        }else {
            display2(--totalPointsTeam2);
            displayTotalSingleShotTeam2(--totalSingleShotsTeam2);
            Toast.makeText(this, getString(R.string.subtracted_1_point) + team2, Toast.LENGTH_SHORT).show();
        }
    }

    // DOUBLE SHOTS TEAM 2
    public void increment2Team2(View view){
        display2(totalPointsTeam2 = totalPointsTeam2 + 2);
        displayTotalDoubleShotTeam2(++totalDoubleShotsTeam2);
        Toast.makeText(this, getString(R.string.added_2_points) + team2, Toast.LENGTH_SHORT).show();
    }
    public void decrement2Team2(View view){
        if (totalPointsTeam2 <= -1){
            Toast.makeText(this, R.string.warning_less_than_zero_points, Toast.LENGTH_SHORT).show();
        }else {
            display2(totalPointsTeam2 = totalPointsTeam2 - 2);
            displayTotalDoubleShotTeam2(--totalDoubleShotsTeam2);
            Toast.makeText(this, getString(R.string.subtracted_2_points) + team2, Toast.LENGTH_SHORT).show();
        }
    }

    // TRIPLE SHOTS TEAM 2
    public void increment3Team2(View view){
        display2(totalPointsTeam2 = totalPointsTeam2 + 3);
        displayTotalTripleShotTeam2(++totalTripleShotsTeam2);
        Toast.makeText(this, getString(R.string.added_3_points) + team2, Toast.LENGTH_SHORT).show();
    }
    public void decrement3Team2(View view){
        if (totalPointsTeam2 <= -1){
            Toast.makeText(this, R.string.warning_less_than_zero_points, Toast.LENGTH_SHORT).show();
        }else {
            display2(totalPointsTeam2 = totalPointsTeam2 - 3);
            displayTotalTripleShotTeam2(--totalTripleShotsTeam2);
            Toast.makeText(this, getString(R.string.subtracted_3_points) + team2, Toast.LENGTH_SHORT).show();
        }
    }

    // FAULTS TEAM 2
    public void incrementFaultTeam2(View view){
        displayFaults2(++totalFaultsTeam2);
        Toast.makeText(this, getString(R.string.added_1_fault) + team2, Toast.LENGTH_SHORT).show();
    }
    public void decrementFaultTeam2(View view){
        if (totalFaultsTeam2 <= 0){
            Toast.makeText(this, R.string.warning_less_than_zero_faults, Toast.LENGTH_SHORT).show();
        }else {
            displayFaults2(--totalFaultsTeam2);
            Toast.makeText(this, getString(R.string.subtracted_1_fault) + team2, Toast.LENGTH_SHORT).show();
        }
    }

    // when called, this method can be used to manipulate data on TextView id "totalPointsTeam2"
    private void display2(int number){
        TextView quantityTextView = findViewById(R.id.totalPointsTeam2);
        quantityTextView.setText("" + number);
    }
    // when called, this method can be used to manipulate data on TextView id "totalFaultsTeam2"
    private void displayFaults2(int number){
        TextView quantityTextView = findViewById(R.id.totalFaultsTeam2);
        quantityTextView.setText("" + number);
    }
    // when called, this method can be used to manipulate data on TextView id "totalSingleShotsTeam2"
    private void displayTotalSingleShotTeam2(int number){
        TextView quantityTextView = findViewById(R.id.totalSingleShotsTeam2);
        quantityTextView.setText("" + number);
    }
    // when called, this method can be used to manipulate data on TextView id "totalDoubleShotsTeam2"
    private void displayTotalDoubleShotTeam2(int number){
        TextView quantityTextView = findViewById(R.id.totalDoubleShotsTeam2);
        quantityTextView.setText("" + number);
    }
    // when called, this method can be used to manipulate data on TextView id "totalTripleShotsTeam2"
    private void displayTotalTripleShotTeam2(int number){
        TextView quantityTextView = findViewById(R.id.totalTripleShotsTeam2);
        quantityTextView.setText("" + number);
    }

    // setWinner method
    public void setWinnerTextView(View view){

            if (totalPointsTeam1 > totalPointsTeam2){
                // setText Winner Team 1
                trophy.setVisibility(View.VISIBLE);
                displayWinner(team1);
            }else if (totalPointsTeam1 < totalPointsTeam2){
                // setText Winner Team 2
                trophy.setVisibility(View.VISIBLE);
                displayWinner(team2);
            }else{
                // setText Message Draw
                displayWinner(getString(R.string.warning_draw));
                trophy.setVisibility(View.INVISIBLE);
            }
    }
    // When called this method manipulates TExteView id "textViewWinner"
    private void displayWinner(String message){
        TextView winnerTextView = findViewById(R.id.textViewWinner);
        winnerTextView.setText(message);
    }

    // erase all data store in used variables
    public void eraseAllData(View v){

        totalSingleShotsTeam1 = 0;
        displayTotalSingleShotTeam1(totalSingleShotsTeam1);

        totalDoubleShotsTeam1 = 0;
        displayTotalDoubleShotTeam1(totalDoubleShotsTeam1);

        totalTripleShotsTeam1 = 0;
        displayTotalTripleShotTeam1(totalTripleShotsTeam1);

        totalFaultsTeam1 = 0;
        displayFaults1(totalFaultsTeam1);

        totalPointsTeam1 = 0;
        display1(totalPointsTeam1);

        totalSingleShotsTeam2 = 0;
        displayTotalSingleShotTeam2(totalSingleShotsTeam2);

        totalDoubleShotsTeam2 = 0;
        displayTotalDoubleShotTeam2(totalDoubleShotsTeam2);

        totalTripleShotsTeam2 = 0;
        displayTotalTripleShotTeam2(totalTripleShotsTeam2);

        totalFaultsTeam2 = 0;
        displayFaults2(totalFaultsTeam2);

        totalPointsTeam2 = 0;
        display2(totalPointsTeam2);

        // erase winner name store in variables team1 or team2
        team1 = "";
        displayWinner(team1);
        team2 = "";
        displayWinner(team2);

        // hide trophy image
        trophy.setVisibility(View.INVISIBLE);

    }// close method eraseAllData

}// close MatchControlActivity
