package com.example.finalmyphrasalverbsproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;


import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


public class MainActivity extends AppCompatActivity {

    CardView cardView1, cardView2, cardView3, cardView4;
    RelativeLayout profile_layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardView1 = findViewById(R.id.card_phrasalVerbs);
        cardView2 = findViewById(R.id.card_dictionary);
        cardView3 = findViewById(R.id.card_favorities);
        profile_layout = findViewById(R.id.profile_ground);
        cardView4 = findViewById(R.id.card_test);


        cardView1.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, PhrasalVerbsActivity.class)));
        cardView2.setOnClickListener(v -> startActivity(new Intent(MainActivity.this,DictionaryActivity.class)));
        cardView3.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, FavoriteActivity.class)));
        profile_layout.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ProfileActivity.class)));
        cardView4.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, LearnActivity.class)));
    }
}