package com.example.sai.m3formulas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.github.barteksc.pdfviewer.PDFView;

public class basicformulae extends AppCompatActivity {
    PDFView basicformulae;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basicformulae);
        basicformulae = (PDFView)findViewById(R.id.pdfbasicformulae);
        basicformulae.fromAsset("BASIC FORMULAE.pdf").load();
    }
}
