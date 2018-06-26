package com.example.android.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NowPlaying1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing1);


        // Find the View that show the back1 button
        TextView back1 = (TextView) findViewById(R.id.back1);


        // Set a click listener on that View
        back1.setOnClickListener(new View.OnClickListener() {


            // The code in this method will be executed when the back1  is clicked on.


            public void onClick(View view) {
                Intent back1Intent = new Intent(NowPlaying1.this, MainActivity.class);
                startActivity(back1Intent);


            }
        });
    }
}