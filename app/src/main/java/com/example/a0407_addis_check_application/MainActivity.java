package com.example.a0407_addis_check_application;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 使用工廠方法模式生產盲盒
        //盲盒內容為下列隨機一種
        //「紙盒裝的玩具車」
        //「塑膠盒裝的機器人」
        //「玻璃盒裝的娃娃」 開始 15:50  結束 16:00
        TextView mTextViewLinePay = findViewById(R.id.id_button_line_pay);
        TextView mTextViewApplePay = findViewById(R.id.id_button_apple_pay);
        TextView mTextViewShowPrice = findViewById(R.id.id_show_price);
        TextView mTextViewShowCommodity = findViewById(R.id.id_show_commodity);
        TextView mTextViewShowBoxType = findViewById(R.id.id_show_box_type);
        TextView mTextViewShowToyType = findViewById(R.id.id_show_toy_type);
        TextView mTextViewShowBlindBoxManage = findViewById(R.id.id_show_blind_box_manage);

        Log.d("Addis", String.valueOf(new Date().getTime() % 3));
        // 工廠方法模式生產盲盒 隨機
        String mBlindBoxA = CommodityFactory.createToy("ToyCar").Type() + " + " + CommodityFactory.createBox("Paper").Type();
        String mBlindBoxB = CommodityFactory.createToy("Robot").Type() + " + " + CommodityFactory.createBox("Plastic").Type();
        String mBlindBoxC = CommodityFactory.createToy("Doll").Type() + " + " + CommodityFactory.createBox("Glass").Type();

        List<String> mBlindBoxManageList = new ArrayList<String>();
        double price = 100;
        double ApplePayPrice = price * .8;
        ChoosePay mChoosePay = new ChoosePay();
        // Line Pay
        mTextViewLinePay.setOnClickListener(v -> {
            mChoosePay.choosePay(new PayStrategy.LinePay());
            mTextViewShowPrice.setText("" + mChoosePay.PayName_Price(price));

            String randomNumber = String.valueOf(new Date().getTime() % 3);
            if (randomNumber.equals("0")) {
                mTextViewShowCommodity.setText(mBlindBoxA);
            } else if (randomNumber.equals("1")) {
                mTextViewShowCommodity.setText(mBlindBoxB);
            } else if (randomNumber.equals("2")) {
                mTextViewShowCommodity.setText(mBlindBoxC);
            }

            mBlindBoxManageList.add(CommodityFactory.createToy("ToyCar").Type() + " + " + CommodityFactory.createBox("Paper").Type());
            mTextViewShowBlindBoxManage.setText(mBlindBoxManageList.get(0));
        });
        // Apple Pay
        mTextViewApplePay.setOnClickListener(v -> {
            mChoosePay.choosePay(new PayStrategy.ApplePay());
            mTextViewShowPrice.setText("" + mChoosePay.PayName_Price(ApplePayPrice));

            String randomNumber = String.valueOf(new Date().getTime() % 3);
            if (randomNumber.equals("0")) {
                mTextViewShowCommodity.setText(mBlindBoxA);
            } else if (randomNumber.equals("1")) {
                mTextViewShowCommodity.setText(mBlindBoxB);
            } else if (randomNumber.equals("2")) {
                mTextViewShowCommodity.setText(mBlindBoxC);
            }

            mBlindBoxManageList.add(CommodityFactory.createToy("Robot").Type() + " + " + CommodityFactory.createBox("Glass").Type());
            mTextViewShowBlindBoxManage.setText(mBlindBoxManageList.get(0));
        });
        // Show Box Type
        mTextViewShowBoxType.setText(CommodityFactory.createBox("Paper").Type() + "\n" + CommodityFactory.createBox("Plastic").Type() + "\n" + CommodityFactory.createBox("Glass").Type());
        // Show Toy Type
        mTextViewShowToyType.setText(CommodityFactory.createToy("ToyCar").Type() + "\n" + CommodityFactory.createToy("Robot").Type() + "\n" + CommodityFactory.createToy("Doll").Type());
    }
}