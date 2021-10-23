package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.ramotion.paperonboarding.PaperOnboardingFragment;
import com.ramotion.paperonboarding.PaperOnboardingPage;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class ProfileActivity extends AppCompatActivity {

    Timer timer;

    private FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        fragmentManager=getSupportFragmentManager();
        final PaperOnboardingFragment paperOnboardingFragment= PaperOnboardingFragment.newInstance(getDataForOnBoarding());
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container,paperOnboardingFragment);
        fragmentTransaction.commit();

        //change afterwords all the three activity is performing in one
        timer= new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent=new Intent(ProfileActivity.this,CPP_Home.class);
                startActivity(intent);
                finish();
            }
        },5000);

    }

    private ArrayList<PaperOnboardingPage> getDataForOnBoarding() {
        //color background white and change image to welcome image
        PaperOnboardingPage srci1=new PaperOnboardingPage("WELCOME !","To build your personal curriculum",Color.parseColor("#3aa8c1"),R.drawable.gif,R.drawable.pop);
        //color background blue and change image to gif image
        PaperOnboardingPage srci2=new PaperOnboardingPage("Learn to Code","Anytime,Anywhere",Color.parseColor("#95B300"),R.drawable.gif,R.drawable.pop);
        //color background white and change image to book image
        PaperOnboardingPage srci3=new PaperOnboardingPage("Built Your Coder Profile","Advance Your Car",Color.parseColor("#c9ebff"),R.drawable.gif,R.drawable.pop);


        ArrayList<PaperOnboardingPage> elements=new ArrayList<>();
        elements.add(srci1);
        elements.add(srci2);
        elements.add(srci3);


        return elements;
    }
}