package com.example.a0407_addis_check_application;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Reformat 13:42 完成 13:46
        TextView mTextViewTimeButton = findViewById(R.id.id_textview_time_button);
        TextView mTextViewTimeShow = findViewById(R.id.id_textview_time_show);
        TextView mTextViewObserverA = findViewById(R.id.id_textview_observerA);
        TextView mTextViewObserverB = findViewById(R.id.id_textview_obseverB);
        mTextViewTimeButton.setOnClickListener(v -> {
            mTextViewTimeShow.setText(String.valueOf(new Date().getTime()));
        });
        Observer.Subject mSubject = new Observer.Subject();
        Observer mObserverA = new Observer();
        Observer mObserverB = new Observer();
        mSubject.add(mObserverA);
        mSubject.add(mObserverB);
        mSubject.notifyObservers();
        mTextViewObserverA.setText(mObserverA.update());
        mTextViewObserverB.setText(mObserverB.update());
    }
}