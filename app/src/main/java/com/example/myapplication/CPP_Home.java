package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.Objects;

public class CPP_Home extends AppCompatActivity implements View.OnClickListener, NavigationView.OnNavigationItemSelectedListener {

private DrawerLayout drawerLayout;
private ActionBarDrawerToggle toogle;
private  NavigationView navigation;

    private Button logout;
    FirebaseAuth mAuth;
    public CardView card1;

    SliderView sliderView;
    int[] images = {R.drawable.slide1,
            R.drawable.slide2,
            R.drawable.slide3,
            R.drawable.slider4,
            R.drawable.slider5,
            R.drawable.slider6
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpp_home);



        TextView textView=findViewById(R.id.text_view);
        String text="Add another courses";
        SpannableString ss=new SpannableString(text);

        ClickableSpan clickableSpan=new ClickableSpan() {
            @Override
            public void onClick(@NonNull View view) {
                Intent intent=new Intent(CPP_Home.this, Available.class);
                startActivity(intent);

            }
        };

        ss.setSpan(clickableSpan,0,19, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(ss);
        textView.setMovementMethod(LinkMovementMethod.getInstance());


        sliderView = findViewById(R.id.image_slider);

        SliderAdapter sliderAdapter = new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();


        card1=(CardView)findViewById(R.id.card1);
        card1.setOnClickListener((View.OnClickListener) this);


        drawerLayout=findViewById(R.id.drawer_layout);
        navigation=findViewById(R.id.navigation_view);

        toogle=new ActionBarDrawerToggle(this,drawerLayout,R.string.start,R.string.close);
        drawerLayout.addDrawerListener(toogle);
        toogle.syncState();

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        navigation.setNavigationItemSelectedListener(this);


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_course,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(toogle.onOptionsItemSelected(item)){
            return true;
        }

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
                Intent intent1=new Intent(CPP_Home.this,Login_user.class);
                startActivity(intent1);

            default:
                return super.onOptionsItemSelected(item);
        }
    }


    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.card1:
                startActivity(new Intent(this, Operator.class));


        }
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
       switch (item.getItemId()){
           case R.id.home_menu:
               break;

           case R.id.description_menu:
               Intent intent=new Intent(CPP_Home.this, Login_user.class);
               startActivity(intent);
               break;

           case R.id.contact_menu:
               Intent intent1=new Intent(CPP_Home.this,ContactUs.class);
               startActivity(intent1);
               return true;



           case R.id.rateus_menu:
               try {
               Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=" + getApplicationContext().getPackageName());
               Intent i = new Intent(Intent.ACTION_VIEW, uri);
               startActivity(i);
           }catch(Exception e){
               Toast.makeText(this, "Unable to share this app", Toast.LENGTH_SHORT).show();

           }
               return true;

           case R.id.feedback_menu:
               Intent intent3=new Intent(CPP_Home.this, Login_user.class);
               startActivity(intent3);
               break;

           case R.id.logout_menu:
               break;

       }
       return true;
    }
}