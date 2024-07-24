package com.example.planetapp;

import android.content.Context;
import android.media.metrics.PlaybackErrorEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter<Planet> {
    private ArrayList<Planet> planetArrayList;
    Context context;

    public MyCustomAdapter(@NonNull Context context, int resource, ArrayList<Planet> planetArrayList, Context context1) {
        super(context, R.layout.list_layout, planetArrayList);
        this.planetArrayList = planetArrayList;
        this.context = context1;
    }

    private static class MyViewHolder{
        TextView planetName;
        TextView moonCount;
        ImageView planetImage;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Planet planet = getItem(position);

        MyViewHolder myViewHolder;
        final View result;

        if (convertView == null){
            myViewHolder = new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.list_layout, parent, false);

            myViewHolder.moonCount = (TextView) convertView.findViewById(R.id.Moon);
            myViewHolder.planetImage = (ImageView) convertView.findViewById(R.id.imageview);
            myViewHolder.planetName = (TextView) convertView.findViewById(R.id.PlanetName);

            result = convertView;
            convertView.setTag(myViewHolder);
        }else{
            myViewHolder = (MyViewHolder) convertView.getTag();
            result = convertView;
        }

        myViewHolder.planetName.setText(planet.getPlanetName());
        myViewHolder.planetImage.setImageResource(planet.getPlanetImage());
        myViewHolder.moonCount.setText(planet.getMoonCount());
        return result;
    }
}
