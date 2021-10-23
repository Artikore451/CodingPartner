package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView backgroundImage;
    TextView poweredByLine;
    private static int SPLASH_TIMER=2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        backgroundImage=findViewById(R.id.background_image);
        poweredByLine=findViewById(R.id.powered_by_line);

        Animation sideAnim = AnimationUtils.loadAnimation(this,R.anim.side_anim);
        Animation bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_anim);

        backgroundImage.setAnimation(sideAnim);
        poweredByLine.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this,Login_user.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIMER);
    }
}

