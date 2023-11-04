package com.example.e_commerceducat;

public interface PaymentResultListenerWithDataListener {
    void onPaymentSuccess(String s);

    void onPaymentError(int i, String s);
}
