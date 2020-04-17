package com.example.sai.m3formulas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;


public class m1 extends AppCompatActivity {
 public Button button21,button22,button23,button24,button25,button26,button27;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m1);
        OnButtonClickListener21();
        OnButtonClickListener22();
        OnButtonClickListener23();
        OnButtonClickListener24();
        OnButtonClickListener25();
        OnButtonClickListener26();
    }

    public void OnButtonClickListener21() {
        button21 = (Button) findViewById(R.id.button21);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent21 = new Intent(m1.this,m11.class);
                startActivity(intent21);

            }
        });
    }

    private void OnButtonClickListener22() {
        button22 = (Button) findViewById(R.id.button22);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent22 = new Intent(m1.this,m12.class);
                startActivity(intent22);

            }
        });
    }
    private void OnButtonClickListener23() {
        button23 = (Button) findViewById(R.id.button23);
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent23 = new Intent(m1.this,m13.class);
                startActivity(intent23);

            }
        });
    }
    private void OnButtonClickListener24() {
        button24= (Button) findViewById(R.id.button24);
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent24 = new Intent(m1.this,m14.class);
                startActivity(intent24);

            }
        });
    }
    private void OnButtonClickListener25() {
        button25 = (Button) findViewById(R.id.button25);
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent25 = new Intent(m1.this,m15.class);
                startActivity(intent25);

            }
        });
    }
    private void OnButtonClickListener26() {
        button26 = (Button) findViewById(R.id.button26);
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent26 = new Intent(m1.this,m16.class);
                startActivity(intent26);

            }
        });
    }


}
