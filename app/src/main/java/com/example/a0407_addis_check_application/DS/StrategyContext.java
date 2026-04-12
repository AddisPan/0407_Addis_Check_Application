package com.example.a0407_addis_check_application.DS;

public class StrategyContext {
    private Strategy.StrategyBase mStrategyBase = null;

    public void chooseStrategy(Strategy.StrategyBase strategyBase) {
        mStrategyBase = strategyBase;
    }

    public String calculate() {
        return mStrategyBase.calculate();
    }
}
