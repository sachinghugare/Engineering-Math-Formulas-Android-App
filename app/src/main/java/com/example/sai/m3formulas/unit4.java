package com.example.sai.m3formulas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class unit4 extends AppCompatActivity {
    PDFView unit4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit4);
        unit4 = (PDFView)findViewById(R.id.pdfunit4);
        unit4.fromAsset("unit 4.pdf").load();
    }
}
