package com.example.a0407_addis_check_application.DS;

public class Strategy {
    public abstract static class StrategyBase{
        public abstract String calculate();
    }
    public static class A extends StrategyBase{
        @Override
        public String calculate() {
            return "100";
        }
    }
    public static class B extends StrategyBase{
        @Override
        public String calculate() {
            return "150";
        }
    }
    public static class C extends StrategyBase{
        @Override
        public String calculate() {
            return "200";
        }
    }
}
