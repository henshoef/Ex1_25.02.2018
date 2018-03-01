package com.example.android.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void onClick(View v){
        RelativeLayout rn=(RelativeLayout)findViewById(R.id.relative);
        LinearLayout ln=(LinearLayout)findViewById(R.id.linear2);
        ln.setVisibility(View.GONE);
        rn.setVisibility(View.VISIBLE);

    }
    public void onClick1(View v){
        RelativeLayout rn=(RelativeLayout)findViewById(R.id.relative);
        LinearLayout ln=(LinearLayout)findViewById(R.id.linear2);
        ln.setVisibility(View.VISIBLE);
        rn.setVisibility(View.GONE);


    }
}
