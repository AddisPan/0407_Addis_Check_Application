package com.example.a0407_addis_check_application;

import android.util.Log;

public class Factory {
    public abstract static class Food {
        public abstract void Type();
    }

    protected static class Corn extends Food {
        @Override
        public void Type() {
            Log.d("Addis", "玉米罐頭");
        }
    }

    protected static class Fish extends Food {
        @Override
        public void Type() {
            Log.d("Addis", "紅燒魚罐頭");
        }
    }

    public static Food createFood(String s) {
        Food mFood = null;
        if (s.equals("Corn")) {
            mFood = new Corn();
        } else if (s.equals("Fish")) {
            mFood = new Fish();
        }
        return mFood;
    }
}
