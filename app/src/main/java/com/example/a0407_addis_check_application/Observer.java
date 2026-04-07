package com.example.a0407_addis_check_application;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Observer {
    public static class Subject {
        private static List<Observer> mObservers = new ArrayList<Observer>();

        public void add(Observer observer) {
            mObservers.add(observer);
        }

        public void notifyObservers() {
            for (Observer observer : mObservers) {
                observer.update();
            }
        }
    }
    private static String update() {
        Log.d("Addis", "更新");
        return "收到更新";
    }
}
