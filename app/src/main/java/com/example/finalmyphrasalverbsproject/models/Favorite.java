package com.example.finalmyphrasalverbsproject.models;

import java.util.ArrayList;

public class Favorite {
    private String lessonVerbsName;
    private String lessonWord;
    private String lessonMean;

    public String getLessonVerbsName() {
        return lessonVerbsName;
    }

    public void setLessonVerbsName(String lessonVerbsName) {
        this.lessonVerbsName = lessonVerbsName;
    }

    public String getLessonWord() {
        return lessonWord;
    }

    public void setLessonWord(String lessonWord) {
        this.lessonWord = lessonWord;
    }

    public String getLessonMean() {
        return lessonMean;
    }

    public void setLessonMean(String lessonMean) {
        this.lessonMean = lessonMean;
    }

    public static ArrayList<Favorite> getDate() {
        ArrayList<Favorite> mDataListFavorite = new ArrayList<>();

        String[] listFavoriteWord = new String[Word.getData().size()];
        String[] listFavoriteWordMean = new String[Word.getData().size()];
        String[] listFavoriteVerb  = new String[Word.getData().size()];

        for (int i = 0; i < listFavoriteWord.length; i++){
            Favorite gecici = new Favorite();
            gecici.setLessonWord(listFavoriteWord[i]);
            gecici.setLessonMean(listFavoriteWordMean[i]);

            mDataListFavorite.add(gecici);
        }
        for (int i = 0; i < listFavoriteVerb.length; i++){
            Favorite gecici = new Favorite();
            gecici.setLessonVerbsName(listFavoriteVerb[i]);

            mDataListFavorite.add(gecici);
        }
        return mDataListFavorite;
    }

}
