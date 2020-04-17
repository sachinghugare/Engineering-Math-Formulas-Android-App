package com.example.sai.m3formulas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class m23 extends AppCompatActivity {
    PDFView m23;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m23);
        m23 = (PDFView)findViewById(R.id.m23);
        m23.fromAsset("m23.pdf").load();
    }
}
