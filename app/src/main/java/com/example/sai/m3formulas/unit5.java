package com.example.sai.m3formulas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class unit5 extends AppCompatActivity {
    PDFView unit5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit5);
        unit5 = (PDFView)findViewById(R.id.pdfunit5);
        unit5.fromAsset("unit 5.pdf").load();
    }
}
