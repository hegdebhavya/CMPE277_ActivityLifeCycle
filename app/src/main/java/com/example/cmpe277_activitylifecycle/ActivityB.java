package com.example.cmpe277_activitylifecycle;

import static android.content.ContentValues.TAG;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class ActivityB extends Activity {

    private String mActivityName;
    private TextView mStatusView;
    private TextView mStatusAllView;
    public TextView threadCounterView;

    Intent returnIntent = new Intent();


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        String msg = "Total thread counter in B onCreate is: "+ String.valueOf(MainActivity.threadCounter);
        Log.v(TAG,msg);
    }

    @Override
    protected void onStart() {

        super.onStart();
        String msg = "Total thread counter in B onStart is: "+ String.valueOf(MainActivity.threadCounter);
        Log.v(TAG,msg);
    }

    @Override
    protected void onRestart() {

        super.onRestart();

        MainActivity.threadCounter++;
        String msg = "Total thread counter in B onRestart is: "+ String.valueOf(MainActivity.threadCounter);
        Log.v(TAG,msg);

    }

    @Override
    protected void onResume() {

        super.onResume();
        String msg = "Total thread counter in B onResume is: "+ String.valueOf(MainActivity.threadCounter);
        Log.v(TAG,msg);

    }

    @Override
    protected void onPause() {

        super.onPause();
        String msg = "Total thread counter in B onPause is: "+ String.valueOf(MainActivity.threadCounter);
        Log.v(TAG,msg);
    }

    @Override
    protected void onStop() {

        super.onStop();
        String msg = "Total thread counter in B onStop is: "+ String.valueOf(MainActivity.threadCounter);
        Log.v(TAG,msg);
    }

    @Override
    protected void onDestroy() {
        super.  onDestroy();
        String msg = "Total thread counter in B onDestroy is: "+ String.valueOf(MainActivity.threadCounter);
        Log.v(TAG,msg);
    }

    public void finishActivityB(View v) {
        ActivityB.this.finish();
        String msg = "Total thread counter in B Finish is: "+ String.valueOf(MainActivity.threadCounter);
        Log.v(TAG,msg);
    }
}