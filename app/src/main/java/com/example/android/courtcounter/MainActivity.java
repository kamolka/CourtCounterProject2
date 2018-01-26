package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays scores for Person 1.
     */

    public void displayForPerson1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.person_1);
        scoreView.setText(String.valueOf(score));
    }
    int scorePerson1= 0;
    public void addOneToPerson1(View v) {
        displayForPerson1(scorePerson1);
        scorePerson1 = scorePerson1+ 1;
        displayForPerson1(scorePerson1);
    }

    public void addTwoToPerson1(View v) {
        displayForPerson1(scorePerson1);
        scorePerson1 = scorePerson1+ 2;
        displayForPerson1(scorePerson1);
    }

    public void addFiveToPerson1(View v) {
        displayForPerson1(scorePerson1);
        scorePerson1 = scorePerson1+ 5;
        displayForPerson1(scorePerson1);
    }

    /**
     * Displays scores for Person 2.
     */
    public void displayForPerson2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.person_2);
        scoreView.setText(String.valueOf(score));
    }
    int scorePerson2= 0;
    public void addOneToPerson2(View v) {
        displayForPerson2(scorePerson2);
        scorePerson2 = scorePerson2+ 1;
        displayForPerson2(scorePerson2);
    }

    public void addTwoToPerson2(View v) {
        displayForPerson2(scorePerson2);
        scorePerson2 = scorePerson2+ 2;
        displayForPerson2(scorePerson2);
    }

    public void addFiveToPerson2(View v) {
        displayForPerson2(scorePerson2);
        scorePerson2 = scorePerson2+ 5;
        displayForPerson2(scorePerson2);
    }

    public void resetButton(View v) {
        scorePerson1=0;
        scorePerson2 =0;
        displayForPerson1(scorePerson1);
        displayForPerson2(scorePerson2);
    }
}