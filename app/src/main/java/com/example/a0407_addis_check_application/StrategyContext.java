package com.example.a0407_addis_check_application;

public class StrategyContext {
    Strategy.Pay mPay = null;

    public void chooseStrategy(Strategy.Pay pay) {
        mPay = pay;
    }

    public void pay(int price) {
        if (mPay != null) {
            mPay.Price(price);
        }
    }
}
