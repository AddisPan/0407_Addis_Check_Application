package com.example.a0407_addis_check_application;

import android.util.Log;

public class Strategy {
    public abstract static class Pay{
        public abstract String Price(int price);
    }
    public static class LinePay extends Pay{
        @Override
        public String Price(int price) {
            price = 100;
            Log.d("Addis", "用 LinePay付了" + price);
            return "用 LinePay 付了 " + price;
        }
    }
    public static class ApplePay extends Pay{
        @Override
        public String Price(int price) {
            price = 100;
            Log.d("Addis", "用 ApplePay 付了" + price);
            return "用 ApplePay 付了 " + price;
        }
    }
}
