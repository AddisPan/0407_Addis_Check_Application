package com.example.a0407_addis_check_application;

import android.util.Log;

public class Factory {
    public abstract static class Can {
        public abstract String Type();
    }

    public abstract static class Container {
        public abstract String Type();
    }

    protected static class Corn extends Can {
        @Override
        public String Type() {
            Log.d("Addis", "玉米罐頭");
            return "玉米罐頭";
        }
    }

    protected static class Fish extends Can {
        @Override
        public String Type() {
            Log.d("Addis", "紅燒魚罐頭");
            return "紅燒魚罐頭";
        }
    }

    protected static class CircleContainer extends Container {
        @Override
        public String Type() {
            Log.d("Addis", "圓形容器");
            return "圓形容器";
        }
    }

    protected static class SquareContainer extends Container {
        @Override
        public String Type() {
            Log.d("Addis", "方形容器");
            return "方形容器";
        }
    }

    public abstract static class FoodFactory {
        public abstract Can createFood();

        public abstract Container createContainer();
    }

    public static class CornFactory extends FoodFactory {
        @Override
        public Can createFood() {
            return new Corn();
        }

        @Override
        public Container createContainer() {
            return new CircleContainer();
        }
    }

    public static class FishFactory extends FoodFactory {
        @Override
        public Can createFood() {
            return new Fish();
        }

        @Override
        public Container createContainer() {
            return new SquareContainer();
        }
    }
}
