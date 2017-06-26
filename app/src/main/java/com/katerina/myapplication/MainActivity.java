package com.katerina.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


import com.katerina.myapplication.Stores.MainStores;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Simple call to functions to set a custom title bar.
        // The custom title bar can be modified in the xml file title_bar.xml in layout folder.
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.title_bar);



        ImageView stores = (ImageView)findViewById(R.id.stores);
        stores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent storesIntent = new Intent(MainActivity.this,MainStores.class);
                String barTitle = "Stores";
                storesIntent.putExtra("key_for_title", barTitle);
                startActivity(storesIntent);
            }
        });

    }
}
