package com.example.technova;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity {

    RecyclerView peopleRecyclerView;
    PeopleAdapter peopleAdapter;
    ImageButton viewMapButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        setupRecyclerView();
        setupButton();
    }

    void setupRecyclerView(){
        peopleRecyclerView = findViewById(R.id.people_recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        peopleRecyclerView.setLayoutManager(layoutManager);

        peopleAdapter= new PeopleAdapter(this);
        peopleRecyclerView.setAdapter(peopleAdapter);

    }

    void setupButton(){
        viewMapButton = findViewById(R.id.viewmap_button);
        viewMapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), MapActivity.class);
                startActivity(intent);
            }
        });
    }
}