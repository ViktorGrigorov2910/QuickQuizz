package com.example.testapplication;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button =  findViewById(R.id.infoButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openInfoScreen();
            }
        });

        button =  findViewById(R.id.mathButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMathScreen ();
            }
        });

        button =  findViewById(R.id.geographyButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGeographyScreen();
            }
        });

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

    public void openMathScreen (){
        Intent intent = new Intent(this , MathScreen.class);
        startActivity(intent);
    }



public void openInfoScreen (){
    Intent intent = new Intent (this , InfoScreen.class);
    startActivity(intent);
}




}