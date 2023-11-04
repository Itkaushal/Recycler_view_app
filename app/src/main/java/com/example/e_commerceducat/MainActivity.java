package com.example.e_commerceducat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.e_commerceducat.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());

        mainBinding.btnSubmit.setOnClickListener(view ->{
            Intent i = new Intent(getApplicationContext(),Home_Page.class);
            startActivity(i);
        });
        mainBinding.tvForgot.setOnClickListener(view ->{
            Intent i = new Intent(getApplicationContext(),Forgot_Page1.class);
            startActivity(i);
        });
        mainBinding.tvRegister.setOnClickListener(view ->{
            Intent i = new Intent(getApplicationContext(),Register_Page.class);
            startActivity(i);
        });
    }
}