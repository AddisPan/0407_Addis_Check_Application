package com.example.a0407_addis_check_application.DS;

public class Decorate {
    public abstract static class Tree{
        public abstract String Type();
    }
    public static class ChrisMasTree extends Tree{
        @Override
        public String Type() {
            return "聖誕樹";
        }
    }
    public abstract static class DecorateBase extends Tree{
        protected Tree mTree = null;
        public DecorateBase(Tree tree){
            mTree = tree;
        }
    }
    public static class LumpChrisMasTree extends DecorateBase{
        public LumpChrisMasTree(Tree tree) {
            super(tree);
        }

        @Override
        public String Type() {
            return mTree.Type() + "燈泡";
        }
    }
}
