package com.example.basketballcourtcounter;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int ScoreTeamA = 0;
    int ScoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater ().inflate (R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId ();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected (item);
    }


    public void reset_scores() {

    }

    /**
     * reset score button for both team a and b
     */
    public void reset_scores(View view) {
        ScoreTeamA = 0;
        ScoreTeamB = 0;
        displayForTeamA (ScoreTeamA);
        displayForTeamB (ScoreTeamB);

    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        ScoreTeamA = ScoreTeamA + 1;
        displayForTeamA (ScoreTeamA);

    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        ScoreTeamA = ScoreTeamA + 2;
        displayForTeamA (ScoreTeamA);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {
        ScoreTeamA = ScoreTeamA + 3;
        displayForTeamA (ScoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById (R.id.team_a_score);
        scoreView.setText (String.valueOf (score));
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB(View v) {
        ScoreTeamB = ScoreTeamB + 1;
        displayForTeamB (ScoreTeamB);

    }

    /**
     * Increase the score for Team B by 2 points.
     */
    public void addTwoForTeamB(View v) {
        ScoreTeamB = ScoreTeamB + 2;
        displayForTeamB (ScoreTeamB);
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    public void addThreeForTeamB(View v) {
        ScoreTeamB = ScoreTeamB + 3;
        displayForTeamB (ScoreTeamB);
    }


    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById (R.id.team_b_score);
        scoreView.setText (String.valueOf (score));
    }


}





