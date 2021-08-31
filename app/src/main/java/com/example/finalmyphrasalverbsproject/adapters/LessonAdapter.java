package com.example.finalmyphrasalverbsproject.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalmyphrasalverbsproject.R;
import com.example.finalmyphrasalverbsproject.models.Lesson;

import java.nio.file.FileSystemNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class LessonAdapter extends RecyclerView.Adapter<LessonAdapter.CardHolder> {

    ArrayList<Lesson> mDataList;
    LayoutInflater inflater;
    List<String> selectedValues;

    public LessonAdapter(Context context, ArrayList<Lesson> mLessonList) {
        inflater = LayoutInflater.from(context);
        this.mDataList = mLessonList;
        selectedValues = new ArrayList<>();
    }

    @NonNull
    @Override
    public CardHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View cardView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item,parent,false);
        return new CardHolder(cardView);
    }

    @Override
    public void onBindViewHolder(@NonNull CardHolder holder, @SuppressLint("RecyclerView") int position) {
        Lesson lesson = mDataList.get(position);
        holder.txt_lessonName.setText(mDataList.get(position).getLessonName());
        final String al = String.valueOf(mDataList.get(position));
        holder.checkBox_favorite.setText(al);
        holder.checkBox_favorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (holder.checkBox_favorite.isChecked()){
                    selectedValues.add(al);
                    Log.d("Deniz", "position: " + position);
                    deleteItem(position);
                    Log.d("Deniz", "posizyon" + position);
                }
                else{
                    selectedValues.remove(al);
                    Toast.makeText(inflater.getContext(), "iptal edildi", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }

    public void deleteItem(int position){
        mDataList.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, mDataList.size());

        //notifyDataSetChanged();
    }
    public void addItem(int position, Lesson lessonToBeCopied){
        mDataList.add(position, lessonToBeCopied);
        notifyItemInserted(position);
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
