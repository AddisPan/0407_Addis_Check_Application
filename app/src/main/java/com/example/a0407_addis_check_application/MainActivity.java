package com.example.a0407_addis_check_application;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 修改命名的方式 加上修飾符 Reformat  13:48 完成 13:50
        TextView mTextViewShow = findViewById(R.id.id_textview_show);
        TextView mTextViewPlus = findViewById(R.id.id_textview_plus);
        TextView mTextViewResult = findViewById(R.id.id_textview_result);

        Decorate.Tree mTree = new Decorate.ChrisMasTree();
        mTree = new Decorate.LumpChrisMasTree(mTree);
        Decorate.Tree finalMTree = mTree;
        mTextViewShow.setOnClickListener(v -> {
            mTextViewResult.setText(finalMTree.Type());
        });
        mTree = new Decorate.LumpBallChrisMasTree(mTree);
        mTextViewResult.setText(mTree.Type());
        Decorate.Tree finalMTree1 = mTree;
        mTextViewPlus.setOnClickListener(v -> {
            mTextViewResult.setText(finalMTree1.Type());
        });
    }
}