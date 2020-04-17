package com.example.sai.m3formulas;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    public Button button1;
    public Button button2;
    public Button button3;
    public Button button4;
    public Button button5;
    public Button button6;
    public Button button7;
    public Button button11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OnButtonClickListener1();
        OnButtonClickListener2();
        OnButtonClickListener3();
        OnButtonClickListener4();
        OnButtonClickListener5();
        OnButtonClickListener6();
        OnButtonClickListener7();

    }




    private void OnButtonClickListener1(){
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,unit1.class);
                startActivity(intent);

            }
        });
    }

    private void OnButtonClickListener2(){
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(".chap2");
                startActivity(intent);

            }
        });
    }


    private void OnButtonClickListener3(){
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this,unit3.class);
                startActivity(intent1);

            }
        });
    }

    private void OnButtonClickListener4(){
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this,unit4.class);
                startActivity(intent1);

            }
        });
    }

    private void OnButtonClickListener5() {
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this,unit5.class);
                startActivity(intent2);

            }
        });
    }

    private void OnButtonClickListener6() {
        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this,unit6.class);
                startActivity(intent3);

            }
        });
    }

    private void OnButtonClickListener7() {
        button11 = (Button) findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(MainActivity.this,basicformulae.class);
                startActivity(intent4);

            }
        });
    }

}