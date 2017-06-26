package com.katerina.myapplication.Stores;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.katerina.myapplication.R;

public class StoreDetailsActivity extends AppCompatActivity {

    private TextView StoreName, StoreCategory, StoreContact, StoreReview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_details);


        Intent intent = getIntent();

        String storeName = intent.getStringExtra("store_name");
        StoreName = (TextView) findViewById(R.id.storeName);
        StoreName.setText(storeName);

        String storeCategory = intent.getStringExtra("store_category");
        StoreCategory = (TextView) findViewById(R.id.storeCategory);
        StoreCategory.setText(storeCategory);

        String storeAddress = intent.getStringExtra("store_address");
        StoreContact = (TextView) findViewById(R.id.storeAddress);
        StoreContact.setText(storeAddress);

        String storeReview = intent.getStringExtra("store_review");
        StoreReview = (TextView) findViewById(R.id.storeReview);
        StoreReview.setText(storeReview);
    }


    @Override
    public void onStart() {
        super.onStart();
       //set custom title of this activity:
        String title = "Store Details";
        getSupportActionBar().setTitle(title);
    }

}
