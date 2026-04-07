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
        // 製作抽象工廠(Log能成功顯示) 顯示 17:25 完成 17:32
        TextView mTextViewCorn = findViewById(R.id.id_textview_corn);
        TextView mTextViewFish = findViewById(R.id.id_textview_fish);
        TextView mTextViewShow = findViewById(R.id.id_textview_show);

        Factory.CornFactory mCornFactory = new Factory.CornFactory();
        mCornFactory.createFood().Type();
        mCornFactory.createContainer().Type();
        Factory.FishFactory mFishFactory = new Factory.FishFactory();
        mFishFactory.createFood().Type();
        mFishFactory.createContainer().Type();
    }
}