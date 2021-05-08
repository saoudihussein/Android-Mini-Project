package com.example.dsandroiid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MealAdapter extends ArrayAdapter<MealAtt> {

    private Context mcontext;
    private int mRessource;
    public MealAdapter(@NonNull Context context, int resource, @NonNull ArrayList<MealAtt> objects) {
        super(context, resource, objects);

        this.mcontext=context;
        this.mRessource=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=LayoutInflater.from(mcontext);
        convertView=layoutInflater.inflate(mRessource,parent,false);

        ImageView imageView=convertView.findViewById(R.id.img_list);
        TextView textView1=convertView.findViewById(R.id.txt_title);
        TextView textView2=convertView.findViewById(R.id.txt_content);

        imageView.setImageResource(getItem(position).getImage());
        textView1.setText(getItem(position).getTitle());
        textView2.setText(getItem(position).getContent());


        return convertView;
    }
}
