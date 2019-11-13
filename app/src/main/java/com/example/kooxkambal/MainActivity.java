package com.example.kooxkambal;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

import java.util.logging.Handler;

public class MainActivity extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home);
        CardView cardView;
        CardView cardView2;
        CardView cardView3;
        CardView cardView4;
        CardView cardView5;
        CardView cardView6;
        CardView cardView7;
        CardView cardView8;

        cardView = findViewById(R.id.carduno);
        cardView.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
           Intent a = new Intent(MainActivity.this, historia.class);
           startActivity(a);}
        });

        cardView2 = findViewById(R.id.carddos);
        cardView2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, zonas.class);
                startActivity(a);}
        });

        cardView3 = findViewById(R.id.cardtres);
        cardView3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, religion.class);
                startActivity(a);}
        });

        cardView4 = findViewById(R.id.cardcuatro);
        cardView4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, videos.class);
                startActivity(a);}
        });

        cardView5 = findViewById(R.id.cardcinco);
        cardView5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, agricultura.class);
                startActivity(a);}
        });

        cardView6 = findViewById(R.id.cardseis);
        cardView6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, astronomia.class);
                startActivity(a);}
        });

        cardView7 = findViewById(R.id.cardsiete);
        cardView7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, tihosuco.class);
                startActivity(a);}
        });

        cardView8 = findViewById(R.id.cardocho);
        cardView8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, carrillo.class);
                startActivity(a);}
        });

        /* new Handler().postDelayed(new Runnable(){
          @Override
           public void run() {
               Create an Intent that will start the Menu-Activity.
                Intent mainIntent = new Intent(MainActivity.this,Principal.class);
                MainActivity.this.startActivity(mainIntent);
               MainActivity.this.finish();
            }
      },600); */




    }}

