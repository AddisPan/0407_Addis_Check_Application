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
        // 先裝飾者模式 一樣Log顯示 18:02 完成 18:11
        Decorate.Tree mTree = new Decorate.ChrisTree();
        mTree = new Decorate.LumpChrisTree(mTree);
        mTree.Type();
        mTree = new Decorate.LumpBallChrisTree(mTree);
        mTree.Type();
    }
}