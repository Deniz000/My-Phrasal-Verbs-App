package com.example.finalmyphrasalverbsproject.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalmyphrasalverbsproject.R;
import com.example.finalmyphrasalverbsproject.VerbsActivity;
import com.example.finalmyphrasalverbsproject.models.FavoriteVerb;
import com.example.finalmyphrasalverbsproject.models.Lesson;

import java.util.ArrayList;
import java.util.List;

public class LessonAdapter extends RecyclerView.Adapter<LessonAdapter.CardHolder> {

    ArrayList<Lesson> mDataList;
    ArrayList<FavoriteVerb> mDataListCopy;
    LayoutInflater inflater;
    List<String> selectedValues;
    Context context;

    public LessonAdapter(Context context, ArrayList<Lesson> mLessonList) {
        inflater = LayoutInflater.from(context);
        this.mDataList = mLessonList;
        selectedValues = new ArrayList<>();
        this.context = context;
    }

    @NonNull
    @Override
    public CardHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View cardView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new CardHolder(cardView);
    }

    @Override
    public void onBindViewHolder(@NonNull CardHolder holder, @SuppressLint("RecyclerView") int position) {
        Lesson lesson = mDataList.get(position);
        holder.txt_lessonName.setText(mDataList.get(position).getLessonName());

        final String al = String.valueOf(mDataList.get(position));
        holder.checkBox_favorite.setText(al);
        holder.checkBox_favorite.setOnClickListener(v -> {
            if (holder.checkBox_favorite.isChecked()) {
                selectedValues.add(al);
                Toast.makeText(inflater.getContext(), "seçildi" + (position + 1), Toast.LENGTH_SHORT).show();
            } else {
                selectedValues.remove(al);
                Toast.makeText(inflater.getContext(), "iptal edildi" + (position + 1), Toast.LENGTH_SHORT).show();
            }
        });

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, VerbsActivity.class);
            intent.putExtra("lessonName", lesson.getLessonName());
            intent.putExtra("lessonDescription", lesson.getLessonDescription());

            context.startActivity(intent);
        });


    }

    //    public void deleteItem(int position){
//        mDataList.remove(position);
//        notifyItemRemoved(position);
//        notifyItemRangeChanged(position, mDataList.size());
//        //notifyDataSetChanged();
//    }
//    public void copyİtem(int position, Lesson lessonToBeCopied){
//
//    }
    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    public void filterList(ArrayList<Lesson> filteredList) {
        mDataList = filteredList;
        notifyDataSetChanged();
    }

    public static class CardHolder extends RecyclerView.ViewHolder {

        public TextView txt_lessonName;
        public CheckBox checkBox_favorite;

        public CardHolder(@NonNull View itemView) {
            super(itemView);
            txt_lessonName = itemView.findViewById(R.id.txt_lessonNameGround);
            checkBox_favorite = itemView.findViewById(R.id.checkbox_favorite_verb);

        }
    }
}
