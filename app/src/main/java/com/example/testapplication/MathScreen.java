package com.example.testapplication;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MathScreen extends AppCompatActivity {


private CheckBox questionOneCheckerA;
private CheckBox questionTwoCheckerB;
private CheckBox questionThreeCheckerC;
private CheckBox questionFourCheckerB;
private CheckBox questionFiveCheckerB;


private Button getResults ;
private TextView resultText ;
private int result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_screen);

        questionOneCheckerA = findViewById(R.id.question_1_A);
        questionTwoCheckerB = findViewById(R.id.question_2_B);
        questionThreeCheckerC = findViewById(R.id.question_3_C);
        questionFourCheckerB = findViewById(R.id.question_4_B);
        questionFiveCheckerB = findViewById(R.id.question_5_B);


        getResults = findViewById(R.id.get_result_button);
        resultText = findViewById(R.id.result_math);
        result = 0;
        resultText.setEnabled(false);


        //TODO: Add method to check if the answer is correct
        questionOneCheckerA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (questionOneCheckerA.isChecked()){
                    result += 1;
                }
            }
        });

        questionTwoCheckerB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (questionTwoCheckerB.isChecked()) {
                    result += 1;
                }
            }
        });

        questionThreeCheckerC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (questionThreeCheckerC.isChecked()) {
                    result += 1;
                }
            }
        });

        questionFourCheckerB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (questionFourCheckerB.isChecked()) {
                    result += 1;
                }
            }
        });

        questionFiveCheckerB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (questionFiveCheckerB.isChecked()) {
                    result += 1;
                }
            }
        });

        getResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stringResult = String.valueOf(result) + " / 5";
                resultText.setText(stringResult);
                resultText.setTextSize(1,50);
                resultText.setEnabled(false);
            }
        });

    }



}