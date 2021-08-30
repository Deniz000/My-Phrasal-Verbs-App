package com.example.finalmyphrasalverbsproject.models;

import java.util.ArrayList;

public class Word {
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

    public static ArrayList<Word> getData(){

        ArrayList<Word> dataListWord = new ArrayList<>();

        String[] listWord = {
                "word 1",
                "word 2",
                "word 3",
                "word 4",
                "word 5",
                "deneme",
                "word 6",
                "word 7",
                "word end"
        };
        String[] listMean = {
                "mean 1",
                "mean 2",
                "mean 3",
                "mean 4",
                "deneme mean",
                "mean 5",
                "mean 6",
                "mean 7",
                "mean end",
        };
        for (int i = 0; i < listWord.length; i++){
            Word gecici = new Word();
            gecici.setWord(listWord[i]);
            gecici.setMean(listMean[i]);

            dataListWord.add(gecici);
        }
        return dataListWord;
    }
}
