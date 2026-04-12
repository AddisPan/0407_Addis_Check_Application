package com.example.a0407_addis_check_application;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.a0407_addis_check_application.DS.AbstractFactory;
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
        // Singleton
        Singleton mSingleton = Singleton.getmInstance();
        System.out.println(mSingleton.hashCode());

        //Factory
//        TextView mTextViewCreateLittle = findViewById(R.id.id_factory_create_little);
//        TextView mTextViewCreateBig = findViewById(R.id.id_factory_create_big);
//        TextView mTextViewResult = findViewById(R.id.id_factory_result);
//
//        Factory mFactory = new Factory();
//        mTextViewCreateLittle.setOnClickListener(v->{
//            String s;
//             s = mFactory.create("little").Size();
//            mTextViewResult.setText(s);
//        });
//        mTextViewCreateBig.setOnClickListener(v->{
//            String s;
//            s = mFactory.create("big").Size();
//            mTextViewResult.setText(s);
//        });

//        //AbstractFactory
//        TextView mTextViewBeefNoddle = findViewById(R.id.id_factory_create_beefNoddle);
//        TextView mTextViewPlainNoddle = findViewById(R.id.id_factory_create_plainNoddle);
//        TextView mTextViewResult = findViewById(R.id.id_abstract_factory_result);
//        AbstractFactory.BeefNoddleFactory mBeefNoddleFactory = new AbstractFactory.BeefNoddleFactory();
//        AbstractFactory.PlainNoddleFactory mPlainNoddleFactory = new AbstractFactory.PlainNoddleFactory();
//
//        mTextViewBeefNoddle.setOnClickListener(v->{
//            mTextViewResult.setText(mBeefNoddleFactory.createNoddle().Spec() + " " + mBeefNoddleFactory.createSoup().Spec());
//        });
//        mTextViewPlainNoddle.setOnClickListener(v->{
//            mTextViewResult.setText(mPlainNoddleFactory.createNoddle().Spec() + " " + mPlainNoddleFactory.createSoup().Spec());
//        });
//
//        //Observer
//        Observer.Subject mSubject = new Observer.Subject();
//        Observer mObserverA = new Observer();
//        Observer mObserverB = new Observer();
//        mSubject.addObservers(mObserverA);
//        mSubject.addObservers(mObserverB);
//        mSubject.notifyObservers();

        //Strategy
        TextView mTextViewA = findViewById(R.id.id_strategy_a);
        TextView mTextViewB = findViewById(R.id.id_strategy_b);
        TextView mTextViewResult = findViewById(R.id.id_result);

//        StrategyContext mStrategyContext = new StrategyContext();
//        mTextViewA.setOnClickListener(v->{
//            mStrategyContext.chooseStrategy(new Strategy.A());
//            mTextViewResult.setText(" " + mStrategyContext.calculate());
//        });
//        mTextViewB.setOnClickListener(v->{
//            mStrategyContext.chooseStrategy(new Strategy.B());
//            mTextViewResult.setText(" " + mStrategyContext.calculate());
//        });
        Decorate.Tree mTree = new Decorate.ChrisMasTree();
        mTextViewResult.setText(mTree.Type());
        mTree = new Decorate.LumpChrisMasTree(mTree);
        Decorate.Tree finalMTree = mTree;
        mTextViewA.setOnClickListener(v->{
            mTextViewResult.setText(finalMTree.Type());
        });
    }
}