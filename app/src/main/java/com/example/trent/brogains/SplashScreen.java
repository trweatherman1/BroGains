package com.example.trent.brogains;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.ProgressBar;

public class SplashScreen extends Activity {

    ProgressBar progressBar; //ProgressBar that displays on the screen
    android.os.Handler handler; //The handler for the activity
    static final int DELAY = 5000; //Determine how long to pause on splash
    Class nextActivity = ViewMuscleGroups.class;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        progressBar = (ProgressBar)this.findViewById(R.id.progressBar);
}

    public void onStart(){
        super.onStart();
        handler = new android.os.Handler();
        handler.postDelayed(r, DELAY);
    }

    Runnable r = new Runnable() {
        public void run() {
            goToNextScreen();
        }
    };

    public void goToNextScreen(){
        Intent nextScreen = new Intent(this, nextActivity);
        this.startActivity(nextScreen);
        this.finish();
    }
}
