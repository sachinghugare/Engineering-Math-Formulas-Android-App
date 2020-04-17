package com.example.sai.m3formulas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class m13 extends AppCompatActivity {
    PDFView m13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m13);
        m13 = (PDFView)findViewById(R.id.m13);
        m13.fromAsset("m13.pdf").load();
    }
}
