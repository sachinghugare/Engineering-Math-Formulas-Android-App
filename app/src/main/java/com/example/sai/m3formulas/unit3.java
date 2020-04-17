package com.example.sai.m3formulas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class unit3 extends AppCompatActivity {
    PDFView unit3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit3);
        unit3 = (PDFView)findViewById(R.id.pdfunit3);
        unit3.fromAsset("unit 3.pdf").load();
    }
}
