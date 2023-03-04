package com.example.cmpe277_activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;
import static android.content.ContentValues.TAG;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    private String mActivityName;
    private TextView mStatusView;
    private TextView mStatusAllView;
    public static  int threadCounter=0;
    public TextView threadCounterView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        threadCounter++;
        String msg = "Total thread counter in A onCreate is: "+ String.valueOf(threadCounter);
        Log.v(TAG,msg);
        threadCounterView = (TextView)findViewById(R.id.threadCounter);
        String vi = String.format("%04d",threadCounter);
        threadCounterView.setText("Thread Counter: "+vi);
    }
    @Override
    protected void onStart() {
        super.onStart();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        threadCounter++;
        String msg = "Total thread counter in A onRestart is: "+ String.valueOf(threadCounter);
        Log.v(TAG,msg);
        threadCounterView = (TextView)findViewById(R.id.threadCounter);
        String vi = String.format("%04d",threadCounter);
        threadCounterView.setText("Thread Counter: "+vi);


    }


    @Override
    protected void onResume() {

        super.onResume();
        String msg = "Total thread counter in A onResume is: "+ String.valueOf(threadCounter);
        Log.v(TAG,msg);
    }
    @Override
    protected void onPause() {
        super.onPause();
        String msg = "Total thread counter in A onPause is: "+ String.valueOf(threadCounter);
        Log.v(TAG,msg);
    }
    @Override
    protected void onStop() {
        super.onStop();
        String msg = "Total thread counter in A onStop is: "+ String.valueOf(threadCounter);
        Log.v(TAG,msg);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        String msg = "Total thread counter in A onDestroy is: "+ String.valueOf(threadCounter);
        Log.v(TAG,msg);
    }

    public void startActivityB(View v) {
        Intent intent = new Intent(MainActivity.this, ActivityB.class);
        startActivityForResult(intent,0);
    }

    public  void startDialog(View v)
    {
        Intent intent = new Intent(MainActivity.this, DialogActivity.class);
        startActivity(intent);
    }

    public void finishActivityA(View v)
    {
        threadCounter = 0;
        MainActivity.this.finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        onDestroy();
    }

}