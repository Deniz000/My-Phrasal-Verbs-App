package com.example.finalmyphrasalverbsproject.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalmyphrasalverbsproject.R;
import com.example.finalmyphrasalverbsproject.models.Word;

import java.util.ArrayList;

public class WordAdapter extends RecyclerView.Adapter<WordAdapter.CardHolder> {

    ArrayList<Word> mDataListWord;
    LayoutInflater inflater;

    public WordAdapter(Context context, ArrayList<Word> mDataListWord) {
        inflater = LayoutInflater.from(context);
        this.mDataListWord = mDataListWord;
    }

    @NonNull
    @Override
    public CardHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View cardView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_view_word,parent,false);
        return new WordAdapter.CardHolder(cardView);
    }

    @Override
    public void onBindViewHolder(@NonNull CardHolder holder, int position) {
        holder.txt_word.setText(mDataListWord.get(position).getWord());
        holder.txt_mean.setText(mDataListWord.get(position).getMean());
    }

    @Override
    public int getItemCount() {
        return mDataListWord.size();
    }

    public class CardHolder extends RecyclerView.ViewHolder{

        TextView txt_word, txt_mean;
        CheckBox checkBox_fav;
        public CardHolder(@NonNull View itemView) {
            super(itemView);
            txt_word = itemView.findViewById(R.id.txt_wrodNameGround);
            txt_mean = itemView.findViewById(R.id.txt_meanNameGround);
            checkBox_fav = itemView.findViewById(R.id.checkbox_favorite);

        }
    }
}
