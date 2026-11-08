package com.example.cycledevieactivity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        TextView tvResult = findViewById(R.id.tvResult);

        String username = getIntent().getStringExtra("username");
        String password = getIntent().getStringExtra("password");

        tvResult.setText("Bienvenue " + username + " !\nVotre mot de passe est : " + password);
    }
}