package com.example.e_commerceducat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.e_commerceducat.databinding.ActivityForgotPage3Binding;

public class Forgot_Page3 extends AppCompatActivity {
    ActivityForgotPage3Binding page3Binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page3Binding=ActivityForgotPage3Binding.inflate(getLayoutInflater());
        setContentView(page3Binding.getRoot());

        page3Binding.btnRepeatpass.setOnClickListener(view ->{
            Intent i = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(i);
        });
    }
}