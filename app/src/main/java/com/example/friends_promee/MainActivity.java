package com.example.friends_promee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton imageButton;
    private ImageButton imageButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButton = (ImageButton) findViewById(R.id.addButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSuggestion();
            }
        });


        imageButton2 = (ImageButton) findViewById(R.id.friend1Button);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFriendsProfile();
            }
        });

    }

    public void openSuggestion()
    {
        Intent intent = new Intent(this, suggestions.class);
        startActivity(intent);
    }

    public void openFriendsProfile()
    {
        Intent intent = new Intent(this, friends_profile.class);
        startActivity(intent);
    }

}