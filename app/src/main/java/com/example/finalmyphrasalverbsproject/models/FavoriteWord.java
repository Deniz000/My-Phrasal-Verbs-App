package com.example.finalmyphrasalverbsproject.models;

import java.util.ArrayList;

public class FavoriteWord {
    private String word;
    private String mean;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMean() {
        return mean;
    }

    public void setMean(String mean) {
        this.mean = mean;
    }

    public static ArrayList<FavoriteWord> getData(){
        ArrayList<FavoriteWord> mDataListFavoriteWord = new ArrayList<>();

        String[] listFavoriteWord = new String[Word.getData().size()];

        for (int i = 0; i < listFavoriteWord.length; i++){
            FavoriteWord gecici = new FavoriteWord();
            gecici.setWord(listFavoriteWord[i]);

            mDataListFavoriteWord.add(gecici);
        }
        return mDataListFavoriteWord;
     }
}
