package com.example.sai.m3formulas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class unit1 extends AppCompatActivity {
    PDFView unit1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit1);
        unit1 = (PDFView)findViewById(R.id.pdfunit1);
        unit1.fromAsset("unit 1.pdf").load();
    }
}
