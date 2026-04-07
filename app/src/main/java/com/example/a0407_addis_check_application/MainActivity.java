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
        // 先做工廠模式(用Log看是否能成功顯示出來) 17:07 完成 17:12
        Factory.createFood("Corn").Type();
        Factory.createFood("Fish").Type();
    }
}