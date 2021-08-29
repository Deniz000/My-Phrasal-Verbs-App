package com.example.finalmyphrasalverbsproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.SearchView;

import com.example.finalmyphrasalverbsproject.adapters.LessonAdapter;
import com.example.finalmyphrasalverbsproject.models.Lesson;

import java.util.ArrayList;
import java.util.Locale;

public class PhrasalVerbsActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LessonAdapter lessonAdapter;
    SearchView searchView;
    CheckBox checkBox;
    ArrayList<Lesson> lessonArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrasal_verbs);

        recyclerView = findViewById(R.id.recyclerView);
        checkBox = findViewById(R.id.checkbox_favorite_verb);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        lessonAdapter = new LessonAdapter(this, Lesson.getData());
        recyclerView.setAdapter(lessonAdapter);

    }
}