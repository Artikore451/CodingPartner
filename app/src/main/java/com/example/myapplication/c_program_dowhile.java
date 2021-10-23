package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;

public class c_program_dowhile extends AppCompatActivity implements View.OnClickListener {
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
                c_program_dowhile.super.onBackPressed();
            }
        });

        next=(Button) findViewById(R.id.btn1);
        next.setOnClickListener(this);


        WebView webView=findViewById(R.id.webView1);
        webView.loadUrl("file:///android_asset/c_program_dowhile.html");
    }

    @Override
    public void onClick(View view) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tutorialspoint.com/cprogramming/c_do_while_loop.htm"));
        startActivity(i);
    }
}