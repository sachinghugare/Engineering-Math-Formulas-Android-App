package com.example.sai.m3formulas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class m2 extends AppCompatActivity {
    public Button button31,button32,button33,button34,button35,button36,button37;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m2);
        OnButtonClickListener31();
        OnButtonClickListener32();
        OnButtonClickListener33();
        OnButtonClickListener34();
        OnButtonClickListener35();
        OnButtonClickListener36();

    }

    private void OnButtonClickListener31() {
        button31 = (Button) findViewById(R.id.button31);
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent31 = new Intent(m2.this,m21.class);
                startActivity(intent31);

            }
        });
    }

    private void OnButtonClickListener32() {
        button32 = (Button) findViewById(R.id.button32);
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent32 = new Intent(m2.this,m22.class);
                startActivity(intent32);

            }
        });
    }
    private void OnButtonClickListener33() {
        button33 = (Button) findViewById(R.id.button33);
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent33 = new Intent(m2.this,m23.class);
                startActivity(intent33);

            }
        });
    }
    private void OnButtonClickListener34() {
        button34 = (Button) findViewById(R.id.button34);
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent34 = new Intent(m2.this,m24.class);
                startActivity(intent34);

            }
        });
    }
    private void OnButtonClickListener35() {
        button35 = (Button) findViewById(R.id.button35);
        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent35 = new Intent(m2.this,m25.class);
                startActivity(intent35);

            }
        });
    }
    private void OnButtonClickListener36() {
        button36 = (Button) findViewById(R.id.button36);
        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent36 = new Intent(m2.this,m26.class);
                startActivity(intent36);

            }
        });
    }


}
