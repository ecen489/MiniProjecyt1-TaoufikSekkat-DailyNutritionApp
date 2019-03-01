package com.example.tsekk.dailynutritionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView tvcal,tvfat,tvcarb,tvpro,tvvit,tvclc,tviron;
    String cal,fa,carb,pro,vit,calc,iro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Bundle bundle = getIntent().getExtras();

        double calories = bundle.getDouble("calories");
        double fat = bundle.getDouble("fat");
        double carbs = bundle.getDouble("carbs");
        double protein = bundle.getDouble("protein");
        double vitamins = bundle.getDouble("vitamins");
        double calcium = bundle.getDouble("calcium");
        double iron = bundle.getDouble("iron");

        tvcal = (TextView) findViewById(R.id.calories_text);
        tvfat = (TextView) findViewById(R.id.fat_text);
        tvcarb = (TextView) findViewById(R.id.carbs_text);
        tvpro = (TextView) findViewById(R.id.protein_text);
        tvvit = (TextView) findViewById(R.id.vitamins_text);
        tvclc = (TextView) findViewById(R.id.calcium_text);
        tviron = (TextView) findViewById(R.id.iron_text);

        cal=Double.toString(calories) + " calories";
        fa=Double.toString(fat) + " g";
        carb=Double.toString(carbs) + " g";
        pro=Double.toString(protein) + " g";
        vit=Double.toString(vitamins) + " mg";
        calc=Double.toString(calcium) + " mg";
        iro=Double.toString(iron) + " mg";

        tvcal.setText(cal);
        tvfat.setText(fa);
        tvcarb.setText(carb);
        tvpro.setText(pro);
        tvvit.setText(vit);
        tvclc.setText(calc);
        tviron.setText(iro);

        final Button button = findViewById(R.id.return_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToFragActivity();

            }
        });
    }

    public void GoToFragActivity(){
        Intent intent = new Intent(this, FragActivity.class);
        intent.putExtra("calories",cal);
        intent.putExtra("fat", fa);
        intent.putExtra("carbs",carb);
        intent.putExtra("protein",pro);
        intent.putExtra("vitamins",vit);
        intent.putExtra("calcium", calc);
        intent.putExtra("iron", iro);
        startActivity(intent);
    }
}
