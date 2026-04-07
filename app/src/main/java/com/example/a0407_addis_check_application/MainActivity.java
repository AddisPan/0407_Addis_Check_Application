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
        // 成功顯示在Activity上 顯示 17:18 完成 17:24
        TextView mTextViewCorn = findViewById(R.id.id_textview_corn);
        TextView mTextViewFish = findViewById(R.id.id_textview_fish);
        TextView mTextViewShow = findViewById(R.id.id_textview_show);
        String s;
        s = Factory.createFood("Corn").Type();
        String finalS = s;
        mTextViewCorn.setOnClickListener(v->{
            mTextViewShow.setText(finalS);
        });
        s = Factory.createFood("Fish").Type();
        String finalS1 = s;
        mTextViewFish.setOnClickListener(v->{
            mTextViewShow.setText(finalS1);
        });
    }
}