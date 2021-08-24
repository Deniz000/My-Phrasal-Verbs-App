package com.example.finalmyphrasalverbsproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.finalmyphrasalverbsproject.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    CardView cardView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardView1 = findViewById(R.id.card_phrasalVerbs);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, PhrasalVerbsActivity.class));
            }
        });
    }
}