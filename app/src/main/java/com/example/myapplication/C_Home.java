package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

public class C_Home extends AppCompatActivity implements View.OnClickListener{
    private final int ID_HOME = 1;
    private final int ID_NOTES = 3;
    private final int ID_PROFILE = 4;
    private final int ID_PROGRAM = 2;
    private final int ID_CERTIFICATE = 5;
    MeowBottomNavigation bottonNavigation;
    public CardView card1,card2,card3,card4,card5,card6,card7,card8,card9,card10,card11,card12,card13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chome);

        card1=(CardView)findViewById(R.id.card1);
        card1.setOnClickListener(this);
        card2=(CardView)findViewById(R.id.card2);
        card2.setOnClickListener(this);
        card3=(CardView)findViewById(R.id.card3);
        card3.setOnClickListener(this);
        card4=(CardView)findViewById(R.id.card4);
        card4.setOnClickListener(this);
        card5=(CardView)findViewById(R.id.card5);
        card5.setOnClickListener(this);
        card6=(CardView)findViewById(R.id.card6);
        card6.setOnClickListener(this);
        card7=(CardView)findViewById(R.id.card7);
        card7.setOnClickListener(this);
        card8=(CardView)findViewById(R.id.card8);
        card8.setOnClickListener(this);
        card9=(CardView)findViewById(R.id.card9);
        card9.setOnClickListener(this);
        card10=(CardView)findViewById(R.id.card10);
        card10.setOnClickListener(this);
        card11=(CardView)findViewById(R.id.card11);
        card11.setOnClickListener(this);
        card12=(CardView)findViewById(R.id.card12);
        card12.setOnClickListener(this);
        card13=(CardView)findViewById(R.id.card13);
        card13.setOnClickListener(this);


        bottonNavigation=findViewById(R.id.bottom_nav);
        bottonNavigation.add(new MeowBottomNavigation.Model(1,R.drawable.ic_home));
        bottonNavigation.add(new MeowBottomNavigation.Model(2,R.drawable.ic_programs));
        bottonNavigation.add(new MeowBottomNavigation.Model(4,R.drawable.ic_profile));
        bottonNavigation.add(new MeowBottomNavigation.Model(3,R.drawable.ic_notes));
        bottonNavigation.add(new MeowBottomNavigation.Model(5,R.drawable.ic_certificate));

        bottonNavigation.setOnShowListener(new MeowBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {
                Toast.makeText(C_Home.this, "clicked item:" + item.getId(), Toast.LENGTH_SHORT).show();

            }
        });




        bottonNavigation.setOnShowListener(new MeowBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {
                String name;
                switch (item.getId()) {
                    case ID_HOME:
                        name ="HOME";

                        break;

                    case ID_PROFILE:
                        name = "STATUS";
                        Intent intent2=new Intent(C_Home.this,ProfileActivity.class);
                        startActivity(intent2);
                        finish();
                        break;

                    case ID_PROGRAM:
                        name = "PROGRAM";
                        Intent intent3=new Intent(C_Home.this,c_program.class);
                        startActivity(intent3);
                        finish();

                        break;
                    case ID_NOTES:
                        name = "NOTES";
                        Intent intent4=new Intent(C_Home.this,C_Note.class);
                        startActivity(intent4);
                        finish();
                        break;
                    case ID_CERTIFICATE:
                        name = "CERTIFICATE";
                        Intent intent5=new Intent(C_Home.this,Certificate.class);
                        startActivity(intent5);
                        finish();
                        break;
                    default:
                        name = "";

                }


            }
        });

        bottonNavigation.setCount(ID_PROGRAM,"4");
        bottonNavigation.show(ID_HOME,true);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.card1:
                startActivity(new Intent(this, C_language.class));
                break;

            case R.id.card2:
                startActivity(new Intent(this, dataType.class));
                break;

            case R.id.card3:
                startActivity(new Intent(this, Operator.class));
                break;

            case R.id.card4:
                startActivity(new Intent(this, Loop.class));
                break;

            case R.id.card5:
                startActivity(new Intent(this, Function.class));
                break;

            case R.id.card6:
                startActivity(new Intent(this, Array.class));
                break;


            case R.id.card7:
                startActivity(new Intent(this, FunctionOnArray.class));
                break;

            case R.id.card8:
                startActivity(new Intent(this, pointers.class));
                break;

            case R.id.card9:
                startActivity(new Intent(this, FunctionOnPointer.class));
                break;

            case R.id.card10:
                startActivity(new Intent(this, Stringsinc.class));
                break;

            case R.id.card11:
                startActivity(new Intent(this, Structure.class));
                break;

            case R.id.card12:
                startActivity(new Intent(this, FileHandling.class));
                break;

            case R.id.card13:
                startActivity(new Intent(this, FileHandling.class));
                break;
        }

        }
}