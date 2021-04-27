package com.example.beadandooo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView adatok = findViewById(R.id.textView);
        EditText nev = findViewById(R.id.nev);
        EditText datum = findViewById(R.id.datum);
        EditText szig = findViewById(R.id.szemelyi);
        Button gomb = findViewById(R.id.tovabb);

        gomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Covid = new Intent(SecondActivity.this, ThirdActivity.class);
            }
        });
    }
}
