package com.example.a0407_addis_check_application;

public class CommodityFactory {
    public abstract static class Box {
        public abstract String Type();
    }

    public abstract static class Bag {
        public abstract String Type();
    }

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

    private static class PlasticBag extends Bag {
        @Override
        public String Type() {
            return "塑膠袋";
        }
    }

    public abstract static class createBoxBagFactory {
        public abstract Box createBox();

        public abstract Bag createBag();
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
