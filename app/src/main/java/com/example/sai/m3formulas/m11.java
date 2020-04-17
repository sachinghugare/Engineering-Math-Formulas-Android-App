package com.example.sai.m3formulas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class m11 extends AppCompatActivity {
PDFView m11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m11);
        m11 = (PDFView)findViewById(R.id.m11);
        m11.fromAsset("m11.pdf").load();
    }
}
