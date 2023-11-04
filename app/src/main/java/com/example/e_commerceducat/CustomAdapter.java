package com.example.e_commerceducat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.e_commerceducat.databinding.CustomLayoutBinding;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.viewHolder> {
    private final RecyclerViewInterface recyclerViewInterface;
    ArrayList<String> product_name;
    ArrayList<String> product_color;
    ArrayList<String> product_price;
    ArrayList<String> product_image_url;
    LayoutInflater inflater;

    private CustomLayoutBinding customLayoutBinding;
    public CustomAdapter(RecyclerViewInterface recyclerViewInterface, Home_Page home_page, ArrayList<String> product_name, ArrayList<String> product_color, ArrayList<String> product_price, ArrayList<String> product_image_url) {
        this.product_name=product_name;
        this.product_color=product_color;
        this.product_price=product_price;
        this.product_image_url=product_image_url;
        this.recyclerViewInterface = recyclerViewInterface;
        inflater=LayoutInflater.from(home_page);

    }

    @NonNull
    @Override
    public CustomAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        customLayoutBinding=CustomLayoutBinding.inflate(inflater);
        return new viewHolder(customLayoutBinding.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.viewHolder holder, int position) {
        customLayoutBinding.textViewProduct.setText(product_name.get(position));
        customLayoutBinding.textViewColor.setText(product_color.get(position));
        customLayoutBinding.textViewPrice.setText(product_price.get(position));
        Picasso.get().load(product_image_url.get(position)).into(customLayoutBinding.imageView);

    }

    @Override
    public int getItemCount() {
        return product_name.size();
    }


    public class viewHolder extends RecyclerView.ViewHolder {
        public viewHolder(@NonNull View itemView) {
            super(itemView);

          itemView.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  if (recyclerViewInterface != null)
                  {
                      int pos =getAdapterPosition();

                      if (pos != RecyclerView.NO_POSITION)
                      {
                          recyclerViewInterface.onItemClick(pos);
                      }
                  }
              }
          });
        }
    }

}
