package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class c_program extends AppCompatActivity implements View.OnClickListener{
    public CardView card1,card2,card3,card4,card5,card6,card7,card8,card9,card10,card11,card12,card13,
            card14,card15,card16,card17,card18,card19,card20,card21,card22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cprogram);

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
        card14=(CardView)findViewById(R.id.card14);
        card14.setOnClickListener(this);
        card15=(CardView)findViewById(R.id.card15);
        card15.setOnClickListener(this);
        card16=(CardView)findViewById(R.id.card16);
        card16.setOnClickListener(this);
        card17=(CardView)findViewById(R.id.card17);
        card17.setOnClickListener(this);
        card18=(CardView)findViewById(R.id.card18);
        card18.setOnClickListener(this);
        card19=(CardView)findViewById(R.id.card19);
        card19.setOnClickListener(this);
        card20=(CardView)findViewById(R.id.card20);
        card20.setOnClickListener(this);
        card21=(CardView)findViewById(R.id.card21);
        card21.setOnClickListener(this);
        card22=(CardView)findViewById(R.id.card22);
        card22.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.card1:
                startActivity(new Intent(this, c_program_helloworld.class));
                break;

            case R.id.card2:
                startActivity(new Intent(this, c_program_datatype.class));
                break;

            case R.id.card3:
                startActivity(new Intent(this, c_program_ternary_operator.class));
                break;

            case R.id.card4:
                startActivity(new Intent(this, c_program_relational_operator.class));
                break;

            case R.id.card5:
                startActivity(new Intent(this, c_program_sizeof_operator.class));
                break;

            case R.id.card6:
                startActivity(new Intent(this, c_program_arithmatic_operator.class));
                break;

            case R.id.card7:
                startActivity(new Intent(this, c_program_logical_operator.class));
                break;

            case R.id.card8:
                startActivity(new Intent(this, c_program_for.class));
                break;

            case R.id.card9:
                startActivity(new Intent(this, c_program_while.class));
                break;

            case R.id.card10:
                startActivity(new Intent(this, c_program_dowhile.class));
                break;

            case R.id.card11:
                startActivity(new Intent(this, c_program_ifelse.class));
                break;

            case R.id.card12:
                startActivity(new Intent(this, c_program_ifelseif.class));
                break;

            case R.id.card13:
                startActivity(new Intent(this, c_program_nestedifelse.class));
                break;

            case R.id.card14:
                startActivity(new Intent(this, c_program_if.class));
                break;

            case R.id.card15:
                startActivity(new Intent(this, c_program_switch.class));
                break;

            case R.id.card16:
                startActivity(new Intent(this, c_program_function.class));
                break;

            case R.id.card17:
                startActivity(new Intent(this, c_program_array.class));
                break;

            case R.id.card18:
                startActivity(new Intent(this, pointer_program.class));
                break;

            case R.id.card19:
                startActivity(new Intent(this, c_program_string.class));
                break;

            case R.id.card20:
                startActivity(new Intent(this, c_program_structure.class));
                break;

            case R.id.card21:
                startActivity(new Intent(this, c_program_union.class));
                break;

            case R.id.card22:
                startActivity(new Intent(this, c_program_filehandling.class));
                break;
        }
    }
}