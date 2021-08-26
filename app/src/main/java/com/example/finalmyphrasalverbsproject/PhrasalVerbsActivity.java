package com.example.finalmyphrasalverbsproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.finalmyphrasalverbsproject.adapters.LessonAdapter;
import com.example.finalmyphrasalverbsproject.models.Lesson;

public class PhrasalVerbsActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LessonAdapter lessonAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrasal_verbs);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        lessonAdapter = new LessonAdapter(this, Lesson.getData());
        recyclerView.setAdapter(lessonAdapter);
    }
}