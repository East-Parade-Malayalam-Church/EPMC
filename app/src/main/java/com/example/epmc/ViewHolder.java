package com.example.epmc;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class ViewHolder extends RecyclerView.ViewHolder {

    View mview;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        mview = itemView;
    }
    public void setName(String Name)
    {
        TextView mhead = mview.findViewById(R.id.name);
        mhead.setText(Name);
        //Log.d("Fam",head);
    }
    public void setPicture(String Picture)
    {
        ImageView fpic = mview.findViewById(R.id.pic);
        Picasso.get().load(Picture).into(fpic);
        //Log.d("Pic",image);
    }
    public void setArea(String Area)
    {
        TextView mpg = mview.findViewById(R.id.pgroup);
        mpg.setText(Area);
        //Log.d("PrayerGroup",prayergp);
    }
    public void setHparish(String HomeParish){
        TextView mhp = mview.findViewById(R.id.hpsh);
        mhp.setText(HomeParish);
        //Log.d("HomeParish",hparish);
    }
}
