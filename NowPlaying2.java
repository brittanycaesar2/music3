package com.example.android.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NowPlaying2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing2);


        // Find the View that show the back2
        TextView back2 = (TextView) findViewById(R.id.back2);


        // Set a click listener on that View
        back2.setOnClickListener(new View.OnClickListener() {


            // The code in this method will be executed when the back2  is clicked on.


            public void onClick(View view) {
                Intent back2Intent = new Intent(NowPlaying2.this, MainActivity.class);
                startActivity(back2Intent);


            }
        });


    }


}
