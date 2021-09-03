package com.example.finalmyphrasalverbsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class WordActivity extends AppCompatActivity {

    TextView txt_Word, wordMean, wordSentence1, wordSentence2, wordSentence3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word);

        txt_Word = findViewById(R.id.txt_word_name);
        wordMean = findViewById(R.id.txt_word_means);
        wordSentence1 = findViewById(R.id.txt_word_sentence_1);
        wordSentence2 = findViewById(R.id.txt_word_sentence_2);
        wordSentence3 = findViewById(R.id.txt_word_sentence_3);

        txt_Word.setText(getIntent().getStringExtra("word"));
        wordMean.setText(getIntent().getStringExtra("means"));

    }
}