package com.example.technova;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PeopleViewHolder extends RecyclerView.ViewHolder {

    View itemView;
    ImageView coverImageView;
    ImageView pfpImageView;
    TextView homeNameTextView;
    TextView distanceTextView;
    TextView durationTextView;

    public PeopleViewHolder(@NonNull View itemView) {
        super(itemView);
        this.itemView = itemView;
        coverImageView = itemView.findViewById(R.id.cover_imageview);
        pfpImageView = itemView.findViewById(R.id.pfp_imageview);
        homeNameTextView = itemView.findViewById(R.id.home_name_textview);
        distanceTextView = itemView.findViewById(R.id.distance_textview);
        durationTextView = itemView.findViewById(R.id.duration_textview);

    }
}
