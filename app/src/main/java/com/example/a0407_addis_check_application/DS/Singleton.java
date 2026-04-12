package com.example.a0407_addis_check_application.DS;

public class Singleton {
    private static Singleton mInstance;

    private Singleton() {
    }

    public static Singleton getmInstance() {
        if (mInstance == null) {
            mInstance = new Singleton();
        }
        return mInstance;
    }
}
