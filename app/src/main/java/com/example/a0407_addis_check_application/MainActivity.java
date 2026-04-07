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
        // 先裝飾者模式 顯示在Activity上 18:11 完成 18:19
        TextView mTextViewShow  = findViewById(R.id.id_textview_show);
        TextView mTextViewPlus = findViewById(R.id.id_textview_plus);
        TextView mTextViewResult = findViewById(R.id.id_textview_result);

        Decorate.Tree mTree = new Decorate.ChrisTree();
        mTree = new Decorate.LumpChrisTree(mTree);
        Decorate.Tree finalMTree = mTree;
        mTextViewShow.setOnClickListener(v->{
            mTextViewResult.setText(finalMTree.Type());
        });
        mTree = new Decorate.LumpBallChrisTree(mTree);
        mTextViewResult.setText(mTree.Type());
        Decorate.Tree finalMTree1 = mTree;
        mTextViewPlus.setOnClickListener(v->{
            mTextViewResult.setText(finalMTree1.Type());
        });
    }
}