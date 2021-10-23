package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class pointer_program extends AppCompatActivity implements View.OnClickListener {
    ImageView backbtn;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cprogram_helloworld);
        backbtn=findViewById(R.id.back_presses);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pointer_program.super.onBackPressed();
            }
        });

        next=(Button) findViewById(R.id.btn1);
        next.setOnClickListener(this);


        WebView webView=findViewById(R.id.webView1);
        webView.loadUrl("file:///android_asset/c_program_pointers.html");
    }

    @Override
    public void onClick(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.onlinegdb.com/fork/HkYr8q7a8"));
        startActivity(i);
    }
}

