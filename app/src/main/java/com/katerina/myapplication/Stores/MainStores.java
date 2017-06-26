package com.katerina.myapplication.Stores;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.katerina.myapplication.R;

public class MainStores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_stores);
        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().add(R.id.activity_main_stores, new StoresFragment()).commit();
        }

    }

    @Override
    public void onStart() {
        super.onStart();
        //get info from previous activity:
        Intent intent = getIntent();
        //set custom title of this activity:
        String title = intent.getStringExtra("key_for_title");
        getSupportActionBar().setTitle(title);
    }





}
