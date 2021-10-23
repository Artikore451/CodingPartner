package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;

public class Operator extends AppCompatActivity implements View.OnClickListener {
    ImageView backbtn;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chello_world);
        backbtn=findViewById(R.id.back_presses);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Operator.super.onBackPressed();
            }
        });

        next=(Button) findViewById(R.id.btn1);
        next.setOnClickListener(this);


        WebView webView=findViewById(R.id.webView1);
        webView.loadUrl("file:///android_asset/operator.html");
    }

    @Override
    public void onClick(View view) {
        startActivity(new Intent(this, C_Home.class));

    }
}