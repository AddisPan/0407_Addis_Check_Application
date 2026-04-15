package com.example.a0407_addis_check_application.DS;

import android.annotation.SuppressLint;
import android.util.TypedValue;

public class Factory {
    public abstract static class Can{
        public abstract String Type();
    }
    public abstract static class Type{
        public abstract String Shape();
    }
    private static class Corn extends Can{
        @Override
        public String Type() {
            return "玉米";
        }
    }

    private static class Fish extends Can{
        @Override
        public String Type() {
            return "魚";
        }
    }

    private static class Square extends Type{
        @Override
        public String Shape() {
            return "方形";
        }
    }
    private static class Circle extends Type{
        @Override
        public String Shape() {
            return "圓型";
        }
    }
    public abstract static class FoodFactory{
        public abstract Can createCan();
        public abstract Type createType();
    }
    public static class SquareCornFactory extends FoodFactory{
        @Override
        public Can createCan() {
            return new Corn();
        }

        @Override
        public Type createType() {
            return new Square();
        }
    }
    public static class CircleFishFactory extends FoodFactory{
        @Override
        public Can createCan() {
            return new Fish();
        }

        @Override
        public Type createType() {
            return new Circle();
        }
    }
//    public static Can createCan(String s){
//        Can mCan = null;
//        if (s.equals("Corn")){
//            mCan = new Corn();
//        } else if (s.equals("Fish")) {
//            mCan = new Fish();
//        }
//        return mCan;
//    }
}
