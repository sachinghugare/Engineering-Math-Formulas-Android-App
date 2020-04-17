package com.example.sai.m3formulas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class m12 extends AppCompatActivity {
    PDFView m12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m12);
        m12 = (PDFView)findViewById(R.id.m12);
        m12.fromAsset("m12.pdf").load();
    }
}
