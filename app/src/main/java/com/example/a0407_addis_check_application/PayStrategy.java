package com.example.a0407_addis_check_application;

import android.util.Log;

public class PayStrategy {
    public abstract static class PayWay {
        public abstract String Way(double price);
    }

    protected static class LinePay extends PayWay {
        @Override
        public String Way(double price) {
            Log.d("Addis", "Line Pay" + price);
            return "Line Pay" + price;
        }
    }

    protected static class ApplePay extends PayWay {
        @Override
        public String Way(double price) {
            Log.d("Addis", "Apple Pay" + price);
            return "Apple Pay" + price;
        }
    }
}
