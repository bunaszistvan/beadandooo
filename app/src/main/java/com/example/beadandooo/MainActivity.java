package com.example.beadandooo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText Regisztráció Covid oltásra = findViewById(R.id.editText);
        Button gomb = findViewById(R.id.Regisztráció);

        gomb.setOnLongClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Covid = new Intent(packageContest MainActivity.this, SecondActivity.class)
            }
        });
    }
}