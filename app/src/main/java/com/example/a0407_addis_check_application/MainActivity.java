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
        // 先做觀察者模式(用Log顯示) 17:44 完成 17:49
        Observer.Subject mSubject = new Observer.Subject();
        Observer mObserverA = new Observer();
        Observer mObserverB = new Observer();
        mSubject.add(mObserverA);
        mSubject.add(mObserverB);
        mSubject.notifyObservers();
    }
}