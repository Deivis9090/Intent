package com.example.intent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        String Message = intent.getStringExtra("MENSAJE");

        TextView mensajeTextView = findViewById(R.id.msjTextView);
        mensajeTextView.setText(Message);
    }
}
