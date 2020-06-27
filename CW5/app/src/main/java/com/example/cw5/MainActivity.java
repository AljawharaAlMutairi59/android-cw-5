package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button a = findViewById(R.id.button);
        final Button b = findViewById(R.id.button2);


        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent (MainActivity.this, com.example.calculator2.MainActivity.class);
                startActivity(x);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent y = new Intent (MainActivity.this, com.example.aljawharascalculator.MainActivity.class);
                startActivity(y);
            }
        });

    }
}