package com.example.technova;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {

    RecyclerView peopleRecyclerView;
    PeopleAdapter peopleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        setupRecyclerView();
    }

    void setupRecyclerView(){
        peopleRecyclerView = findViewById(R.id.people_recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        peopleRecyclerView.setLayoutManager(layoutManager);

        peopleAdapter= new PeopleAdapter(this);
        peopleRecyclerView.setAdapter(peopleAdapter);

    }
}