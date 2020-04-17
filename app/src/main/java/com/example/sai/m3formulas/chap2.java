package com.example.sai.m3formulas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chap2 extends AppCompatActivity {
    public Button button;
    public Button button8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chap2);
        OnButtonClickListener1();
        OnButtonClickListener2();
        }


    private void OnButtonClickListener1(){
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(chap2.this,unit2a.class);
                startActivity(intent1);

            }
        });
    }

    private void OnButtonClickListener2(){
        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(chap2.this,unit2b.class);
                startActivity(intent2);

            }
        });
    }




}
