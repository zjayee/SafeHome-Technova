package com.example.technova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectActivity extends AppCompatActivity {

    Button offerButton;
    Button needButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        setupViews();
    }

    void setupViews(){
        offerButton = findViewById(R.id.offer_button);
        needButton = findViewById(R.id.need_button);

        offerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DataStorage.userType = UserType.OFFERHELP;
                navigateToHome();
            }
        });

        needButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DataStorage.userType = UserType.NEEDHELP;
                navigateToHome();
            }
        });
    }

    void navigateToHome(){
        Intent intent = new Intent(getBaseContext(), MapActivity.class);
        startActivity(intent);
    }
}