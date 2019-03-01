package com.example.tsekk.dailynutritionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FragActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag);

        final Button button_start = findViewById(R.id.button_start);
        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToStartActivity();

            }
        });
        final Button button_select = findViewById(R.id.button_select);
        button_select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToSelectMealActivity();

            }
        });
    }

    public void GoToStartActivity(){
        Intent intent_start = new Intent(this, StartActivity.class);
        startActivity(intent_start);
    }
    public void GoToSelectMealActivity(){
        Intent intent_select = new Intent(this, SelectMealActivity.class);
        startActivity(intent_select);
    }
}
