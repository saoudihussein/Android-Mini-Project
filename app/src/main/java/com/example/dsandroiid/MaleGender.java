package com.example.dsandroiid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;

public class MaleGender extends AppCompatActivity {
    TextView txt_calorie;
    Button calculate,contin;
    EditText weight,height,age;

    DatabaseReference myref;
    Calories calories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_male_gender);

        calculate=findViewById(R.id.calc_male);
        contin=findViewById(R.id.male_continu);
        weight=findViewById(R.id.wieght_male);
        height=findViewById(R.id.height_male);
        age=findViewById(R.id.age_male);
        txt_calorie=findViewById(R.id.txt_male_calo);

        contin.setVisibility(View.INVISIBLE);





        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                    calc();
                   //insertdata();

            }
        });

        contin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent home=new Intent(MaleGender.this,Home.class);
                startActivity(home);
            }
        });

    }



    public void calc(){

        String  weight_txt =weight.getText().toString().trim() ;
        String  height_txt =height.getText().toString().trim();
        String age_txt = age.getText().toString().trim();




        if(weight.length()==0)
        {
            weight.setError("Please Enter your weight");
        }

        else if(height.length()==0)
        {
            height.setError("Please Enter your height");
        }

        else if(age.length()==0)
        {
            age.setError("Please Enter your age");
        }
        else{
            float  weight_ =Float.parseFloat(weight_txt) ;
            float  height_ =Float.parseFloat(height_txt);
            float age_ = Float.parseFloat(age_txt);
            float sum= (float) (66+(6.2*weight_)+(12.7*height_)-(6.76*age_));
            txt_calorie.setText(+sum+" calories");
            contin.setVisibility(View.VISIBLE);
        }

    }


}