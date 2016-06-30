package com.pixplicity.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ProgressWheel mProgressBar;
    private boolean wasSpinning = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mProgressBar = (ProgressWheel) findViewById(R.id.progressBar);
    }

    @Override
    public void onResume() {
        super.onResume();
        mProgressBar.startSpinning();
    }
}
