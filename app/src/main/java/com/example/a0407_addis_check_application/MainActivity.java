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
        // 使用策略模式，設計付款方式，顯示在「付款明細區塊」 開始 16:44  結束 16:45
        TextView mTextViewLinePay = findViewById(R.id.id_button_line_pay);
        TextView mTextViewApplePay = findViewById(R.id.id_button_apple_pay);
        TextView mTextViewShowPrice = findViewById(R.id.id_show_price);
        TextView mTextViewShowCommodity = findViewById(R.id.id_show_commodity);
        TextView mTextViewShowBoxType = findViewById(R.id.id_show_box_type);
        TextView mTextViewShowToyType = findViewById(R.id.id_show_toy_type);
        TextView mTextViewShowBlindBoxManage = findViewById(R.id.id_show_blind_box_manage);

//        // 抽象工廠方法模式生產盲盒 隨機
        CommodityFactory.ToyCarPaperBox mToyCarPaperBox = new CommodityFactory.ToyCarPaperBox();
        CommodityFactory.RobotPlasticBox mRobotPlasticBox = new CommodityFactory.RobotPlasticBox();
        CommodityFactory.DollGlassBox mDollGlassBox = new CommodityFactory.DollGlassBox();
//        String mBlindBoxA = mToyCarPaperBox.createToy().Type() + " + " + mToyCarPaperBox.createBox().Type();
//        String mBlindBoxB = mRobotPlasticBox.createToy().Type() + " + " + mRobotPlasticBox.createBox().Type();
//        String mBlindBoxC = mDollGlassBox.createToy().Type() + " + " + mDollGlassBox.createBox().Type();

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
            mTextViewShowPrice.setText(" " + mChoosePay.PayName_Price(price));

            String randomNumber = String.valueOf(new Date().getTime() % 3);
            switch (randomNumber) {
                case "0":
                    mTextViewShowCommodity.setText(mBlindBoxA);
                    mTextViewShowBoxType.setText(mToyCarPaperBox.createBox().Type());
                    mTextViewShowToyType.setText(mToyCarPaperBox.createToy().Type());
                    break;
                case "1":
                    mTextViewShowCommodity.setText(mBlindBoxB);
                    mTextViewShowBoxType.setText(mRobotPlasticBox.createBox().Type());
                    mTextViewShowToyType.setText(mRobotPlasticBox.createToy().Type());
                    break;
                case "2":
                    mTextViewShowCommodity.setText(mBlindBoxC);
                    mTextViewShowBoxType.setText(mDollGlassBox.createBox().Type());
                    mTextViewShowToyType.setText(mDollGlassBox.createToy().Type());
                    break;
            }

            mBlindBoxManageList.add(mBlindBoxA);
            mTextViewShowBlindBoxManage.setText(mBlindBoxManageList.get(0));
        });
        // Apple Pay
        mTextViewApplePay.setOnClickListener(v -> {
            mChoosePay.choosePay(new PayStrategy.ApplePay());
            mTextViewShowPrice.setText(" " + mChoosePay.PayName_Price(ApplePayPrice));

            String randomNumber = String.valueOf(new Date().getTime() % 3);
            switch (randomNumber) {
                case "0":
                    mTextViewShowCommodity.setText(mBlindBoxA);
                    mTextViewShowBoxType.setText(mToyCarPaperBox.createBox().Type());
                    mTextViewShowToyType.setText(mToyCarPaperBox.createToy().Type());
                    break;
                case "1":
                    mTextViewShowCommodity.setText(mBlindBoxB);
                    mTextViewShowBoxType.setText(mRobotPlasticBox.createBox().Type());
                    mTextViewShowToyType.setText(mRobotPlasticBox.createToy().Type());
                    break;
                case "2":
                    mTextViewShowCommodity.setText(mBlindBoxC);
                    mTextViewShowBoxType.setText(mDollGlassBox.createBox().Type());
                    mTextViewShowToyType.setText(mDollGlassBox.createToy().Type());
                    break;
            }

            mBlindBoxManageList.add(mBlindBoxA);
            mTextViewShowBlindBoxManage.setText(mBlindBoxManageList.get(0));
        });
    }
}