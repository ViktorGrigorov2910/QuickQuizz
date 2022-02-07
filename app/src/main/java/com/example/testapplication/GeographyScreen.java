package com.example.testapplication;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class GeographyScreen extends AppCompatActivity {
    private CheckBox question_1_checker_A_geo;
    private CheckBox question_2_checker_A_geo;
    private CheckBox question_3_checker_A_geo;

    private Button get_results_geo ;
    private TextView resultText ;
    private int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geography_screen);

        question_1_checker_A_geo = findViewById(R.id.question_1_A_geo);
        question_2_checker_A_geo = findViewById(R.id.question_2_A_geo);
        question_3_checker_A_geo = findViewById(R.id.question_3_A_geo);

        get_results_geo = findViewById(R.id.get_results_geo);
        resultText = findViewById(R.id.result_geography);
        result = 0;
        resultText.setEnabled(false);

        question_1_checker_A_geo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (question_1_checker_A_geo.isChecked()) {
                    result ++;
                }
            }
        });

        question_2_checker_A_geo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (question_2_checker_A_geo.isChecked()) {
                    result ++;
                }
            }
        });

        question_3_checker_A_geo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (question_3_checker_A_geo.isChecked()) {
                    result ++;
                }
            }
        });

        get_results_geo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stringResult = String.valueOf(result) + " / 3";
                resultText.setText(stringResult);
                resultText.setTextSize(1,50);
                resultText.setEnabled(false);
            }
        });
    }


}