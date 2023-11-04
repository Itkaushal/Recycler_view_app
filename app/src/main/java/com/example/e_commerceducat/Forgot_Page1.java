package com.example.e_commerceducat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.e_commerceducat.databinding.ActivityForgotPage1Binding;

public class Forgot_Page1 extends AppCompatActivity {
    ActivityForgotPage1Binding page1Binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page1Binding=ActivityForgotPage1Binding.inflate(getLayoutInflater());
        setContentView(page1Binding.getRoot());

        page1Binding.btnEmail.setOnClickListener(view ->{
            Intent intent = new Intent(getApplicationContext(),Forgot_Page2.class);
            startActivity(intent);
        });
    }
}