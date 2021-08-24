package com.example.finalmyphrasalverbsproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.disposables.CompositeDisposable;

public class PhrasalVerbsActivity extends AppCompatActivity {


    final List<Lesson> lessons = new ArrayList<>();
    private CustomAdapter adapter;
    private Lesson lesson;
    ListView listView;
    SearchView searchView;
    CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrasal_verbs);


        listView = findViewById(R.id.list_lessons);
        searchView = findViewById(R.id.search_view);

        lessons.add(new Lesson("in"));
        lessons.add(new Lesson("on"));
        lessons.add(new Lesson("at"));
        lessons.add(new Lesson("at"));
        lessons.add(new Lesson("at"));
        lessons.add(new Lesson("at"));
        lessons.add(new Lesson("at"));
        lessons.add(new Lesson("at"));
        lessons.add(new Lesson("at"));

        adapter = new CustomAdapter(getApplicationContext(), lessons);

        listView.setAdapter(adapter);
    }
}