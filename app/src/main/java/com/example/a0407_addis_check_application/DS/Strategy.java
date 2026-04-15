package com.example.a0407_addis_check_application.DS;

public class Strategy {
    public abstract static class Pay{
        public abstract String Type();
    }
    public static class LinePay extends Pay{
        @Override
        public String Type() {
            return "LinePay";
        }
    }
    public static class ApllePay extends Pay{
        @Override
        public String Type() {
            return "ApllePay";
        }
    }
}
