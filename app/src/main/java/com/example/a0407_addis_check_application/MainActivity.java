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
        // 修改 命名方式 跟 reformat 4/16 開始 13:38 完成 13:40
        TextView mTextViewCorn = findViewById(R.id.id_textview_corn);
        TextView mTextViewFish = findViewById(R.id.id_textview_fish);
        TextView mTextViewShow = findViewById(R.id.id_textview_show);

        final String[] s = {"", ""};
        Factory.CornFactory mCornFactory = new Factory.CornFactory();
        mCornFactory.createFood().Type();
        mCornFactory.createContainer().Type();
        mTextViewCorn.setOnClickListener(v -> {
            s[0] = mCornFactory.createFood().Type();
            s[1] = mCornFactory.createContainer().Type();
            mTextViewShow.setText(s[0] + "\n" + s[1]);
        });
        Factory.FishFactory mFishFactory = new Factory.FishFactory();
        mFishFactory.createFood().Type();
        mFishFactory.createContainer().Type();
        mTextViewFish.setOnClickListener(v -> {
            s[0] = mFishFactory.createFood().Type();
            s[1] = mFishFactory.createContainer().Type();
            mTextViewShow.setText(s[0] + "\n" + s[1]);
        });
    }
}