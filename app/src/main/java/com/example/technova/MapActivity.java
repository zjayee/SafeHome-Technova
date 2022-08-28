package com.example.technova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MapActivity extends AppCompatActivity {

    ImageButton viewListButton;
    ImageButton openProfileButton1;
    ImageButton openProfileButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        setupButtons();
    }

    void setupButtons(){
        viewListButton = findViewById(R.id.viewlist_button);
        viewListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), HomeActivity.class);
                startActivity(intent);
            }
        });

        openProfileButton1 = findViewById(R.id.openprofile1_button);
        openProfileButton2 = findViewById(R.id.openprofile2_button);

    }
}