package com.example.a0407_addis_check_application;

import android.util.Log;

public class ChoosePay {
    protected PayStrategy.PayWay mPayWay = null;

    public void choosePay(PayStrategy.PayWay payWay) {
        mPayWay = payWay;
    }

    public String PayName_Price(double price) {
        Log.d("Addis", " " + mPayWay.Way(price));
        return " " + mPayWay.Way(price);
    }
}
