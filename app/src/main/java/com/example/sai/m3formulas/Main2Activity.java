package com.example.sai.m3formulas;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity  {
    public Button btn,btn1,btn2,about;

    public Button Btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        OnButtonClickListener();
        OnButtonClickListener1();
        OnButtonClickListener2();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);

        return true;
    }

    public void OnButtonClickListener(){

        btn = (Button)findViewById(R.id.button13);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m3 = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(m3);
            }
        });
    }

    public void OnButtonClickListener1(){

        btn1 = (Button)findViewById(R.id.button9);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m1 = new Intent(Main2Activity.this,m1.class);
                startActivity(m1);
            }
        });
    }
    public void OnButtonClickListener2(){

        btn2 = (Button)findViewById(R.id.button12);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m2 = new Intent(Main2Activity.this,m2.class);
                startActivity(m2);
            }
        });
    }




    @Override
    public void onBackPressed() {
            AlertDialog.Builder a_d = new AlertDialog.Builder(Main2Activity.this);
            a_d.setMessage("Do you want to close this app ? ")
                    .setCancelable(true)
                    .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    })
                    .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
            AlertDialog alert = a_d.create();
            alert.setTitle("Alert...  ");
            alert.show();

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.rate_us){
            Toast.makeText(this,"Rate Us Option Coming Soon....",Toast.LENGTH_SHORT).show();
        }

        if(item.getItemId()==R.id.share){
           Intent myintent = new Intent(Intent.ACTION_SEND);
           myintent.setType("Text/Plane");
           String shareBody = "Your Body Here";
           String shareSub = "your sub here";
           myintent.putExtra(Intent.EXTRA_SUBJECT,shareBody);
           myintent.putExtra(Intent.EXTRA_TEXT,shareBody);
           startActivity(Intent.createChooser(myintent,"Share Via ..."));
        }

        if(item.getItemId()==R.id.about){
            Intent intent5 = new Intent(Main2Activity.this,about.class);
            startActivity(intent5);
        }
        return super.onOptionsItemSelected(item);
    }

}
