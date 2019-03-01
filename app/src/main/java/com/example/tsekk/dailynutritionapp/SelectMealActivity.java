package com.example.tsekk.dailynutritionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class SelectMealActivity extends AppCompatActivity {

    private CheckBox check1,check2,check3,check4,check5,check6,check7,check8,check9,check10,check11,check12,
    check13,check14,check15,check16,check17;
    private Button button;
    public double calories, fat, saturated_fatty_acids, carbs, fiber, protein, vitamins, calcium, iron;
    private static final int REQ_CODE_ANS = 2468;
    boolean valid_entries;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_meal);
        addListenerOnButton();
    }

    public void addListenerOnButton(){
        check1 = (CheckBox) findViewById(R.id.checkBox1);
        check2 = (CheckBox) findViewById(R.id.checkBox2);
        check3 = (CheckBox) findViewById(R.id.checkBox3);
        check4 = (CheckBox) findViewById(R.id.checkBox4);
        check5 = (CheckBox) findViewById(R.id.checkBox5);
        check6 = (CheckBox) findViewById(R.id.checkBox6);
        check7 = (CheckBox) findViewById(R.id.checkBox7);
        check8 = (CheckBox) findViewById(R.id.checkBox8);
        check9 = (CheckBox) findViewById(R.id.checkBox9);
        check10 = (CheckBox) findViewById(R.id.checkBox10);
        check11 = (CheckBox) findViewById(R.id.checkBox11);
        check12 = (CheckBox) findViewById(R.id.checkBox12);
        check13 = (CheckBox) findViewById(R.id.checkBox13);
        check14 = (CheckBox) findViewById(R.id.checkBox14);
        check15 = (CheckBox) findViewById(R.id.checkBox15);
        check16 = (CheckBox) findViewById(R.id.checkBox16);
        check17 = (CheckBox) findViewById(R.id.checkBox17);
        button = (Button)findViewById(R.id.button3) ;

        calories = 0; fat = 0 ;
        saturated_fatty_acids = 0;
        carbs = 0; fiber = 0; protein = 0; vitamins = 0; calcium = 0; iron = 0;

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(check1.isChecked()){
                            calories = calories + 579; fat = fat + 17.3 ;
                            carbs = carbs + 86; protein = protein + 22.1; vitamins = vitamins + 790;
                            calcium = calcium + 457; iron = iron + 5;
                            valid_entries = true;
                        }
                        if(check2.isChecked()){
                            calories = calories + 736; fat = fat + 23 ;
                            carbs = carbs + 103.5; protein = protein + 22.1; vitamins = vitamins + 148.5;
                            calcium = calcium + 268.8; iron = iron + 7.2;
                            valid_entries = true;
                        }
                        if(check3.isChecked()){
                            calories = calories + 434.5; fat = fat + 14 ;
                            carbs = carbs + 54 ; protein = protein + 24.7; vitamins = vitamins + 459.4;
                            calcium = calcium + 157.6; iron = iron + 5.2;
                            valid_entries = true;
                        }
                        if(check4.isChecked()){
                            calories = calories + 889; fat = fat + 37.9 ;
                            carbs = carbs + 133.2; protein = protein + 22.045; vitamins = vitamins + 85.075;
                            calcium = calcium + 366.9; iron = iron + 5.1;
                        }
                        if(check5.isChecked()){
                            calories = calories + 198; fat = fat + 10.9 ;
                            carbs = carbs + 4.6; protein = protein + 21.8; vitamins = vitamins + 72.1;
                            calcium = calcium + 157.6; iron = iron + 1.3;
                            valid_entries = true;
                        }
                        if(check6.isChecked()){
                            calories = calories + 387.5; fat = fat + 14.5 ;
                            carbs = carbs + 58.5; protein = protein + 8.2; vitamins = vitamins + 101.7;
                            calcium = calcium + 103.65; iron = iron + 2.7;
                            valid_entries = true;
                        }
                        if(check7.isChecked()){
                            calories = calories + 1251; fat = fat + 56.9 ;
                            carbs = carbs + 111.1; protein = protein + 326.8; vitamins = vitamins + 267.6;
                            calcium = calcium + 958.25; iron = iron + 7.9;
                            valid_entries = true;
                        }
                        if(check8.isChecked()){
                            calories = calories + 407.9; fat = fat + 3.3 ;
                            carbs = carbs + 56.2; protein = protein + 42.6; vitamins = vitamins + 468.5;
                            calcium = calcium + 159.2; iron = iron + 3.6;
                            valid_entries = true;
                        }
                        if(check9.isChecked()){
                            calories = calories + 1137.5; fat = fat + 17.5 ;
                            carbs = carbs + 194; protein = protein + 45.9; vitamins = vitamins + 134.1;
                            calcium = calcium + 133.5; iron = iron + 11.3;
                            valid_entries = true;
                        }
                        if(check10.isChecked()){
                            calories = calories + 294; fat = fat + 5.1 ;
                            carbs = carbs + 30; protein = protein + 30.6; vitamins = vitamins + 84.5;
                            calcium = calcium + 36.1; iron = iron + 2.9;
                            valid_entries = true;
                        }
                        if(check11.isChecked()){
                            calories = calories + 86; fat = fat + 0 ;
                            carbs = carbs + 21;  protein = protein + 1.7; vitamins = vitamins + 120;
                            calcium = calcium + 74; iron = iron + 0;
                            valid_entries = true;
                        }
                        if(check12.isChecked()){
                            calories = calories + 600; fat = fat + 43 ;
                            carbs = carbs + 46;protein = protein + 8; vitamins = vitamins + 3;
                            calcium = calcium + 73; iron = iron + 12;
                            valid_entries = true;
                        }
                        if(check13.isChecked()){
                            calories = calories + 70; fat = fat + 0 ;
                            carbs = carbs + 17; protein = protein + 1.6; vitamins = vitamins + 35;
                            calcium = calcium + 10; iron = iron + 0.4;
                            valid_entries = true;
                        }
                        if(check14.isChecked()){
                            calories = calories + 138; fat = fat + 0 ;
                            carbs = carbs + 34.5; protein = protein + 2.4; vitamins = vitamins + 104;
                            calcium = calcium + 45.4; iron = iron + 0.4;
                        }
                        if(check15.isChecked()){
                            calories = calories + 140; fat = fat + 2.8 ;
                            carbs = carbs + 27; protein = protein + 1.6; vitamins = vitamins + 60;
                            calcium = calcium + 200; iron = iron + 1.8;
                            valid_entries = true;
                        }
                        if(check16.isChecked()){
                            calories = calories + 120; fat = fat + 0 ;
                            carbs = carbs + 31; protein = protein + 1.5; vitamins = vitamins + 53;
                            calcium = calcium + 6.8; iron = iron + 0.4;
                            valid_entries = true;
                        }
                        if(check17.isChecked()) {
                            calories = calories + 195;
                            fat = fat + 8;
                            carbs = carbs + 30;
                            protein = protein + 2.3;
                            vitamins = vitamins + 45;
                            calcium = calcium + 10;
                            iron = iron + 0.3;
                            valid_entries = true;
                        }

                        if(valid_entries){ GoToResultActivity();}
                        else { Toast.makeText(SelectMealActivity.this, "Really? You didn't eat anything today?!", Toast.LENGTH_SHORT).show();}

                        }
                }
        );
    }

    public void GoToResultActivity(){
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("calories",calories);
        intent.putExtra("fat", fat);
        intent.putExtra("carbs",carbs);
        intent.putExtra("protein",protein);
        intent.putExtra("vitamins",vitamins);
        intent.putExtra("calcium", calcium);
        intent.putExtra("iron", iron);
        startActivity(intent);
    }
}
