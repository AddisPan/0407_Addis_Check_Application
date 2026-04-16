package com.example.a0407_addis_check_application;

public class BlindBoxDecorate {
    public abstract static class BlindBoxBase {
        public abstract String Show();
    }

    public static class BlindBox extends BlindBoxBase {
        @Override
        public String Show() {
            return "這是盲盒";
        }
    }

    public abstract static class DecorateBase extends BlindBoxBase {
        protected BlindBoxBase mBlindBoxBase = null;

        public DecorateBase(BlindBoxBase blindBoxBase) {
            mBlindBoxBase = blindBoxBase;
        }
    }

    public static class PlasticBlindBox extends DecorateBase {
        public PlasticBlindBox(BlindBoxBase blindBoxBase) {
            super(blindBoxBase);
        }

        @Override
        public String Show() {
            return mBlindBoxBase.Show() + " + 塑膠袋";
        }
    }
}
