package com.example.testapplication;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class CryptoScreen extends AppCompatActivity {

    private CheckBox checkBox_crypto_C1;
    private CheckBox checkBox_crypto_B2;
    private CheckBox checkBox_crypto_B3;

    private Button get_results_crypto ;
    private TextView resultText ;
    private int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crypto_screen);

        checkBox_crypto_C1 = findViewById(R.id.checkBox_crypto_C1);
        checkBox_crypto_B2 = findViewById(R.id.checkBox_crypto_B2);
        checkBox_crypto_B3 = findViewById(R.id.checkBox_crypto_B3);

        get_results_crypto = findViewById(R.id.button_get_result_crypto);
        resultText = findViewById(R.id.result_crypto);
        result = 0;
        resultText.setEnabled(false);

        checkBox_crypto_C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkBox_crypto_C1.isChecked()) {
                    result ++;
                }
            }
        });

        checkBox_crypto_B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkBox_crypto_B2.isChecked()) {
                    result ++;
                }
            }
        });

        checkBox_crypto_B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkBox_crypto_B3.isChecked()) {
                    result ++;
                }
            }
        });

        get_results_crypto.setOnClickListener(new View.OnClickListener() {
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