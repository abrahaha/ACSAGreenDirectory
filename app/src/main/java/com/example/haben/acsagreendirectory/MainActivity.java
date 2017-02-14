package com.example.haben.acsagreendirectory;

import android.os.Bundle;
import android.app.Activity;
import android.os.Handler;
import android.content.Intent;


public class MainActivity extends Activity implements Runnable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Handler handler = new Handler();


        handler.postDelayed(this, 5000);

    }

    public void run() {
        Intent intent = new Intent(this, DashboardHomeActivity.class);
        startActivity(intent);

    }

}
