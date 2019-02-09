package com.ritesh.androidlifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    String msg = "Andy Life : ";

    /*The onCreate() and onDestroy() methods are called only once throughout the activity lifecycle.*/

    /**
     * Called when the activity is first created.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(msg, "onCreate() event");
    }

    /**
     * Called when the activity is about to become visible.
     */
    @Override
    protected void onStart() {
        super.onStart();
        Log.e(msg, "onStart() event");
    }

    /**
     * Called when the activity has become visible.
     */
    @Override
    protected void onResume() {
        super.onResume();
        Log.e(msg, "onResume() event");
    }

    /**
     * Called when another activity is taking focus.
     */
    @Override
    protected void onPause() {
        super.onPause();
        Log.e(msg, "onPause() event");
    }

    /**
     * Called when the activity is no longer visible.
     */
    @Override
    protected void onStop() {
        super.onStop();
        Log.e(msg, "onStop() event");
    }

    /**
     * Called when the activity is Restart and has become visible again.
     */
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(msg, "onRestart() event");
    }

    /**
     * Called just before the activity is destroyed.
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(msg, "onDestroy() event");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.e(msg, "onBackPressed() event");
    }
}
