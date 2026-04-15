package com.example.a0407_addis_check_application;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a0407_addis_check_application.DS.Decorate;
import com.example.a0407_addis_check_application.DS.Factory;
import com.example.a0407_addis_check_application.DS.Observer;
import com.example.a0407_addis_check_application.DS.Singleton;
import com.example.a0407_addis_check_application.DS.Strategy;
import com.example.a0407_addis_check_application.DS.StrategyContext;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Singleton
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.hashCode());
        //Factory
//        Factory.createCan("Corn").Type();
//        Factory.createCan("Fish").Type();
        //Abstract Factory
        Factory.SquareCornFactory squareCornFactory = new Factory.SquareCornFactory();
        squareCornFactory.createCan().Type();
        squareCornFactory.createType().Shape();
        Factory.CircleFishFactory circleFishFactory = new Factory.CircleFishFactory();
        circleFishFactory.createCan().Type();
        circleFishFactory.createType().Shape();
        // Obeserver
        Observer.Subject subject = new Observer.Subject();
        Observer o1 = new Observer();
        subject.add(o1);
        subject.notifyObserver();
        // Decorate
        Decorate.Tree chrisMasTree = new Decorate.ChrisMasTree();
        chrisMasTree = new Decorate.LumpTree(chrisMasTree);
        chrisMasTree.Type();
        //Strategy
        StrategyContext strategyContext = new StrategyContext();
        strategyContext.choosePay(new Strategy.LinePay());
        strategyContext.Price();
    }
}