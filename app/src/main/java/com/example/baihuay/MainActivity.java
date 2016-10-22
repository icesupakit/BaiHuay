package com.example.baihuay;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Random2 = (Button) findViewById(R.id.button1);
        Button Random3 = (Button) findViewById(R.id.button2);

        Random2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this,Random.class);
                intent.putExtra("Bai","Two");
                startActivity(intent);
            }
        });

        Random3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this,Random.class);
                intent.putExtra("Bai","Three");
                startActivity(intent);
            }
        });

    }
}
