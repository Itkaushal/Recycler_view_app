package com.example.e_commerceducat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.e_commerceducat.databinding.ActivityMainBinding;
import com.example.e_commerceducat.databinding.ActivityRegisterPageBinding;

public class Register_Page extends AppCompatActivity {
    ActivityRegisterPageBinding registerPageBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        registerPageBinding=ActivityRegisterPageBinding.inflate(getLayoutInflater());
        setContentView(registerPageBinding.getRoot());

        registerPageBinding.btnRegister.setOnClickListener(view ->{
            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
        });
    }
}