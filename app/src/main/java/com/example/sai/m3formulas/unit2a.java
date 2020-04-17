package com.example.sai.m3formulas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class unit2a extends AppCompatActivity {
PDFView unit2a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit2a);
        unit2a  = (PDFView)findViewById(R.id.pdfunit2a);
        unit2a.fromAsset("fourier.pdf").load();
    }
}
