package com.example.finalmyphrasalverbsproject.models;

import java.util.ArrayList;

public class Lesson {

    private String lessonName;
    private String lessonDescription;
    private int imgLesson;

    public String getLessonDescription() {
        return lessonDescription;
    }

    public void setLessonDescription(String lessonDescription) {
        this.lessonDescription = lessonDescription;
    }

    public int getImgLesson() {
        return imgLesson;
    }

    public void setImgLesson(int imgLesson) {
        this.imgLesson = imgLesson;
    }

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
                "verbs 2",
                "verbs 2",
                "verbs 2",
                "verbs 2",
                "verbs 2",
                "verbs 3",
                "verbs 3",
                "verbs 3",
                "verbs 3",
                "verbs 3",
                "verbs 3",
                "verbs 4",
                "verbs 6",
                "verbs 6",
                "verbs 6",
                "verbs 7"
        };
        String[] listDescription = {
                "Description 1",
                "Description 2",
                "Description 2",
                "Description 2",
                "Description 2",
                "Description 2",
                "Description 2",
                "Description 3",
                "Description 3",
                "Description 3",
                "Description 3",
                "Description 3",
                "Description 3",
                "Description 4",
                "Description 6",
                "Description 6",
                "Description 6",
                "Description 7"
        };

        for (int i = 0; i < list.length; i++) {
            Lesson gecici = new Lesson();
            gecici.setLessonName(list[i]);
            gecici.setLessonDescription(listDescription[i]);

            dataList.add(gecici);
        }
        return dataList;
    }
}
