package com.example.finalmyphrasalverbsproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.SearchView;

import com.example.finalmyphrasalverbsproject.adapters.WordAdapter;
import com.example.finalmyphrasalverbsproject.models.Word;

import java.util.ArrayList;
import java.util.Locale;

public class DictionaryActivity extends AppCompatActivity {


    RecyclerView recyclerView2;
    WordAdapter wordAdapter;
    android.widget.SearchView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dictionary);

        recyclerView2 = findViewById(R.id.recyclerView_word);
        searchView = findViewById(R.id.search_view_word);

        searchView.clearFocus();
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));

        wordAdapter = new WordAdapter(DictionaryActivity.this, Word.getData());
        recyclerView2.setAdapter(wordAdapter);

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
        ArrayList<Word> filteredWord = new ArrayList<>();
        for (Word item : Word.getData()){
            if (item.getWord().toLowerCase().contains(newText.toLowerCase())){
                filteredWord.add(item);
            }
            else if(item.getMean().toLowerCase().contains(newText.toLowerCase())){
                filteredWord.add(item);
            }
            wordAdapter.filterList(filteredWord);
        }
    }
}