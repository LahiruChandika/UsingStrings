package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.DialogTitle;

import android.os.Bundle;
import android.util.Log;

import javax.security.auth.login.LoginException;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate: invoked");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: this in invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart: this is invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: this is invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: this is invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: this is invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: this is invoked");
    }


}