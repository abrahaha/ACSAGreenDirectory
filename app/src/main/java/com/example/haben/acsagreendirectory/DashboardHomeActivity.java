package com.example.haben.acsagreendirectory;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuInflater;
import android.app.ActionBar;
import android.view.View;
import android.content.Intent;

public class DashboardHomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_home);
        ActionBar actionbar = getActionBar();
        actionbar.setTitle("     " + getString(R.string.title_activity_dashboard_home));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu, menu);

        return true;
    }

    public void openCategory(View v) {
        Intent intent = new Intent(this, CategoryActivity.class);

        //ToDo Change the keys being sent in the intent to something more relevant to the database
        switch(v.getId()) {
            case R.id.childcareImage:
                intent.putExtra("category", "childcare");
                break;
            case R.id.communityImage:
                intent.putExtra("category", "childcare");
                break;
            case R.id.disabilityServicesImage:
                intent.putExtra("category", "disability");
                break;
            case R.id.educationImage:
                intent.putExtra("category", "education");
                break;
            case R.id.employmentImage:
                intent.putExtra("category", "education");
                break;
            case R.id.faithImage:
                intent.putExtra("category", "faith");
                break;
            case R.id.foodImage:
                intent.putExtra("category", "food");
                break;
            case R.id.governmentImage:
                intent.putExtra("category", "government");
                break;
            case R.id.healthImage:
                intent.putExtra("category", "health");
                break;
            case R.id.housingImage:
                intent.putExtra("category", "housing");
                break;
            case R.id.legalImage:
                intent.putExtra("category", "legal");
                break;
            case R.id.mediaImage:
                intent.putExtra("category", "media");
                break;
            case R.id.seniorsImage:
                intent.putExtra("category", "seniors");
                break;
            case R.id.settlementImage:
                intent.putExtra("category", "settlement");
                break;
            case R.id.transportationImage:
                intent.putExtra("category", "transportation");
                break;
            case R.id.womensImage:
                intent.putExtra("category", "womens");
                break;
            case R.id.youthImage:
                intent.putExtra("category", "youth");
                break;
        }
        startActivity(intent);
    }
}
