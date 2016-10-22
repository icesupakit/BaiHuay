package com.example.baihuay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class Random extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);

        TextView v1 = (TextView) findViewById(R.id.textView1);
        TextView v2 = (TextView) findViewById(R.id.textView2);
        Huay h = new Huay();

        Intent intent = getIntent();
        String str = intent.getStringExtra("Bai");

        if (str.equals("Two")) {

            v1.setText("เลขท้าย 2 ตัว");
            v2.setText(h.getRandomTwoDidgits());

        } else if (str.equals("Three")) {

            v1.setText("เลขท้าย 3 ตัว");
            v2.setText(h.getRandomThreeDidgits());
        }


    }
}