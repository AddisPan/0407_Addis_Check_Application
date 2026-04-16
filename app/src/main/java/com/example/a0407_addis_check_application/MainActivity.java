package com.example.a0407_addis_check_application;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 畫面上有一個付款明細區塊，用來顯示付款方式及消費金額(LinePay 100 Apple Pay 80) 開始 13:58  結束 14:13
        double price = 100;
        double ApplePayPrice = price*.8;
        ChoosePay mChoosePay = new ChoosePay();
        mChoosePay.choosePay(new PayStrategy.LinePay());
        mChoosePay.PayName_Price(price);
        mChoosePay.choosePay(new PayStrategy.ApplePay());
        mChoosePay.PayName_Price(ApplePayPrice);
    }
}