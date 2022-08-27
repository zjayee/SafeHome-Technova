package com.example.technova;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PeopleAdapter extends RecyclerView.Adapter<PeopleViewHolder> {

    Context context;

    //constructor
    PeopleAdapter(@NonNull Context context){
        this.context = context;
    }

    @NonNull
    @Override
    public PeopleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View itemView = inflater.inflate(R.layout.person_card,parent,false);
        PeopleViewHolder viewHolder = new PeopleViewHolder(itemView);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull PeopleViewHolder holder, int position) {
        People person = DataStorage.helpList.get(position);
        holder.pfpImageView.setImageResource(person.profilePicture);
        holder.coverImageView.setImageResource(person.homeCoverPicture);
        holder.homeNameTextView.setText(new StringBuilder().append(person.name).append("'s Home").toString());
        int distance = (int)(Math.random()*10)+1;
        holder.distanceTextView.setText(new StringBuilder().append(distance).append("km away").toString());
        int duration = (int)(Math.random()*10)+1;
        holder.durationTextView.setText(new StringBuilder().append(duration).append(" week duration").toString());
    }

    @Override
    public int getItemCount() {
        return DataStorage.helpList.size();
    }
}
