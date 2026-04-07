package com.example.a0407_addis_check_application;

import android.util.Log;

public class Factory {
    public abstract static class Food {
        public abstract String Type();
    }
    public abstract static class Contanier{
        public abstract String Type();
    }
    protected static class Corn extends Food {
        @Override
        public String Type() {
            Log.d("Addis", "玉米罐頭");
            return "玉米罐頭";
        }
    }

    protected static class Fish extends Food {
        @Override
        public String Type() {
            Log.d("Addis", "紅燒魚罐頭");
            return "紅燒魚罐頭";
        }
    }
    protected static class CircleContainer extends Contanier{
        @Override
        public String Type() {
            Log.d("Addis", "圓形容器");
            return "圓形容器";
        }
    }
    protected static class SquareContainer extends Contanier{
        @Override
        public String Type() {
            Log.d("Addis", "方形容器");
            return "方形容器";
        }
    }
    public abstract static class FoodFactory{
        public abstract Food createFood();
        public abstract Contanier createContainer();
    }
    public static class CornFactory extends FoodFactory{
        @Override
        public Food createFood() {
            return new Corn();
        }

        @Override
        public Contanier createContainer() {
            return new CircleContainer();
        }
    }
    public static class FishFactory extends FoodFactory{
        @Override
        public Food createFood() {
            return new Fish();
        }

        @Override
        public Contanier createContainer() {
            return new SquareContainer();
        }
    }
}
