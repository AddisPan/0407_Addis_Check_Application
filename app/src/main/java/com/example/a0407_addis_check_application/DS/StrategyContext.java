package com.example.a0407_addis_check_application.DS;

public class StrategyContext {
    private Strategy.Pay mPay = null;
    public void choosePay(Strategy.Pay pay){
        mPay = pay;
    }
    public String Price(){
        mPay.Type();
        return "100";
    }
}
