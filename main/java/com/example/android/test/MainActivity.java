package com.example.android.test;

import android.content.Intent;
import android.graphics.drawable.TransitionDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn5=(Button)findViewById(R.id.button5);
        TransitionDrawable transition = (TransitionDrawable)btn5.getBackground();
        transition.startTransition(500);
        Button btn4=(Button)findViewById(R.id.button4);
        TransitionDrawable transition2 = (TransitionDrawable)btn4.getBackground();
        transition2.startTransition(500);
        Button btn1=(Button)findViewById(R.id.button1);
        btn1.setEnabled(false);
    }

    public void onClickSideWalk(View v){
        Button btn2=(Button)findViewById(R.id.button2);
        Button btn1=(Button)findViewById(R.id.button1);
        Button btn4=(Button)findViewById(R.id.button4);
        Button btn5=(Button)findViewById(R.id.button5);
        Button btn3=(Button)findViewById(R.id.button3);
        TransitionDrawable transition = (TransitionDrawable)btn5.getBackground();
        transition.startTransition(500);
        TransitionDrawable transition2 = (TransitionDrawable)btn4.getBackground();
        transition2.startTransition(500);
        TransitionDrawable transition3 = (TransitionDrawable)btn3.getBackground();
        transition3.reverseTransition(500);
       Button btn6=(Button)findViewById(R.id.button6);
        TransitionDrawable transition4 = (TransitionDrawable)btn6.getBackground();
        transition4.reverseTransition(500);
        btn2.setEnabled(true);
        btn1.setEnabled(false);



    }
    public void onClickCarTrafiicLight(View v){
        Button btn2=(Button)findViewById(R.id.button2);
        Button btn1=(Button)findViewById(R.id.button1);
        btn1.setEnabled(true);
        btn2.setEnabled(false);
         Button btn6=(Button)findViewById(R.id.button6);
        Button btn4=(Button)findViewById(R.id.button4);
        Button btn5=(Button)findViewById(R.id.button5);
        Button btn3=(Button)findViewById(R.id.button3);
        TransitionDrawable transition = (TransitionDrawable)btn5.getBackground();
        transition.reverseTransition(500);
        TransitionDrawable transition2 = (TransitionDrawable)btn4.getBackground();
        transition2.reverseTransition(500);
        TransitionDrawable transition3 = (TransitionDrawable)btn3.getBackground();
        transition3.startTransition(500);
        TransitionDrawable transition4 = (TransitionDrawable)btn6.getBackground();
        transition4.startTransition(500);

    }




}
