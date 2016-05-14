package com.example.android.smartgoals;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Creates specificMessage string to change back and forth.
     */
    String specificMessage = "SPECIFIC";

    /**
     * Displays the given information for Specific.
     */
    public void displaySpecific(String message) {
        TextView scoreView = (TextView) findViewById(R.id.specific);
        scoreView.setText(String.valueOf(message));
    }

    /**
     * Changes SPECIFIC text based on click in app.
     */
    public void specific(View v) {
        if (specificMessage == "SPECIFIC") {
            specificMessage = "What: What do I want to accomplish?\n\n"+
                    "Why: Specific reasons, purpose or benefits of accomplishing the goal.\n\n"+
                    "Who: Who is involved?\n\n"+
                    "Where: Identify a location.\n\n"+
                    "Which: Identify requirements and constraints.";
        } else {
            specificMessage = "SPECIFIC";
        }
        displaySpecific(specificMessage);
    }

    /**
     * Creates measurableMessage string to change back and forth.
     */
    String measurableMessage = "MEASURABLE";

    /**
     * Displays the given information for Measurable.
     */
    public void displayMeasurable(String message) {
        TextView scoreView = (TextView) findViewById(R.id.measurable);
        scoreView.setText(String.valueOf(message));
    }

    /**
     * Changes MEASURABLE text based on click in app.
     */
    public void measurable(View v) {
        if (measurableMessage == "MEASURABLE") {
            measurableMessage = "How much?\n\n" +
                    "How many?\n\n" +
                    "How will I know when it is accomplished?";
        } else {
            measurableMessage = "MEASURABLE";
        }
        displayMeasurable(measurableMessage);
    }

    /**
     * Creates achievableMessage string to change back and forth.
     */
    String achievableMessage = "ACHIEVABLE";

    /**
     * Displays the given information for Specific.
     */
    public void displayAchievable(String message) {
        TextView scoreView = (TextView) findViewById(R.id.achievable);
        scoreView.setText(String.valueOf(message));
    }

    /**
     * Changes ACHIEVABLE text based on click in app.
     */
    public void achievable(View v) {
        if (achievableMessage == "ACHIEVABLE") {
            achievableMessage = "How can the goal be accomplished?\n\n" +
                    "How realistic is the goal based on other constraints?";
        } else {
            achievableMessage = "ACHIEVABLE";
        }
        displayAchievable(achievableMessage);
    }

    /**
     * Creates relevantMessage string to change back and forth.
     */
    String relevantMessage = "RELEVANT";

    /**
     * Displays the given information for Relevant.
     */
    public void displayRelevant(String message) {
        TextView scoreView = (TextView) findViewById(R.id.relevant);
        scoreView.setText(String.valueOf(message));
    }

    /**
     * Changes RELEVANT text based on click in app.
     */
    public void relevant(View v) {
        if (relevantMessage == "RELEVANT") {
            relevantMessage = "Does this seem worthwhile?\n\n" +
                    "Is this the right time?\n\n" +
                    "Does this match our other efforts/needs?\n\n" +
                    "Are you the right person?\n\n" +
                    "Is it applicable in the current socio-economic environment?";
        } else {
            relevantMessage = "RELEVANT";
        }
        displayRelevant(relevantMessage);
    }

    /**
     * Creates timeBoundMessage string to change back and forth.
     */
    String timeBoundMessage = "TIME-BOUND";

    /**
     * Displays the given information for Time-Bound.
     */
    public void displayTimeBound(String message) {
        TextView scoreView = (TextView) findViewById(R.id.timeBound);
        scoreView.setText(String.valueOf(message));
    }

    /**
     * Changes TIME-BOUND text based on click in app.
     */
    public void timeBound(View v) {
        if (timeBoundMessage == "TIME-BOUND") {
            timeBoundMessage = "When?\n\n" +
                    "What can I do six months from now?\n\n" +
                    "What can I do six weeks from now?\n\n" +
                    "What can I do today?";
        } else {
            timeBoundMessage = "TIME-BOUND";
        }
        displayTimeBound(timeBoundMessage);
    }



}
