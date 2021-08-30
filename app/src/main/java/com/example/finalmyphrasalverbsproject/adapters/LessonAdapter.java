package com.example.finalmyphrasalverbsproject.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalmyphrasalverbsproject.R;
import com.example.finalmyphrasalverbsproject.models.Lesson;

import java.util.ArrayList;

public class LessonAdapter extends RecyclerView.Adapter<LessonAdapter.CardHolder> {

    ArrayList<Lesson> mDataList;
    LayoutInflater inflater;

    public LessonAdapter(Context context, ArrayList<Lesson> mLessonList) {
        inflater = LayoutInflater.from(context);
        this.mDataList = mLessonList;
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

    public void moveItem(int position, Lesson itemtogo){
        Intent intent = new Intent();
        mDataList.remove(position);
    }
    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    public void filterList(ArrayList<Lesson> filteredList){
        mDataList = filteredList;
        notifyDataSetChanged();
    }

    public static class CardHolder extends RecyclerView.ViewHolder{

        public TextView txt_lessonName;
        public CheckBox checkBox_favorite;
        public CardHolder(@NonNull View itemView) {
            super(itemView);
            txt_lessonName = itemView.findViewById(R.id.txt_lessonNameGround);
            checkBox_favorite = itemView.findViewById(R.id.checkbox_favorite_verb);

            if (checkBox_favorite.isChecked()){

            }
        }
    }
}
