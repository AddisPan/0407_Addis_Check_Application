package com.example.a0407_addis_check_application.DS;

import java.util.ArrayList;
import java.util.List;

public class Observer {
    public static class Subject{
        private List<Observer> mObservers = new ArrayList<Observer>();
        public void add(Observer observer){
            mObservers.add(observer);
        }
        public void remove(Observer observer){
            mObservers.remove(observer);
        }
        public void notifyObserver(){
            for (Observer observer : mObservers){
                observer.update();
            }
        }
    }
    public String update(){
        return "更新";
    }
}
