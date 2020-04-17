package com.example.sai.m3formulas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class m26 extends AppCompatActivity {
    PDFView m26;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m26);
        m26 = (PDFView)findViewById(R.id.m26);
        m26.fromAsset("m26.pdf").load();
    }
}
