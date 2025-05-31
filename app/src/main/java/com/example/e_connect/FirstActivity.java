package com.example.e_connect;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


        Button buttonLogin = findViewById(R.id.button_login);
        buttonLogin.setOnClickListener(v -> {
            Intent intent = new Intent(FirstActivity.this,LoginActivity.class);
            startActivity(intent);
        });
        Button buttonRegister=findViewById(R.id.button_register);
        buttonRegister.setOnClickListener(v -> {
            Intent intent = new Intent(FirstActivity.this,RegisterActivity.class);
            startActivity(intent);
        });
    }
}