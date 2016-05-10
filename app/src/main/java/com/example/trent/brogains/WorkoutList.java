package com.example.trent.brogains;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;

public class WorkoutList extends Activity {
    
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            requestWindowFeature(Window.FEATURE_NO_TITLE);
            setContentView(R.layout.activity_workout_list);

            Bundle extraIntents = getIntent().getExtras();


            String chest = extraIntents.getString(AppConstraints.CHEST);
            if (chest != null) {
                setContentView(R.layout.activity_chest);
            }
            String back = extraIntents.getString(AppConstraints.BACK);
            if (back != null) {
                setContentView(R.layout.activity_back);
            }
            String legs = extraIntents.getString(AppConstraints.LEGS);
            if (legs != null) {
                setContentView(R.layout.activity_legs);
            }
            String biceps = extraIntents.getString(AppConstraints.BICEPS);
            if (biceps != null) {
                setContentView(R.layout.activity_biceps);
            }
            String triceps = extraIntents.getString(AppConstraints.TRICEPS);
            if (triceps != null) {
                setContentView(R.layout.activity_triceps);
            }
            String shoulders = extraIntents.getString(AppConstraints.SHOULDERS);
            if (shoulders != null) {
                setContentView(R.layout.activity_shoulders);
            }
            String abs = extraIntents.getString(AppConstraints.ABS);
            if (abs != null) {
                setContentView(R.layout.activity_abs);
            }
        }
    }
