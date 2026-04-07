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
        // 策略模式 先顯示在Log上 18:21  完成 18:27
        StrategyContext mStrategyContext = new StrategyContext();
        mStrategyContext.chooseStrategy(new Strategy.LinePay());
        mStrategyContext.pay(100);
        mStrategyContext.chooseStrategy(new Strategy.ApplePay());
        mStrategyContext.pay(100);
    }
}