package com.example.a0407_addis_check_application;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 畫面上有一顆「使用LinePay購買盲盒」按鈕，點擊使用指定付款方式獲得商品，並將商品放入盲盒管理元件 開始 15:15  結束 15:30
        TextView mTextViewLinePay = findViewById(R.id.id_button_line_pay);
        TextView mTextViewApplePay = findViewById(R.id.id_button_apple_pay);
        TextView mTextViewShowPrice = findViewById(R.id.id_show_price);
        TextView mTextViewShowCommodity = findViewById(R.id.id_show_commodity);
        TextView mTextViewShowBoxType = findViewById(R.id.id_show_box_type);
        TextView mTextViewShowToyType = findViewById(R.id.id_show_toy_type);
        TextView mTextViewShowBlindBoxManage = findViewById(R.id.id_show_blind_box_manage);

        List<String> mBlindBoxManageList = new ArrayList<String>();
        double price = 100;
        double ApplePayPrice = price * .8;
        ChoosePay mChoosePay = new ChoosePay();
        // Line Pay
        mTextViewLinePay.setOnClickListener(v -> {
            mChoosePay.choosePay(new PayStrategy.LinePay());
            mTextViewShowPrice.setText("" + mChoosePay.PayName_Price(price));

            CommodityFactory.Store mStore = new CommodityFactory.Store();
            mTextViewShowCommodity.setText(CommodityFactory.createToy("ToyCar").Type() + " + " + CommodityFactory.createBox("Paper").Type() + " + " + mStore.createBag().Type());
            mBlindBoxManageList.add(CommodityFactory.createToy("ToyCar").Type() + " + " + CommodityFactory.createBox("Paper").Type());
            mTextViewShowBlindBoxManage.setText(mBlindBoxManageList.get(0));
//            BlindBoxManage blindBoxManage = BlindBoxManage.saveIntoBlindBoxManage();
//            mTextViewShowBlindBoxManage.setText(blindBoxManage.hashCode());
        });
        // Apple Pay
        mTextViewApplePay.setOnClickListener(v -> {
            mChoosePay.choosePay(new PayStrategy.ApplePay());
            mTextViewShowPrice.setText("" + mChoosePay.PayName_Price(ApplePayPrice));
        });
        // Show Box Type
        mTextViewShowBoxType.setText(CommodityFactory.createBox("Paper").Type() + "\n" + CommodityFactory.createBox("Plastic").Type() + "\n" + CommodityFactory.createBox("Glass").Type());
        // Show Toy Type
        mTextViewShowToyType.setText(CommodityFactory.createToy("ToyCar").Type() + "\n" + CommodityFactory.createToy("Robot").Type() + "\n" + CommodityFactory.createToy("Doll").Type());
    }
}