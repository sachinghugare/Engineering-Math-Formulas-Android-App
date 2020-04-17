package com.example.sai.m3formulas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class m15 extends AppCompatActivity {
    PDFView m15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m15);
        m15 = (PDFView)findViewById(R.id.m15);
        m15.fromAsset("m15.pdf").load();
    }
}
