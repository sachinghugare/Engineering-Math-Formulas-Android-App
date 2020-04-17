package com.example.sai.m3formulas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splashscreen);

        getSupportActionBar().hide();

        LogoLauncher logoLauncher = new LogoLauncher();
        logoLauncher.start();

    }

    private class LogoLauncher extends Thread {
        public void run(){
            try {
                sleep(3000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            Intent intent = new Intent(splashscreen.this , Main2Activity.class);
            startActivity(intent);
            splashscreen.this.finish();
        }
    }
}
