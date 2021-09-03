package com.example.finalmyphrasalverbsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class VerbsActivity extends AppCompatActivity {

    TextView verbName, verbDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verbs);

        verbName = findViewById(R.id.txt_verb_name);
        verbDescription = findViewById(R.id.txt_verb_description);

        verbName.setText(getIntent().getStringExtra("lessonName"));
        verbDescription.setText(getIntent().getStringExtra("lessonDescription"));
    }
}