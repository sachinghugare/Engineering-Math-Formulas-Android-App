package com.example.sai.m3formulas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class m25 extends AppCompatActivity {
    PDFView m25;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m25);
        m25 = (PDFView)findViewById(R.id.m25);
        m25.fromAsset("m25.pdf").load();
    }
}
