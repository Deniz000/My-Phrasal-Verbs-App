package com.example.finalmyphrasalverbsproject.models;

import java.util.ArrayList;

public class Lesson {

    private String lessonName;


    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public static ArrayList<Lesson> getData() {
        ArrayList<Lesson> dataList = new ArrayList<>();

        String[] list = {
                "verb 1",
                "verbs 2",
                "verbs 3",
                "verbs 4",
                "verbs 5",
                "verbs 6",
                "verbs 7"
        };

        for (String s : list) {
            Lesson gecici = new Lesson();
            gecici.setLessonName(s);

            dataList.add(gecici);
        }
        return dataList;
    }
}
