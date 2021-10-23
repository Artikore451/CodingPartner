package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class courses extends AppCompatActivity implements View.OnClickListener{
    private Button logout;
    FirebaseAuth mAuth;
    public CardView card1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        card1=(CardView)findViewById(R.id.card1);
        card1.setOnClickListener((View.OnClickListener) this);



    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_course,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {

            case R.id.share_menu:
                try {
                    Intent i = new Intent(Intent.ACTION_SEND);
                    i.setType("text/plain");
                    i.putExtra(Intent.EXTRA_SUBJECT, "Diplomsa ghjhkjh");
                    i.putExtra(Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id=" + getApplicationContext().getPackageName());
                    startActivity(Intent.createChooser(i, "Share With"));
                }catch(Exception e){
                    Toast.makeText(this, "Unable to share this app", Toast.LENGTH_SHORT).show();

                }
                return true;

            case R.id.logout_menu:
                Intent intent1=new Intent(courses.this,Login_user.class);
                startActivity(intent1);
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.card1:
                startActivity(new Intent(this, C_Home.class));
                break;

            case R.id.card2:
                startActivity(new Intent(this, CPP_Home.class));
                break;
        }
    }
}