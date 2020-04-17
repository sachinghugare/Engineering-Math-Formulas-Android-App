package com.example.sai.m3formulas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class m24 extends AppCompatActivity {
    PDFView m24;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m24);
        m24 = (PDFView)findViewById(R.id.m24);
        m24.fromAsset("m24.pdf").load();
    }
}
