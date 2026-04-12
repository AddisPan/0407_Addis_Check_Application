package com.example.a0407_addis_check_application.DS;

public class Factory {
    public abstract static class WaterTower{
        public abstract String Size();
    }
    private static class LittleWaterTower extends WaterTower{
        @Override
        public String Size() {
            return "小水塔";
        }
    }
    private static class BigWaterTower extends WaterTower{
        @Override
        public String Size() {
            return  "大水塔";
        }
    }
    public WaterTower create(String s){
        WaterTower waterTower = null;
        if (s.equals("little")){
            waterTower = new LittleWaterTower();
        } else if (s.equals("big")) {
            waterTower = new BigWaterTower();
        }
        return waterTower;
    }
}
