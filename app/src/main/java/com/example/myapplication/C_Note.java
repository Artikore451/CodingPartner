package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;

public class C_Note extends AppCompatActivity {
    ImageView backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cnote);
        backbtn=findViewById(R.id.back_presses);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                C_Note.super.onBackPressed();
            }
        });



        WebView webView=findViewById(R.id.webView1);
        webView.loadUrl("file:///android_asset/C_notes.html");
    }

}