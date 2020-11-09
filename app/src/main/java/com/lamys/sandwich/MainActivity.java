package com.lamys.sandwich;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.lamys.sandwich.breads.Bread;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AbstractFactory breadFactory = FactoryGenerator.getFactory("BRE");
        Bread bread = breadFactory.getBread("BAG");

        Log.i("bread", "Name : " + bread.name());
    }
}