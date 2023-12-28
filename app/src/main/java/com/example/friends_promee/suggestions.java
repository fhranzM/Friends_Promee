package com.example.friends_promee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class suggestions extends AppCompatActivity {
    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestions);

        imageButton = (ImageButton) findViewById(R.id.backButton2);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backToFriend();
            }
        });

    }
        public void backToFriend()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    }
