package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class C_language extends AppCompatActivity implements View.OnClickListener{
Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clanguage);
        next=(Button) findViewById(R.id.btn1);
        next.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        startActivity(new Intent(this, C_Hello_World.class));
    }
}