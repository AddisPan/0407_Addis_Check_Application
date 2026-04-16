package com.example.a0407_addis_check_application;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 畫面上有一個玩具區塊，用來顯示盲盒中的玩具是哪種 開始 15:04  結束 15:12
        TextView mTextViewLinePay = findViewById(R.id.id_button_line_pay);
        TextView mTextViewApplePay = findViewById(R.id.id_button_apple_pay);
        TextView mTextViewShowPrice = findViewById(R.id.id_show_price);
        TextView mTextViewShowCommodity = findViewById(R.id.id_show_commodity);
        TextView mTextViewShowBoxType = findViewById(R.id.id_show_box_type);
        TextView mTextViewShowToyType = findViewById(R.id.id_show_toy_type);

        double price = 100;
        double ApplePayPrice = price * .8;

        ChoosePay mChoosePay = new ChoosePay();
        mTextViewLinePay.setOnClickListener(v -> {
            mChoosePay.choosePay(new PayStrategy.LinePay());
            mTextViewShowPrice.setText("" + mChoosePay.PayName_Price(price));
        });
        mTextViewApplePay.setOnClickListener(v -> {
            mChoosePay.choosePay(new PayStrategy.ApplePay());
            mTextViewShowPrice.setText("" + mChoosePay.PayName_Price(ApplePayPrice));
        });

        CommodityFactory.Store mStore = new CommodityFactory.Store();
        mTextViewShowCommodity.setText(mStore.createBox().Type() + " + " + mStore.createBag().Type());

        mTextViewShowBoxType.setText(CommodityFactory.createBox("Paper").Type() + "\n" + CommodityFactory.createBox("Plastic").Type() + "\n" + CommodityFactory.createBox("Glass").Type());

        mTextViewShowToyType.setText(CommodityFactory.createToy("ToyCar").Type() + "\n" + CommodityFactory.createToy("Robot").Type() + "\n" + CommodityFactory.createToy("Doll").Type());
    }
}