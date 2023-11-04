package com.example.e_commerceducat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.e_commerceducat.databinding.ActivityProductDetailPageBinding;

public class ProductDetail_Page extends AppCompatActivity {
    ActivityProductDetailPageBinding detailPageBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        detailPageBinding=ActivityProductDetailPageBinding.inflate(getLayoutInflater());
        setContentView(detailPageBinding.getRoot());
    }
}