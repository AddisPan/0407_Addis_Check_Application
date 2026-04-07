package com.example.a0407_addis_check_application;

import android.os.Bundle;
import android.widget.TextView;

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
        // 策略模式 先顯示在Activity上 18:28  完成 18:35
        TextView mTextViewLinePay = findViewById(R.id.id_textview_line_pay);
        TextView mTextViewApplePay = findViewById(R.id.id_textview_apple_pay);
        TextView mTextViewShow = findViewById(R.id.id_textview_show);
        StrategyContext mStrategyContext = new StrategyContext();
        mStrategyContext.chooseStrategy(new Strategy.LinePay());
        mTextViewLinePay.setOnClickListener(v->{
            mTextViewShow.setText("Line Pay " + mStrategyContext.pay(100));
        });
        mStrategyContext.chooseStrategy(new Strategy.ApplePay());
        mTextViewApplePay.setOnClickListener(v->{
            mTextViewShow.setText("Apple Pay " + mStrategyContext.pay(100));
        });
    }
}