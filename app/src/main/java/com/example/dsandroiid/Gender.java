package com.example.dsandroiid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Gender extends AppCompatActivity {

    Button male,female,skip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);

        male=findViewById(R.id.male_btn);
        female=findViewById(R.id.female_btn);
        skip=findViewById(R.id.skip_gender);

        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent male=new Intent(Gender.this,MaleGender.class);
                startActivity(male);
            }
        });

        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent female=new Intent(Gender.this,FemaleGender.class);
                startActivity(female);
            }
        });

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home=new Intent(Gender.this,Home.class);
                startActivity(home);
            }
        });

    }
}