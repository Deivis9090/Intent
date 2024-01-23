package com.example.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button openSecondActivityButton = findViewById(R.id.btnSecond);

        openSecondActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openSecondActivity();
            }
        });
    }

    private void openSecondActivity() {

        Intent intent = new Intent(this, SecondActivity.class);

        String Message = "Hello from MainActivity";
        intent.putExtra("MENSAJE", Message);

        startActivity(intent);
    }
}
