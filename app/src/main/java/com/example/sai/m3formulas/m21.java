package com.example.sai.m3formulas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class m21 extends AppCompatActivity {
    PDFView m21;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m21);
        m21 = (PDFView)findViewById(R.id.m21);
        m21.fromAsset("m21.pdf").load();
    }
}
