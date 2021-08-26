package com.example.finalmyphrasalverbsproject;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LessonAdapter extends RecyclerView.Adapter<LessonAdapter.CardHolder> {

    private ArrayList<Lesson> mDataList;
    LayoutInflater inflater;

    public LessonAdapter(Context context, ArrayList<Lesson> lessonList) {
        inflater = LayoutInflater.from(context);
        this.mDataList = lessonList;
    }

    @NonNull
    @Override
    public CardHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View cardView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item,parent,false);
        return new CardHolder(cardView);
    }

    @Override
    public void onBindViewHolder(@NonNull CardHolder holder, int position) {
        holder.txt_lessonName.setText(mDataList.get(position).getLessonName());
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    public class CardHolder extends RecyclerView.ViewHolder{

        public TextView txt_lessonName;
        public CheckBox checkBox_favorite;
        public CardHolder(@NonNull View itemView) {
            super(itemView);
            txt_lessonName = itemView.findViewById(R.id.txt_lessonNameGround);
            checkBox_favorite = itemView.findViewById(R.id.checkbox_favorite);


        }
    }
}
