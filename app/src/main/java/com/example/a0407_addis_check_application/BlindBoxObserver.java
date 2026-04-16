package com.example.a0407_addis_check_application;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class BlindBoxObserver {
    public static class BlindBoxManager {
        private List<BlindBoxObserver> mBlindBoxObservers = new ArrayList<BlindBoxObserver>();

        public void addObservers(BlindBoxObserver blindBoxObserver) {
            mBlindBoxObservers.add(blindBoxObserver);
        }

        public void notifyObservers() {
            for (BlindBoxObserver blindBoxObserver : mBlindBoxObservers) {
                blindBoxObserver.acceptUpdate();
            }
        }
    }

    public String acceptUpdate() {
        return "更新狀態";
    }
}
