package com.example.e_commerceducat;

import static android.content.ContentValues.TAG;
import static com.example.e_commerceducat.Home_Page.product_image_url;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.example.e_commerceducat.databinding.ActivityHome2PageBinding;
import com.razorpay.Checkout;
import com.squareup.picasso.Picasso;
import org.json.JSONObject;

public class Home2Page extends AppCompatActivity implements PaymentResultListenerWithDataListener {
    ActivityHome2PageBinding home2PageBinding;
    Checkout checkout = new Checkout();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        home2PageBinding = ActivityHome2PageBinding.inflate(getLayoutInflater());
        setContentView(home2PageBinding.getRoot());

        int pos = getIntent().getIntExtra("index", 0);
        home2PageBinding.tvNameHome2.setText(Home_Page.product_name.get(pos));
        home2PageBinding.tvColorHome2.setText(Home_Page.product_color.get(pos));
        home2PageBinding.tvPriceHome2.setText(Home_Page.product_price.get(pos) + "");
        Picasso.get().load(product_image_url.get(pos)).into(home2PageBinding.imgHome2);

        /**
         * Preload payment resources
         */
        Checkout.preload(getApplicationContext());
        checkout.setKeyID("rzp_test_e1z8lc1JE5Vnvu");
        // ...

        //checkout.setKeyID("rzp_test_e1z8lc1JE5Vnvu");

        home2PageBinding.btnBuyNow.setOnClickListener(view -> {
            startPayment();
        });


    }

    public void startPayment() {
        /**
         * Instantiate Checkout
         */


        /**
         * Set your logo here
         */
        checkout.setImage(R.drawable.kaushalblack);

        /**
         * Reference to current activity
         */
        final Activity activity = this;

        /**
         * Pass your payment options to the Razorpay Checkout as a JSONObject
         */
        try {
            JSONObject options = new JSONObject();

            options.put("name", "Kaushlendra Kumar");
            options.put("description", "Reference No. #123456");
            options.put("image", "https://s3.amazonaws.com/rzp-mobile/images/rzp.jpg");
            options.put("order_id", "order_DBJOWzybf0sJbb");//from response of step 3.
            options.put("theme.color", "#3399cc");
            options.put("currency", "INR");
            options.put("amount", "50000");//pass amount in currency subunits
            options.put("prefill.email", "kaushal.kumar@example.com");
            options.put("prefill.contact", "9953857495");
            JSONObject retryObj = new JSONObject();
            retryObj.put("enabled", true);
            retryObj.put("max_count", 4);
            options.put("retry", retryObj);

            checkout.open(activity, options);

        } catch (Exception e) {
            Log.e(TAG, "Error in starting Razorpay Checkout", e);
        }

    }

    @Override
    public void onPaymentSuccess(String s) {

    }

    @Override
    public void onPaymentError(int i, String s) {

    }
}