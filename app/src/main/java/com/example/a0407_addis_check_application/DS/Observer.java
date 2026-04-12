package com.example.a0407_addis_check_application.DS;

import java.util.ArrayList;
import java.util.List;

public class Observer {
    public static class Subject{
        private List<Observer> observers = new ArrayList<>();
        public void addObservers(Observer observer){
            observers.add(observer);
        }
        public void deleteObservers(Observer observer){
            observers.remove(observer);
        }
        public void notifyObservers(){
            for(Observer o:observers){
                o.update();
            }
        }
    }
    public String update(){
        return  "Update";
    }
}
