package com.example.sai.m3formulas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class m22 extends AppCompatActivity {
    PDFView m22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m22);
        m22 = (PDFView)findViewById(R.id.m22);
        m22.fromAsset("m22.pdf").load();
    }
}
