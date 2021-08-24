package com.example.finalmyphrasalverbsproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends BaseAdapter {

    private final LayoutInflater lessonInflater;
    private final List<Lesson> lessonList;

    public CustomAdapter(Context context, List<Lesson> lessons) {
        lessonInflater = (LayoutInflater) context.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        this.lessonList = lessons;
    }

    @Override
    public int getCount() {
        return lessonList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = lessonInflater.inflate(R.layout.lesson_words_layout, null);
            }
            TextView lessonName = convertView.findViewById(R.id.txt_examplesOfWords);
            Lesson lesson = lessonList.get(position);
            lessonName.setText(lesson.getLessonName());

            return convertView;
        }
}

