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
        // 畫面上有一個獲得商品區塊，用來顯示付款後獲得的商品(抽象工廠模式生產產品) 開始 14:15  結束 14:23
        double price = 100;
        double ApplePayPrice = price*.8;
        ChoosePay mChoosePay = new ChoosePay();
        mChoosePay.choosePay(new PayStrategy.LinePay());
        mChoosePay.PayName_Price(price);
        mChoosePay.choosePay(new PayStrategy.ApplePay());
        mChoosePay.PayName_Price(ApplePayPrice);
    }
}