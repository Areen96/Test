package com.example.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void pullDown2(){
        int i = 90;
        int ii = 300;
        String name = "Areen Zyoud!!";
        if(i >= 100)
            name = "Areen";

    }

    private void makeAChange(){}
}
