package com.example.dsandroiid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Meal extends AppCompatActivity {
    ListView listView;
   // String title[]={"Breakfest,Lunch,Dinner,SnackHot,Snack"};
    //String desc[]={"Breakfest,Lunch,Dinner,SnackHot,Snack"};
    //int image[]={R.mipmap.food,R.mipmap.food,R.mipmap.food,R.mipmap.food,R.mipmap.food};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal);

        listView=findViewById(R.id.list_meal);

        ArrayList<MealAtt> arrayList=new ArrayList<>();
        arrayList.add(new MealAtt(R.mipmap.breackfast,"Breakfast","4 egs+100+oatmeal(100g)+Peanut Burger(10g) "));
        arrayList.add(new MealAtt(R.mipmap.snack,"Snack ","protein bar+water with lemon"));
        arrayList.add(new MealAtt(R.mipmap.lunch,"Lunch","chicken(200g)+rice(100g)+potato(200g)"));
        arrayList.add(new MealAtt(R.mipmap.rice,"Dinner","chicken(200g)+rice(100g)+potato(200g)"));
        arrayList.add(new MealAtt(R.mipmap.snack2,"Snack ","banana+almonds(50g)+yogurt(100g)"));
        arrayList.add(new MealAtt(R.mipmap.preworkout,"Pre-Workout","banana+Coffee"));
        arrayList.add(new MealAtt(R.mipmap.lunch,"Lunch","Macaroni(150g)+Chicken(200g)+Potato(100g)"));
        arrayList.add(new MealAtt(R.mipmap.snack,"Snack","banana+2 yogurt(100g)"));
        arrayList.add(new MealAtt(R.mipmap.pump,"Pump","banana+protein(dose)+oatmeal(100g)"));
        arrayList.add(new MealAtt(R.mipmap.breackfast,"Breakfast","banana+oatmeal(100g)+3egs"));
        arrayList.add(new MealAtt(R.mipmap.power,"Power","BCAA+CREATIN(dose)"));


        MealAdapter mealAdapter=new MealAdapter(this,R.layout.row,arrayList);
        listView.setAdapter(mealAdapter);

    }


}