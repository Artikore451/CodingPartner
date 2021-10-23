package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Available extends AppCompatActivity implements View.OnClickListener {
private CardView card1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_available);


        card1=(CardView)findViewById(R.id.card20);
        card1.setOnClickListener((View.OnClickListener) this);

    }
    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.card1:
                startActivity(new Intent(this, C_Home.class));
                break;


        }
    }
}