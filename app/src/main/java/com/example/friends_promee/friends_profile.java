package com.example.friends_promee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class friends_profile extends AppCompatActivity {
    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends_profile);

        imageButton = (ImageButton) findViewById(R.id.backButton3);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backToMainAct();
            }
        });
    }

    public void backToMainAct()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}