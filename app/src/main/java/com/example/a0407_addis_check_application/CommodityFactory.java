package com.example.a0407_addis_check_application;

public class CommodityFactory {
    public abstract static class Toy {
        public abstract String Type();
    }

    public abstract static class Box {
        public abstract String Type();
    }

    public abstract static class Bag {
        public abstract String Type();
    }

    //Toy
    private static class ToyCar extends Toy {
        @Override
        public String Type() {
            return "玩具車";
        }
    }

    private static class Robot extends Toy {
        @Override
        public String Type() {
            return "機器人";
        }
    }

    private static class Doll extends Toy {
        @Override
        public String Type() {
            return "娃娃";
        }
    }

    //Box
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
    public Toy createToy(String s) {
        Toy mToy = null;
        switch (s) {
            case "ToyCar":
                mToy = new ToyCar();
                break;
            case "Robot":
                mToy = new Robot();
                break;
            case "Doll":
                mToy = new Doll();
                break;
        }
        return mToy;
    }

    public Box createBox(String s) {
        Box mBox = null;
        switch (s) {
            case "Paper":
                mBox = new PaperBox();
                break;
            case "Plastic":
                mBox = new PlasticBox();
                break;
            case "Glass":
                mBox = new GlassBox();
                break;
        }
        return mBox;
    }

    public abstract static class createBlindBox {
        public abstract Toy createToy();

        public abstract Box createBox();
    }

    public static class ToyCarPaperBox extends createBlindBox {
        @Override
        public Toy createToy() {
            return new ToyCar();
        }

        @Override
        public Box createBox() {
            return new PaperBox();
        }
    }

    public static class RobotPlasticBox extends createBlindBox {
        @Override
        public Toy createToy() {
            return new Robot();
        }

        @Override
        public Box createBox() {
            return new PlasticBox();
        }
    }

    public static class DollGlassBox extends createBlindBox {
        @Override
        public Toy createToy() {
            return new Doll();
        }

        @Override
        public Box createBox() {
            return new GlassBox();
        }
    }

    public abstract static class createBoxBagFactory {
        public abstract Box createBox();

        public abstract Bag createBag();
    }

    public static class Store extends createBoxBagFactory {
        @Override
        public Box createBox() {
            return new PaperBox();
        }

        @Override
        public Bag createBag() {
            return new PlasticBag();
        }
    }
}
