package com.example.tsekk.dailynutritionapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StartActivity extends AppCompatActivity {

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        mp = MediaPlayer.create(this,R.raw.stavros);
        mp.start();

        final Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToFragActivity();

            }
        });

        final Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToFragActivity();

            }
        });
    }

    public void GoToFragActivity(){
        Intent intent = new Intent(this, FragActivity.class);
        intent.putExtra("first","first");
        startActivity(intent);

    }
}
