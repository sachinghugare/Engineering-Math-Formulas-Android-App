package com.example.sai.m3formulas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class m14 extends AppCompatActivity {
    PDFView m14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m14);
        m14 = (PDFView)findViewById(R.id.m14);
        m14.fromAsset("m14.pdf").load();
    }
}
