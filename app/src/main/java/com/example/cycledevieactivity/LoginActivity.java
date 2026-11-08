package com.example.cycledevieactivity;

import static com.example.cycledevieactivity.R.*;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {

    EditText etUsername, etPassword;
    Button btnLogin;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.enableEdgeToEdge(getWindow());
        setContentView(layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        etUsername = findViewById(id.etUsername);
        etPassword = findViewById(id.etPassword);
        btnLogin = findViewById(id.btnLogin);
        btnLogin.setOnClickListener(view -> {
            String username = etUsername.getText().toString();
            String password = etPassword.getText().toString();
            if (username.equals("badr") && password.equals("badr234")) {
                Intent intent = new Intent(this.getApplicationContext(), MainActivity.class);
                intent.putExtra("firstname", "Wunder");
                intent.putExtra("lastname", "Prime");
                intent.putExtra("session", "abcdefg");
                startActivity(intent);
                this.finish();
            }else{
                Toast.makeText(LoginActivity.this, "Erreur", Toast.LENGTH_SHORT).show();
            }
        });
    }
}