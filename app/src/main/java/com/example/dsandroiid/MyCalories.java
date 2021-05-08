package com.example.dsandroiid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MyCalories extends AppCompatActivity {

    EditText weigh,height,age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_calories);

        weigh=findViewById(R.id.wieght_profile);
        height=findViewById(R.id.height_profile);
        age=findViewById(R.id.age_profile);


        weigh.setText("aaaa");
    }
}