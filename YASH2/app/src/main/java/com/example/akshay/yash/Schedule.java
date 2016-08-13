package com.example.akshay.yash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;

public class Schedule extends BaseActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //inflate your activity layout here!
        View contentView = inflater.inflate(R.layout.activity_schedule, null, false);
        drawer.addView(contentView, 0);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void goToDay1(View view) {
        Intent intent=new Intent(this,Activity_day1.class);
        startActivity(intent);

    }

    public void goToDay2(View view) {
        Intent intent=new Intent(this,Activity_Day2.class);
        startActivity(intent);
    }
    public void goToDay3(View view) {
        Intent intent=new Intent(this,Activity_Day3.class);
        startActivity(intent);

    }

    public void goToDay4(View view) {
        Intent intent=new Intent(this,Activity_Day4.class);
        startActivity(intent);
    }
    public void goToDay5(View view) {
        Intent intent=new Intent(this,Activity_Day5.class);
        startActivity(intent);
    }
    public void goToDay6(View view) {
        Intent intent=new Intent(this,Activity_Day6.class);
        startActivity(intent);
    }
    public void goToDay7(View view) {
        Intent intent=new Intent(this,Activity_Day7.class);
        startActivity(intent);
    }




}
