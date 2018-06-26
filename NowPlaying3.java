package com.example.android.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NowPlaying3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing3);


        // Find the View that show the back button
        TextView back3 = (TextView) findViewById(R.id.back3);


        // Set a click listener on that View
        back3.setOnClickListener(new View.OnClickListener() {


            // The code in this method will be executed when the back3  is clicked on.


            public void onClick(View view) {
                Intent back3Intent = new Intent(NowPlaying3.this, MainActivity.class);
                startActivity(back3Intent);


            }
        });


    }
}
