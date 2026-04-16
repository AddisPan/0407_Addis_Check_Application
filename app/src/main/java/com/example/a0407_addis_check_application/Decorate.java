package com.example.a0407_addis_check_application;

import android.util.Log;

public class Decorate {
    public abstract static class Tree {
        public abstract String Type();
    }

    public static class ChrisMasTree extends Tree {
        @Override
        public String Type() {
            Log.d("Addis", "這是一個聖誕樹");
            return "這是一個聖誕樹";
        }
    }

    public abstract static class DecorateBase extends Tree {
        protected Tree mTree = null;

        public DecorateBase(Tree tree) {
            mTree = tree;
        }
    }

    public static class LumpChrisMasTree extends DecorateBase {
        public LumpChrisMasTree(Tree tree) {
            super(tree);
        }

        @Override
        public String Type() {
            mTree.Type();
            Log.d("Addis", " + 燈泡");
            return " + 燈泡";
        }
    }

    public static class LumpBallChrisMasTree extends DecorateBase {
        public LumpBallChrisMasTree(Tree tree) {
            super(tree);
        }

        @Override
        public String Type() {
            mTree.Type();
            Log.d("Addis", " + 聖誕球");
            return " + 聖誕球";
        }
    }
}
