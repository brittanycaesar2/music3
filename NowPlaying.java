package com.example.android.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);


        // Find the View that show the back
        TextView back = (TextView) findViewById(R.id.back);


        // Set a click listener on that View
        back.setOnClickListener(new View.OnClickListener() {


            // The code in this method will be executed when back is clicked on.


            public void onClick(View view) {
                Intent backIntent = new Intent(NowPlaying.this, MainActivity.class);
                startActivity(backIntent);


            }
        });
    }


}


