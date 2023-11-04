package com.example.e_commerceducat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.e_commerceducat.databinding.ActivityForgotPage2Binding;

public class Forgot_Page2 extends AppCompatActivity {
    ActivityForgotPage2Binding page2Binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page2Binding=ActivityForgotPage2Binding.inflate(getLayoutInflater());
        setContentView(page2Binding.getRoot());

        page2Binding.btnOtp.setOnClickListener(view ->{
            Intent intent = new Intent(getApplicationContext(),Forgot_Page3.class);
            startActivity(intent);
        });

    }
}