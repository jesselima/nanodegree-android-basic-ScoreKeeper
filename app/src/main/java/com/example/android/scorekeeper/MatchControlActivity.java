package com.example.android.scorekeeper;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MatchControlActivity extends Activity {


    String team1 = "BRA";
    String team2 = "USA";

    int totalPointsTeam1;
    int totalFaultsTeam1;

    int totalPointsTeam2;
    int totalFaultsTeam2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_control);
    }// close onCreate



    // SINGLE SHOTS TEAM 1
    public void increment1Team1(View view){
        display1(++totalPointsTeam1);
    }
    public void decrement1Team1(View view){
        if (totalPointsTeam1 <= 0){
            Toast.makeText(this, "You can not set less than 0 points.", Toast.LENGTH_SHORT).show();
        }else {
            display1(--totalPointsTeam1);
        }
    }

    // DOUBLE SHOTS TEAM 1
    public void increment2Team1(View view){
        display1(totalPointsTeam1 = totalPointsTeam1 + 2);
    }
    public void decrement2Team1(View view){
        if (totalPointsTeam1 <= -1){
            Toast.makeText(this, "You can not set less than 0 points.", Toast.LENGTH_SHORT).show();
        }else {
            display1(totalPointsTeam1 = totalPointsTeam1 - 2);
        }
    }

    // TRIPLE SHOTS TEAM 1
    public void increment3Team1(View view){
        display1(totalPointsTeam1 = totalPointsTeam1 + 3);
    }
    public void decrement3Team1(View view){
        if (totalPointsTeam1 <= -1){
            Toast.makeText(this, "You can not set less than 0 points.", Toast.LENGTH_SHORT).show();
        }else {
            display1(totalPointsTeam1 = totalPointsTeam1 - 3);
        }
    }

    // FAULTS TEAM 1
    public void incrementFaultTeam1(View view){
        displayFaults1(++totalFaultsTeam1);
    }
    public void decrementFaultTeam1(View view){
        if (totalFaultsTeam1 <= 0){
            Toast.makeText(this, "You can not set less than 0 faults.", Toast.LENGTH_SHORT).show();
        }else {
            displayFaults1(--totalFaultsTeam1);
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











    // SINGLE SHOTS TEAM 2
    public void increment1Team2(View view){
        display2(++totalPointsTeam2);
    }

    public void decrement1Team2(View view){
        if (totalPointsTeam2 <= 0){
            Toast.makeText(this, "You can not set less than 0 points.", Toast.LENGTH_SHORT).show();
        }else {
            display2(--totalPointsTeam2);
        }

    }


    // DOUBLE SHOTS TEAM 2
    public void increment2Team2(View view){
        display2(totalPointsTeam2 = totalPointsTeam2 + 2);
    }
    public void decrement2Team2(View view){
        if (totalPointsTeam2 <= -1){
            Toast.makeText(this, "You can not set less than 0 points.", Toast.LENGTH_SHORT).show();
        }else {
            display1(totalPointsTeam2 = totalPointsTeam2 - 2);
        }
    }

    // TRIPLE SHOTS TEAM 2
    public void increment3Team2(View view){
        display2(totalPointsTeam2 = totalPointsTeam2 + 3);
    }
    public void decrement3Team2(View view){
        if (totalPointsTeam2 <= -1){
            Toast.makeText(this, "You can not set less than 0 points.", Toast.LENGTH_SHORT).show();
        }else {
            display1(totalPointsTeam2 = totalPointsTeam2 - 3);
        }
    }

    // FAULTS TEAM 2
    public void incrementFaultTeam2(View view){
        displayFaults2(++totalFaultsTeam2);
    }
    public void decrementFaultTeam2(View view){
        if (totalFaultsTeam2 <= 0){
            Toast.makeText(this, "You can not set less than 0 faults.", Toast.LENGTH_SHORT).show();
        }else {
            displayFaults2(--totalFaultsTeam2);
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





    // setWinner method
    public void setWinnerTextView(View view){
        if (totalPointsTeam1 < totalPointsTeam2){
            // setText Winner Team 2
        }else if (totalPointsTeam1 > totalPointsTeam1){
            // setText Winner Team 1
        }else{
            // setText Message Draw
        }
    }



}// close MatchControlActivity
