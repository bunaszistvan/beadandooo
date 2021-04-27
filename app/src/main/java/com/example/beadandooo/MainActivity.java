package com.example.beadandooo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView regisztracio = findViewById(R.id.textView);
        Button gomb = findViewById(R.id.regisztracio);

        gomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Covid = new Intent(MainActivity.this, SecondActivity.class)
            }
        });
    }
}