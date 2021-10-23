
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cppcertificate extends AppCompatActivity implements View.OnClickListener {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cppcertificate);
        button=findViewById(R.id.btn);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        startActivity(new Intent(this, courses.class));

    }
}



