package com.example.a0407_addis_check_application.DS;

public class AbstractFactory {
    public abstract static class Noddle{
        public abstract String Spec();
    }
    public abstract static class Soup{
        public abstract String Spec();
    }
    private static class BeefNoddle extends Noddle{
        @Override
        public String Spec() {
            return "牛肉麵";
        }
    }
    private static class PlainNoddle extends Noddle{
        @Override
        public String Spec() {
            return "陽春麵";
        }
    }
    private static class RedSoup extends Soup{
        @Override
        public String Spec() {
            return "紅燒";
        }
    }
    private static class ClearSoup extends Soup{
        @Override
        public String Spec() {
            return "清湯";
        }
    }
    public abstract static class FactoryBase{
        public abstract Noddle createNoddle();
        public abstract Soup createSoup();
    }
    public static class BeefNoddleFactory extends FactoryBase{
        @Override
        public Noddle createNoddle() {
            return new BeefNoddle();
        }

        @Override
        public Soup createSoup() {
            return new RedSoup();
        }
    }
    public static class PlainNoddleFactory extends FactoryBase{
        @Override
        public Noddle createNoddle() {
            return new PlainNoddle();
        }

        @Override
        public Soup createSoup() {
            return new ClearSoup();
        }
    }
}
