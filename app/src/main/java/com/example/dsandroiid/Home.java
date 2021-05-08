package com.example.dsandroiid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class Home extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private NavigationView navigationView;
    ImageView myCalories,meal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        myCalories=findViewById(R.id.img_mycaloories);
        meal=findViewById(R.id.img_plat);

        navigationView = (NavigationView) findViewById(R.id.sideNav);
        final DrawerLayout drawerLayout=findViewById(R.id.drawerLayout);



        findViewById(R.id.imageMenu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                drawerLayout.openDrawer(GravityCompat.START);
            }

        });


        navigationView.setNavigationItemSelectedListener(this);

        navigationView.bringToFront();

        navigationView.getMenu().getItem(0).setChecked(true);
        FragmentManager fragmentManager = getSupportFragmentManager();



        myCalories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent mycalories=new Intent(Home.this,MyCalories.class);
                startActivity(mycalories);
            }
        });

        meal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent meal=new Intent(Home.this,Meal.class);
                startActivity(meal);
            }
        });



    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "You can't return", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment selectedFragment=null;
        switch(item.getItemId()){
            case R.id.Meal:
                Intent home=new Intent(Home.this,Meal.class);
                startActivity(home);
                break;

            case R.id.Mycalorie:
                Intent mycalorie=new Intent(Home.this,MyCalories.class);
                startActivity(mycalorie);
                break;

            case R.id.Food:
                Intent food=new Intent(Home.this,FoodDay.class);
                startActivity(food);
                break;
            case R.id.schedule:
                Intent schedule=new Intent(Home.this,Schedule.class);
                startActivity(schedule);
                break;
        }
        return true;
    }
}