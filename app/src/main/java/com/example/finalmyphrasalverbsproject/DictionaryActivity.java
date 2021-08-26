package com.example.finalmyphrasalverbsproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.finalmyphrasalverbsproject.adapters.LessonAdapter;
import com.example.finalmyphrasalverbsproject.adapters.WordAdapter;
import com.example.finalmyphrasalverbsproject.models.Lesson;
import com.example.finalmyphrasalverbsproject.models.Word;

public class DictionaryActivity extends AppCompatActivity {


    RecyclerView recyclerView2;
    WordAdapter wordAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dictionary);

        recyclerView2 = findViewById(R.id.recyclerView_word);
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));

        wordAdapter = new WordAdapter(this, Word.getData());
        recyclerView2.setAdapter(wordAdapter);
    }
}