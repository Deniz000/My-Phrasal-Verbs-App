package com.example.finalmyphrasalverbsproject.models;

import java.util.ArrayList;

public class FavoriteVerb {
    private String lessonVerbsName;

    // constuctor oluşturup id leri o şekilde de alabilirim

    public String getLessonVerbsName() {
        return lessonVerbsName;
    }

    public void setLessonVerbsName(String lessonVerbsName) {
        this.lessonVerbsName = lessonVerbsName;
    }


    public static ArrayList<FavoriteVerb> getDate() {
        ArrayList<FavoriteVerb> mDataListFavoriteVerb = new ArrayList<>();

        String[] listFavoriteVerb  = new String[Lesson.getData().size()];

        for (int i = 0; i < listFavoriteVerb.length; i++){
            FavoriteVerb gecici = new FavoriteVerb();
            gecici.setLessonVerbsName(listFavoriteVerb[i]);

            mDataListFavoriteVerb.add(gecici);
        }
        return mDataListFavoriteVerb;
    }

}
