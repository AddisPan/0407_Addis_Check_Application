package com.example.a0407_addis_check_application;

public class CommodityFactory {
    public abstract static class Toy{
        public abstract String Type();
    }
    public abstract static class Box {
        public abstract String Type();
    }

    public abstract static class Bag {
        public abstract String Type();
    }
    //Toy
    private static class ToyCar extends Toy{
        @Override
        public String Type() {
            return "玩具車";
        }
    }
    private static class Robot extends Toy{
        @Override
        public String Type() {
            return "機器人";
        }
    }
    private static class Doll extends Toy{
        @Override
        public String Type() {
            return "娃娃";
        }
    }
    //Box
    private static class BlindBox extends Box {
        @Override
        public String Type() {
            return "盲盒";
        }
    }

    private static class PaperBox extends Box {
        @Override
        public String Type() {
            return "紙盒";
        }
    }

    private static class PlasticBox extends Box {
        @Override
        public String Type() {
            return "塑膠盒";
        }
    }

    private static class GlassBox extends Box {
        @Override
        public String Type() {
            return "玻璃盒";
        }
    }
    //Bag
    private static class PlasticBag extends Bag {
        @Override
        public String Type() {
            return "塑膠袋";
        }
    }
    //生產
    public static Toy createToy(String s){
        Toy mToy = null;
        if (s.equals("ToyCar")) {
            mToy = new ToyCar();
        } else if (s.equals("Robot")) {
            mToy = new Robot();
        } else if (s.equals("Doll")) {
            mToy = new Doll();
        }
        return mToy;
    }
    public static Box createBox(String s) {
        Box mBox = null;
        if (s.equals("Paper")) {
            mBox = new PaperBox();
        } else if (s.equals("Plastic")) {
            mBox = new PlasticBox();
        } else if (s.equals("Glass")) {
            mBox = new GlassBox();
        }
        return mBox;
    }
    public abstract static class createBoxBagFactory {
        public abstract Box createBox();

        public abstract Bag createBag();
    }
    public static class Store extends createBoxBagFactory {
        @Override
        public Box createBox() {
            return new BlindBox();
        }

        @Override
        public Bag createBag() {
            return new PlasticBag();
        }
    }
}
