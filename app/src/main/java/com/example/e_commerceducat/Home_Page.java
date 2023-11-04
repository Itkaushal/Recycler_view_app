package com.example.e_commerceducat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.content.Intent;
import android.os.Bundle;

import com.example.e_commerceducat.databinding.ActivityHomePageBinding;

import java.util.ArrayList;

public class Home_Page extends AppCompatActivity implements RecyclerViewInterface {
    ActivityHomePageBinding homePageBinding;

    static ArrayList<String> product_name = new ArrayList<>();
    static ArrayList<String> product_color = new ArrayList<>();
    static ArrayList<String> product_price = new ArrayList<>();
    static ArrayList<String> product_image_url = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        homePageBinding=ActivityHomePageBinding.inflate(getLayoutInflater());
        setContentView(homePageBinding.getRoot());


        product_name.add("Iphone 13");
        product_name.add("Iphone 12");
        product_name.add("Iphone 15");
        product_name.add("Iphone 14");

        product_color.add("blue");
        product_color.add("red");
        product_color.add("pink");
        product_color.add("Gold");

        product_price.add("78,999");
        product_price.add("48,999");
        product_price.add("150,000");
        product_price.add("70000");

        product_image_url.add("https://m.media-amazon.com/images/I/3150P3KQFlL._AC_UF226,226_FMjpg_.jpg");
        product_image_url.add("https://m.media-amazon.com/images/I/71E5zB1qbIL._AC_UY218_.jpg");
        product_image_url.add("https://fdn2.gsmarena.com/vv/pics/apple/apple-iphone-15-1.jpg");
        product_image_url.add("https://m.media-amazon.com/images/I/61WAINtWPPL._AC_UY218_.jpg");


        homePageBinding.recyclerView.setLayoutManager(new GridLayoutManager(Home_Page.this,2));

        CustomAdapter ca = new CustomAdapter(this, Home_Page.this,product_name,product_color,product_price,product_image_url);
        homePageBinding.recyclerView.setAdapter(ca);


    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(Home_Page.this,Home2Page.class);
        intent.putExtra("index",position);
        startActivity(intent);

    }
}