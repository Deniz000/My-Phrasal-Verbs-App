package com.example.finalmyphrasalverbsproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;

import com.example.finalmyphrasalverbsproject.adapters.LessonAdapter;
import com.example.finalmyphrasalverbsproject.models.Lesson;

import java.util.ArrayList;
import java.util.Locale;

public class PhrasalVerbsActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LessonAdapter lessonAdapter;
    androidx.appcompat.widget.SearchView searchView;
    CheckBox checkBox;
    ArrayList<Lesson> lessonArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrasal_verbs);

        recyclerView = findViewById(R.id.recyclerView);
        searchView = findViewById(R.id.search_view_phrasal_verbs);
        checkBox = findViewById(R.id.checkbox_favorite_verb);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        lessonAdapter = new LessonAdapter(this, Lesson.getData());
        recyclerView.setAdapter(lessonAdapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filter(newText);
                return false;
            }
        });
    }

    private void filter(String newText) {
        ArrayList<Lesson> filteredList = new ArrayList<>();
        for(Lesson item: Lesson.getData()){
            if (item.getLessonName().toLowerCase().contains(newText.toLowerCase())) {
                filteredList.add(item);
            }
        }
        lessonAdapter.filterList(filteredList);
    }
}