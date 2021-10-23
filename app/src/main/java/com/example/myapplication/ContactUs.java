package com.example.myapplication;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.google.android.material.navigation.NavigationView;

public class ContactUs extends AppCompatActivity {
    Button btSend;
    private final int ID_HOME = 1;
    private final int ID_CONTACT = 2;
    private final int ID_PROFILE = 3;
    private final int ID_PROGRAM = 4;
    private final int ID_CERTIFICATE = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

    }
}