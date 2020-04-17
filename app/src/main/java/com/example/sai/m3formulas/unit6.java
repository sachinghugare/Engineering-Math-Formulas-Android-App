package com.example.sai.m3formulas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class unit6 extends AppCompatActivity {
    PDFView unit6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit6);
        unit6 = (PDFView)findViewById(R.id.pdfunit6);
        unit6.fromAsset("unit 6.pdf").load();
    }
}
