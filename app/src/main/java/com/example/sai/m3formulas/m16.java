package com.example.sai.m3formulas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class m16 extends AppCompatActivity {
    PDFView m16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m16);
        m16 = (PDFView)findViewById(R.id.m16);
        m16.fromAsset("m16.pdf").load();
    }
}
