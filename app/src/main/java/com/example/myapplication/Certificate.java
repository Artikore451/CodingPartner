package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Certificate extends AppCompatActivity implements View.OnClickListener {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_certificate);

        button=findViewById(R.id.btn);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        startActivity(new Intent(this, courses.class));

    }
}