package com.example.haben.acsagreendirectory;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuInflater;
import android.app.ActionBar;
import android.view.View;
import android.content.Intent;

public class CategoryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        ActionBar actionbar = getActionBar();
        Intent intent = getIntent();
        String category = (String)intent.getSerializableExtra("category");
        /**ToDo Change below to set title to the actual full category name once database is seen
         */
        actionbar.setTitle("     " + category);

        //Todo get the database category, then create clickable TextViews to display the services
    }

}
