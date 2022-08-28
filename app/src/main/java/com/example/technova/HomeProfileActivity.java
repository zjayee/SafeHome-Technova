package com.example.technova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class HomeProfileActivity extends AppCompatActivity {

    People person;
    int distance;
    int duration;
    ImageView pfpImageView;
    TextView homeNameTextView;
    TextView distanceTextView;
    TextView likesTextView;
    ImageView coverImageView;
    TextView bioTextView;
    TextView durationTextView;
    TextView welcomingTextView;
    TextView locatedNearTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_profile);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        person = (People)extras.getSerializable("person");
        distance = extras.getInt("distance");
        duration = extras.getInt("duration");
        
        setupViews();

    }

    void setupViews()
    {
        pfpImageView = findViewById(R.id.pfp_imageview);
        homeNameTextView = findViewById(R.id.home_name_textview);
        distanceTextView = findViewById(R.id.distance_textview);
        likesTextView = findViewById(R.id.likes_textview);
        coverImageView = findViewById(R.id.cover_imageview);
        bioTextView = findViewById(R.id.biotext_textview);
        durationTextView = findViewById(R.id.durationnumber_textview);
        welcomingTextView = findViewById(R.id.welcominglist_textview);
        locatedNearTextView = findViewById(R.id.locatednearplaces_textview);

        pfpImageView.setImageResource(person.profilePicture);
        homeNameTextView.setText(person.name);
        distanceTextView.setText(distance + "km away");

        String likes = String.valueOf(((int)(Math.random()*100)+1));
        likesTextView.setText(likes);

        coverImageView.setImageResource(person.homeCoverPicture);
        bioTextView.setText(person.bio);
        durationTextView.setText(duration + " Weeks");

        int numberPeople = (int)(Math.random()*4+1);
        Random random = new Random();
        boolean pets= random.nextBoolean();
        String welcoming = numberPeople + " people";
        if (pets){
            welcoming += ", Pets";
        }
        welcomingTextView.setText(welcoming);
        
    }

}