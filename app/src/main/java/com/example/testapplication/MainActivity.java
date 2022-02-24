package com.example.testapplication;

import android.content.Intent;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Main screen
        //Here you get presented the sections that are available
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView header = findViewById(R.id.textView);

        String text = "     SECTIONS:";
        SpannableString ss = new SpannableString(text);
        UnderlineSpan underlineSpan = new UnderlineSpan();
        ss.setSpan(underlineSpan, 5, 14, Spanned.SPAN_INCLUSIVE_INCLUSIVE);

        header.setText(ss);


        // Info Screen -> Information about the APP
        button = findViewById(R.id.infoButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openInfoScreen();
            }
        });

        // Math Screen -> Math questions
        button = findViewById(R.id.mathButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMathScreen();
            }
        });

        // Geography Screen -> Geography questions
        button = findViewById(R.id.geographyButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGeographyScreen();
            }
        });

        // Crypto Screen -> Crypto questions
        button = findViewById(R.id.cryptoButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCryptoScreen();
            }
        });


    }

    private void openCryptoScreen() {
        Intent intent = new Intent(this, CryptoScreen.class);
        startActivity(intent);
    }

    private void openGeographyScreen() {
        Intent intent = new Intent(this, GeographyScreen.class);
        startActivity(intent);
    }

    private void openMathScreen() {
        Intent intent = new Intent(this, MathScreen.class);
        startActivity(intent);
    }

    private void openInfoScreen() {
        Intent intent = new Intent(this, InfoScreen.class);
        startActivity(intent);
    }


}