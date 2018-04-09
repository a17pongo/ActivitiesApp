package com.example.brom.activitiesapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MountainDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountaindetails);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);


        //String toast = "Name: " + mountainNames[position] + '\n' + "Location: " + mountainLocations[position] + '\n' + "Height: " + mountainHeights[position];
        //Toast.makeText(getApplicationContext(),"hej", Toast.LENGTH_SHORT).show();

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String mountainLocations = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        //String mountainHeights = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        //TextView textView = findViewById(R.id.info_text);
        Toast.makeText(getApplicationContext(),mountainLocations,Toast.LENGTH_SHORT);
        //textView.setText(mountainHeights);


    }

}
