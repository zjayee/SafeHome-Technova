package com.example.technova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    View screenView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataStorage.populate_helpList();
        DataStorage.populate_needList();

        screenView = findViewById(R.id.screen_view);

        screenView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Start select activity
                Intent intent = new Intent(getBaseContext(), SelectActivity.class);
                startActivity(intent);
            }
        });
    }
}