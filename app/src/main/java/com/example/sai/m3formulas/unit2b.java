package com.example.sai.m3formulas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class unit2b extends AppCompatActivity {
    PDFView unit2b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit2b);
        unit2b = (PDFView)findViewById(R.id.pdfunit2b);
        unit2b.fromAsset("unit22.pdf").load();
    }
}
