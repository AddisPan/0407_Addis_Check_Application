package com.example.a0407_addis_check_application;

import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
        //setContentView(R.layout.layout_test);
        // 建立一個容器
        LinearLayout mLinearLayout = new LinearLayout(this);
        mLinearLayout.setOrientation(LinearLayout.HORIZONTAL);
        mLinearLayout.setBackgroundColor(Color.parseColor("#161616"));
        // LinearLayout 的寬高
        // Java 預設單位是 px, 用 Helper 轉成 dp
        int mLinearLayout_height = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 44, getResources().getDisplayMetrics());
        int mMarginTop = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 18.67f, getResources().getDisplayMetrics());

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                mLinearLayout_height
        );
        layoutParams.topMargin = mMarginTop;
        mLinearLayout.setLayoutParams(layoutParams);

        //建立一個textview
        TextView mTextView = new TextView(this);
        mTextView.setText("標題文字");
        mTextView.setTextColor(Color.WHITE);
        mTextView.setTextSize(24);
        mTextView.setGravity(Gravity.CENTER);
        //  設定 weight
        LinearLayout.LayoutParams textParams = new LinearLayout.LayoutParams(
                0,
                ViewGroup.LayoutParams.MATCH_PARENT,
                1.0f
        );
        mTextView.setLayoutParams(textParams);

        // 設定圖片
        ImageView mImageView = new ImageView(this);
        mImageView.setId(R.id.id_mode_imageview_search0);
        mImageView.setImageResource(R.drawable.search);

        int imgSize = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 28, getResources().getDisplayMetrics());
        LinearLayout.LayoutParams imageview_Params = new LinearLayout.LayoutParams(
                imgSize,
                imgSize
        );
        imageview_Params.gravity = Gravity.CENTER;
        mImageView.setLayoutParams(imageview_Params);

        // 加進 LinearLayout
        mLinearLayout.addView(mTextView);
        mLinearLayout.addView(mImageView);
        setContentView(mLinearLayout);
    }
}